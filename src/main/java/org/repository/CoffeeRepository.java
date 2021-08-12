package org.repository;

import org.model.Coffee;

import java.util.Collection;

/**
 * @author liva
 */

public interface CoffeeRepository {

	Collection<Coffee> getCoffees();

	Coffee getCoffee(String name);
}
