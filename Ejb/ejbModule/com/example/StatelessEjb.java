package com.example;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class StatelessEjb
 */
@Stateless
@LocalBean
public class StatelessEjb implements StatelessEjbRemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public StatelessEjb() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void insert(String name) {
		entityManager.persist(new User(name));
		
	}

}
