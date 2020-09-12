package com.easysoft.lib.jdb.infrastructure;
 
import com.easysoft.lib.jdb.domain.repository.BaseRepository;

import java.util.Iterator;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

public class BaseRepositoryImpl<T, ID>  extends SimpleJpaRepository<T, ID>  implements BaseRepository<T, ID> {

	private EntityManager em;

	public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager em) {
		super(entityInformation, em);
		this.em = em;

	}

	public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
		this.em = em;
	}

	@Override
	@Transactional
	public <S extends T> Iterable<S> insertInBatch(Iterable<S> entities, int size) {
		Iterator<S> iterator = entities.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			this.em.persist(iterator.next());
			index++;
			if (index % size == 0) {
				this.em.flush();
				this.em.clear();
			}
		}
		if (index % size != 0) {
			this.em.flush();
			this.em.clear();
		}
		return entities;
	}
	
	@Override
	@Transactional
	public <S extends T> Iterable<S> updateInBatch(Iterable<S> entities, int size) {
		Iterator<S> iterator = entities.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			this.em.merge(iterator.next());
			index++;
			if (index % size == 0) {
				this.em.flush();
				this.em.clear();
			}
		}
		if (index % size != 0) {
			this.em.flush();
			this.em.clear();
		}
		return entities;
	}
}
