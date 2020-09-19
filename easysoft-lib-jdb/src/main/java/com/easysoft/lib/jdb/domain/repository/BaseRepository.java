package com.easysoft.lib.jdb.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> , JpaSpecificationExecutor<T> {

	<S extends T> Iterable<S> insertInBatch(Iterable<S> entities, int size);
	
	<S extends T> Iterable<S> updateInBatch(Iterable<S> entities, int size);
}
