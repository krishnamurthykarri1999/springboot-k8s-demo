package com.getJob.Optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfProduct {

	public static List<Product> getProducts() {
		return Arrays.asList(new Product(101, "iPhone 15", "Mobile", 85000),
				new Product(102, "Samsung Galaxy S23", "Mobile", 70000),
				new Product(103, "OnePlus 11", "Mobile", 55000), new Product(104, "Redmi Note 13", "Mobile", 18000),
				new Product(105, "MacBook Pro", "Laptop", 150000), new Product(106, "Dell XPS 15", "Laptop", 120000),
				new Product(107, "HP Pavilion", "Laptop", 60000), new Product(108, "Sony Bravia 55inch", "TV", 80000),
				new Product(109, "LG Smart TV 50inch", "TV", 60000), new Product(110, "Nike Shoes", "Footwear", 8000),
				new Product(111, "Adidas Sneakers", "Footwear", 9000),
				new Product(112, "Puma Sports Shoes", "Footwear", 7500));
	}

	public static void main(String[] args) {

		List<Product> list = getProducts().stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed())
				.limit(3).collect(Collectors.toList());

//		list.forEach(System.out::println);

		getProducts().stream().sorted().toList().forEach(System.out::println);

	}

}

class Product implements Comparable<Product> {

	private int id;
	private String name;
	private String category;
	private double price;

	public Product(int id, String name, String category, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return id + " - " + name + " (" + category + ") : " + price;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Double.compare(this.price, o.price);

	}

}
