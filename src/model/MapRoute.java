package model;

import java.util.Arrays;

public class MapRoute {

	private Route[][] routes;
	private int quantidade;
	
	public MapRoute(int i) {
		this.routes = new Route[i][i];
		this.quantidade = i;
		iniciaMap();
	}
	
	public void iniciaMap() {
		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < quantidade; j++) {
				this.routes[i][j] = new Route();
			}
		}
	}

	public Route getRoute(int i, int j) {
		return this.routes[i][j];
	}
	
	public Route[][] getRoutes() {
		return this.routes;
	}
	public void setRoutes(Route[][] routes) {
		this.routes = routes;
	}
	public void setRoute(int x, int y, Route route) {
		this.routes[x][y] = route;
		City aux = route.getCityOrigin();
		route.setCityOrigin(route.getCityDistin());
		route.setCityDistin(aux);
		this.routes[y][x] = route;
	}
	public void setRoute(Route[] rotas, City[] citys) {
		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < quantidade; j++) {
				for (int k = 0; k < rotas.length; k++) {
					if(i != j) {
	//					preeche matriz de rotas, se as cidades forem as correspondentes
						if((rotas[k].getCityOrigin().equals(citys[i])) &&
								(rotas[k].getCityDistin().equals(citys[j]))) {
							this.setRoute(i, j, rotas[k]);
//							System.out.println(i+" "+j+" "+routes[i][j].getDistance());
						}
					}
				}
			}
		}
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void imprimirMapRoute() {
		System.out.println("\n\n");
		String str = "";
		for (int i = 0; i < this.quantidade; i++) {
			for (int j = 0; j < this.quantidade; j++) {
//				Rota nao vazia
				if(this.routes[i][j].getDistance() != -1) {
					str += Float.toString(this.routes[i][j].getDistance())+" - ";
//					System.out.println(Float.toString(this.routes[i][j].getDistance())+"\t");
				}
//				rota vazia
				else
					str += "N - ";
			}
			System.out.println(str);
			str = "";
		}
		System.out.println(str);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantidade;
		result = prime * result + Arrays.deepHashCode(routes);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapRoute other = (MapRoute) obj;
		if (quantidade != other.quantidade)
			return false;
		if (!Arrays.deepEquals(routes, other.routes))
			return false;
		return true;
	}
}
