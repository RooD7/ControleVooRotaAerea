package service;

import main.ControlCenter;
import model.City;
import model.MapRoute;
import model.Route;

public class RouteService {

	public RouteService() {
		
	}
	
	// Criar Route
	public Route createRoute(City origem, City destino, float distancia) {
		return new Route(origem, destino, distancia);
	}
	
	// Adicionar  Route
	public void addRoute(Route route) {
		ControlCenter.getRoutes().add(route);
	}
	
	// Remover Route
	public void removeRoute(Route route) {
		ControlCenter.getRoutes().remove(route);
	}
	
	// Existe a Rota no mapRoute
	public static boolean existRoute(Route route) {

		MapRoute rotas = ControlCenter.getMapRoute();
		
		for (int x = 0; x < rotas.getQuantidade(); x++) {
			for (int y = 0; y < rotas.getQuantidade(); y++) {
				if(rotas.getRoute(x, y).equals(route))
					return true;
			}
		}
		return false;
	}
	
	// Existe a Rota no mapRoute
	public static boolean existRoute(City destino, City origem) {
		
		MapRoute rotas = ControlCenter.getMapRoute();
		
		for (int x = 0; x < rotas.getQuantidade(); x++) {
			for (int y = 0; y < rotas.getQuantidade(); y++) {
				if(rotas.getRoute(x, y).getCityOrigin().equals(origem) && 
						rotas.getRoute(x, y).getCityDistin().equals(destino))
					return true;
			}
		}
		return false;
	}
}
