package com.cts.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {
	
	@Id
	private int id;
	private String name;
	private int price;
	private int volume;
	private java.sql.Date date;
	
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int price ,int volume) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.volume=volume;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", price=" + price + " , volume=" + volume +"]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
	   this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	

}
