package com.project.Librarybackend.dao;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface EntitiesDAO <T> {

	    T add(T entity);
	    List<T> getList();
	    T update(T entity);
	    T findById(int id);
	    void delete(int id);
	}

