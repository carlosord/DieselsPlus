package ${package}.business.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import ${package}.model.exception.BusinessException;
import ${package}.persistence.util.Jpa;
import ${package}.business.impl.Command;

public class CommandExecutor {
	
	public static <T> T execute(Command<T> command) throws BusinessException {
		EntityManager em = Jpa.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try {
			trx.begin();
			T res = command.execute();
			trx.commit();
			
			return res;
		} catch (PersistenceException | BusinessException e) {
			if (trx.isActive()) trx.rollback();
			throw e;
		} finally {
			if (em.isOpen()) em.close();
		}
	}

}