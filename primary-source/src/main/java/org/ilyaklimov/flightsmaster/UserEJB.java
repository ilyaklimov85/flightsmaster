package org.ilyaklimov.flightsmaster;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;

@Stateless
public class UserEJB {
	@Inject
	@PersistenceContext(unitName = "userPU")
	private EntityManager entityManager;
	
	public @NotNull User createUser(@NotNull User user){
		entityManager.persist(user);
		return user;
	}
	
	public @NotNull User updateUser(@NotNull User user){
		entityManager.merge(user);
		return user;
	}
	
	public void deleteUser(@NotNull User user){
		entityManager.remove(user);
	}

}
