package service;

import java.util.ArrayList;

import model.Airport;
import model.MapFlight;

public class MapFlightService {

	private MapFlight voos;
	
	public MapFlightService(MapFlight voos) {
		this.voos = voos;
	}
	

	public void addMapFlight(Airport key, ArrayList<Airport> values) {
		for (Airport v : values) {
			voos.getHashFlight().put(key, v);
		}
	}
	
	public void addMapFlight(Airport key, Airport value) {
		voos.getHashFlight().put(key, value);
	}
	
	public void removeMapFlight(Airport key) {
		voos.getHashFlight().remove(key);
	}
	
	public void removeMapFlight(Airport key, Airport value) {
		voos.getHashFlight().remove(key, value);
	}
	
	public boolean containsKey(Airport key) {
		return voos.getHashFlight().containsKey(key);
	}
	
	public Airport searchKey(Airport key) {
		return voos.getHashFlight().get(key);
	}

	public MapFlight getVoos() {
		return voos;
	}

	public void setVoos(MapFlight voos) {
		this.voos = voos;
	}
	
}
