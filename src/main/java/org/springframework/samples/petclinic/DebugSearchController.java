package org.springframework.samples.petclinic;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DebugSearchController {

	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("/debug/owners")
	public Object searchOwners(@RequestParam String lastName) {
		String sql = "SELECT * FROM owners WHERE last_name = '" + lastName + "'";
		Query query = entityManager.createNativeQuery(sql);
		return query.getResultList();
	}

}