package model;

import java.util.ArrayList;

public class Airport {

	private String name;
	private City city;
	private ArrayList<Flight> voos;
	
	public Airport(String name, City city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public ArrayList<Flight> getVoos() {
		return voos;
	}

	public void setVoos(ArrayList<Flight> voos) {
		this.voos = voos;
	}
	
}
