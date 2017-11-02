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
	
}
