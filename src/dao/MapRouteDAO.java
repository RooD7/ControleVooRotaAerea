package dao;

import java.util.ArrayList;

import model.Route;
import model.MapRoute;

public class MapRouteDAO {

	private MapRoute rotas;
	
	public MapRouteDAO(MapRoute rotas) {
		this.rotas = rotas;
	}
	
	// Array com as rotas que possuem determinada distancia
	public ArrayList<Route> getCordRoute(int distancia) {
		
		ArrayList<Route> aux = new ArrayList<Route>();
		
		for (int x = 0; x < rotas.getQuantidade(); x++) {
			for (int y = 0; y < rotas.getQuantidade(); y++) {
				if(distancia == rotas.getRoute(x, y).getDistance()) {
					aux.add(rotas.getRoute(x, y));
				}
			}
		}
		if(aux.isEmpty())
			return null;
		return aux;
	}

	// retorna distancia segundo as coordenas x, y
	public float getDistRoute(int x, int y) {
		return rotas.getRoute(x, y).getDistance();
	}
	
}
