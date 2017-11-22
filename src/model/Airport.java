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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((voos == null) ? 0 : voos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (voos == null) {
			if (other.voos != null)
				return false;
		} else if (!voos.equals(other.voos))
			return false;
		return true;
	}
	
	
}
