package input;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import model.City;
import model.Route;

public class FileReader {

	private City city1;
	private City city2;
	private Route rota;
	private ArrayList<City> idCitys = new ArrayList<City>();
	private ArrayList<Route> rotas = new ArrayList<Route>();
	
//	le o arquivo de entrada e retorna vetor de rotas
	public void readFile(String fileStr) {
		try {
			String[] values;
			@SuppressWarnings("resource")
			Scanner in = new Scanner(new File(fileStr));
			while (in.hasNextLine()) {
			    String line = in.nextLine();
			    System.out.println(line);
			    values = line.split(" ");
			    
//			    Nova Cidade 1
			    city1 = new City();
			    city1.setId(Integer.parseInt(values[0]));
			    city1.setName("city"+values[0]);
			    
//			    Nova Cidade 2
			    city2 = new City();
			    city2.setId(Integer.parseInt(values[1]));
			    city2.setName("city"+values[1]);
			    
//			    Nova Rota entre Cidade 1 e Cidade 2
			    rota = new Route(city1, city2, Float.parseFloat(values[2]));
			    
//			    Armazena nova rota criada
			    rotas.add(rota);
			    
//				Usa idCitys sera usada para criar Mapa de Rotas no Main
			    if(!idCitys.contains(city1))
			    	idCitys.add(city1);	
			    if(!idCitys.contains(city2))
			    	idCitys.add(city2);	
			}
		} 
		catch(Exception e) {
			System.err.println(e);
		}
	}

	public ArrayList<City> getIdCitys() {
		return idCitys;
	}

	public ArrayList<Route> getRotas() {
		return rotas;
	}
}
