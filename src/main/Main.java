package main;

import java.io.IOException;
import java.util.ArrayList;

import input.FileOutput;
import input.FileReader;
import model.Airport;
import model.City;
import model.MapRoute;
import model.Route;

public class Main {

	public static void main(String[] args) {
		
		MapRoute mapRotas;
		ArrayList<Route> rotas = new ArrayList<Route>();
		ArrayList<City> idCitys = new ArrayList<City>();
		ArrayList<Airport> Airports = new ArrayList<Airport>();
		
		System.out.println("Hello World!");
		System.out.println("Lendo...");
		
//		Lendo arquivo de entrada
		FileReader fileReader = new FileReader();
		fileReader.readFile("/home/rood/eclipse-workspace/ControleVooRotaAerea/src/map.txt");
		
		FileOutput fileOutput;
		
//		salvando rotas e id das cidades
		rotas = fileReader.getRotas();
		idCitys = fileReader.getIdCitys();
		
		// Criando Aeroportos
		Airport aux;
		for (City c : idCitys) {
			aux = new Airport("Airport"+c.getId(), c);
			Airports.add(aux);
		}
		
//		City newCity1 = new City();
//		City newCity2 = new City();
//		
//		newCity1 = null;
//		if (newCity1 == null) {
//			System.out.println("INICIA NULL");
//		}
//		
//		newCity1.setId(1);
//		newCity1.setName("brasil");
//		newCity2.setId(1);
//		newCity2.setName("brasil");
//		if(newCity1.equals(newCity2))
//			System.out.println("IGUAL CARAI");
//		else
//			System.out.println("Diferente");
		
//		Criando mapa de rotas
		mapRotas = new MapRoute(idCitys.size());
		mapRotas.setRoute(rotas.toArray(new Route[rotas.size()]), idCitys.toArray(new City[idCitys.size()]));
		
		System.out.println("\n\n");
		System.out.println("MATRIZ DE ADJACENCIA ");
		System.out.println("\n\n");
		
		mapRotas.imprimirMapRoute();
		
		System.out.println("ESCREVENDO SAIDA JFLAP ");
		fileOutput = new FileOutput(mapRotas, idCitys.toArray(new City[idCitys.size()]));
		try {
			fileOutput.Salve("MapRoute.jff");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finalizado...");
	}

}
