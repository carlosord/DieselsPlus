package ${package}.business.impl;

import ${package}.model.exception.BusinessException;

public interface Command<T> {
	
	T execute() throws BusinessException;

}
