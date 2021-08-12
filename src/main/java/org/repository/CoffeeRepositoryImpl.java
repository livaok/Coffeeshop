package org.repository;

import org.model.Coffee;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author liva
 */

@ApplicationScoped
public class CoffeeRepositoryImpl implements CoffeeRepository{

	static Collection<Coffee> coffees = new ArrayList<>();

	static {
		Coffee arabica = new Coffee(1, "Arabica");
		Coffee mokko = new Coffee(2, "mokko");

		coffees.add(arabica);
		coffees.add(mokko);
	}

	@Override
	public Collection<Coffee> getCoffees() {
		return coffees;
	}

	@Override
	public Coffee getCoffee(String name) {
		return (Coffee) coffees.stream().filter(coffee -> coffee.getName().equals(name));
	}
}
