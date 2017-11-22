package model;

import java.util.ArrayList;

public class Flight {
	
	private City cityOrigin;
	private City cityDistin;
	private Route route;
	private float distancia;
	private ArrayList<City> stops;
	private float time;

	
	public Flight(City cityOrigin, City cityDistin) {
		this.cityOrigin = cityOrigin;
		this.cityDistin = cityDistin;
	}
	
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	public ArrayList<City> getStops() {
		return stops;
	}
	public void setStops(ArrayList<City> stops) {
		this.stops = stops;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}

	public City getCityOrigin() {
		return cityOrigin;
	}

	public void setCityOrigin(City cityOrigin) {
		this.cityOrigin = cityOrigin;
	}

	public City getCityDistin() {
		return cityDistin;
	}

	public void setCityDistin(City cityDistin) {
		this.cityDistin = cityDistin;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityDistin == null) ? 0 : cityDistin.hashCode());
		result = prime * result + ((cityOrigin == null) ? 0 : cityOrigin.hashCode());
		result = prime * result + Float.floatToIntBits(distancia);
		result = prime * result + ((route == null) ? 0 : route.hashCode());
		result = prime * result + ((stops == null) ? 0 : stops.hashCode());
		result = prime * result + Float.floatToIntBits(time);
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
		Flight other = (Flight) obj;
		if (cityDistin == null) {
			if (other.cityDistin != null)
				return false;
		} else if (!cityDistin.equals(other.cityDistin))
			return false;
		if (cityOrigin == null) {
			if (other.cityOrigin != null)
				return false;
		} else if (!cityOrigin.equals(other.cityOrigin))
			return false;
		if (Float.floatToIntBits(distancia) != Float.floatToIntBits(other.distancia))
			return false;
		if (route == null) {
			if (other.route != null)
				return false;
		} else if (!route.equals(other.route))
			return false;
		if (stops == null) {
			if (other.stops != null)
				return false;
		} else if (!stops.equals(other.stops))
			return false;
		if (Float.floatToIntBits(time) != Float.floatToIntBits(other.time))
			return false;
		return true;
	}
	
	
}
