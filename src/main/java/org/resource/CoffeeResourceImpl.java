package org.resource;

import org.model.Coffee;
import org.repository.CoffeeRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collection;

/**
 * @author liva
 */

@ApplicationScoped
public class CoffeeResourceImpl implements CoffeeResource{

	@Inject
	CoffeeRepository coffeeRepository;

	@Override
	public Collection<Coffee> getCoffees() {
		return coffeeRepository.getCoffees();
	}

	@Override
	public Coffee getCoffee(String name) {
		return coffeeRepository.getCoffee(name);
	}
}
