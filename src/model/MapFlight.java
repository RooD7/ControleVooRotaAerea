package model;

import java.util.HashMap;
import java.util.Map;

public class MapFlight {

	private Map<Airport, Airport> hashFlight;	
	
	public MapFlight() {
		this.hashFlight = new HashMap<>();
	}

	public Map<Airport, Airport> getHashFlight() {
		return hashFlight;
	}

	public void setHashFlight(Map<Airport, Airport> hashFlight) {
		this.hashFlight = hashFlight;
	}

	public int getTamanho() {
		return this.hashFlight.size();
	}
	
}
