package service;

import main.ControlCenter;
import model.City;
import model.Flight;
import model.Route;

public class FlightService {
	
	public FlightService(Route rotas) {
		
	}
	
	// Criar Voo
	public Flight createFlight(City origem, City destino) {
		// Se as cidades existem, e existe uma rota entre elas, criar voo
		if(ControlCenter.existCity(origem) && ControlCenter.existCity(destino))
			if(RouteService.existRoute(origem, destino)) {
				// Pode existir 2 voos com a mesma cidade de origem e destino
				return new Flight(origem, destino);
			}
		
		return null;
	}
	
	// Adicionar Voo no Aeroporto
	public void addFlightAirport(Flight voo) {
				
		// Se origem e destino do voo não possui uma rota, não adicionar
	}
	
}
