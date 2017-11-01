package dao;

import java.util.ArrayList;

import model.City;
import model.Flight;

public class FlightDAO {

	//Flight city;
	
	public FlightDAO() {
		//city = new Flight(cityOrigin, cityDistin);
	}
	
	// Array com as cidades de origem, paradas e destino do voo
	public static ArrayList<City> getCitiesFlight(Flight voo) {
		
		ArrayList<City> aux = new ArrayList<City>();
		
		aux.add(voo.getOrigem());
		aux.addAll(voo.getStops());
		aux.add(voo.getDestino());
		
		return aux;
	}
}
