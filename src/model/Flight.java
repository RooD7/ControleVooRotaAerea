package model;

import java.util.ArrayList;

public class Flight {
	private City cityOrigin;
	private City cityDistin;
	private float distancia;
	private ArrayList<City> stops;
	private float time;
	
	
	public Flight(City cityOrigin, City cityDistin) {
		this.cityOrigin = cityOrigin;
		this.cityDistin = cityDistin;
	}
	
	public City getOrigem() {
		return cityOrigin;
	}
	public void setOrigem(City cityOrigin) {
		this.cityOrigin = cityOrigin;
	}
	public City getDestino() {
		return cityDistin;
	}
	public void setDestino(City cityDistin) {
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
	
}
