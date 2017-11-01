package model;

public class MapRoute {

	private Route[][] routes;
	private int quantidade;
	
	public MapRoute(int i) {
		this.routes = new Route[i][i];
		this.quantidade = i;
	}

	public Route getRoute(int i, int j) {
		return routes[i][j];
	}
	
	public Route[][] getRoutes() {
		return routes;
	}
	public void setRoutes(Route[][] routes) {
		this.routes = routes;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
