package service;

import java.util.ArrayList;

import dao.MapRouteDAO;
import model.MapRoute;
import model.Route;

public class MapRouteService {
	
	MapRoute rotas;
	
	public MapRouteService() {
		
	}
	
	public MapRoute createMapRoute(int n) {
		rotas = new MapRoute(n);
		return rotas;
	}
	
	public void addRoute(int x, int y, Route route) {
		if(x <= rotas.getQuantidade())
			rotas.setRoute(x, y, route);
	}
	
	public void removeRoute(int x, int y) {
		if((x <= rotas.getQuantidade()) && (y <= rotas.getQuantidade())) {
//			rotas.getRoute(x, y).setCityOrigin(null);
//			rotas.getRoute(x, y).setCityDistin(null);
//			rotas.getRoute(x, y).setDistance(0);
//			rotas.getRoute(x, y).setId(0);
			rotas.setRoute(x, y, null);
		}
	}
	
	public ArrayList<Route> getRoute(float distancia) {
		return MapRouteDAO.getCordRoute(distancia);
	}
	
	public float getDistancia(int x, int y) {
		return MapRouteDAO.getDistRoute(x, y);
	}
	
	public MapRoute getRotas() {
		return this.rotas;
	}
}
