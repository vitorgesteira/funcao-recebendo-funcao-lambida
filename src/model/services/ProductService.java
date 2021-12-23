package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	//filtra a lista e soma os valores
	//a função vai receber uma lista e ja recebe o predicado definido externamente
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for(Product p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
