package model;

public class Route {
	
	private int id;
	private City cityOrigin;
	private City cityDistin;
	private float distance;

	public Route(City origem, City destino, float distancia) {
		this.cityOrigin = origem;
		this.cityDistin = destino;
		this.distance = distancia;
	}
	
	// Rota vazia
	public Route() {
		this.distance = -1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityDistin == null) ? 0 : cityDistin.hashCode());
		result = prime * result + ((cityOrigin == null) ? 0 : cityOrigin.hashCode());
		result = prime * result + Float.floatToIntBits(distance);
		result = prime * result + id;
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
		Route other = (Route) obj;
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
		if (Float.floatToIntBits(distance) != Float.floatToIntBits(other.distance))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
