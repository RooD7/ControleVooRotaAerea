package main;

import java.util.ArrayList;

import model.Airport;
import model.City;
import model.Flight;
import model.MapRoute;
import model.Route;
import service.RouteService;

public class ControlCenter {

	private static ArrayList<City> citys;
	private static ArrayList<Airport> airports;
	private static ArrayList<Flight> flights;
	private static ArrayList<Route> routes;
	private static MapRoute mapRoute;
	
	public ControlCenter() {
		
	}
	
	public static void addCity(City city) {
		if(!existCity(city))
			citys.add(city);
	}
	
	public static void addAirport(Airport airport) {
		if(!existAirport(airport))
			airports.add(airport);
	}
	
	public static void addRoute(Route route) {
		if(!existRoute(route))
			routes.add(route);
	}
	
	public static void removeCity(City city) {
		if(existCity(city))
			citys.remove(city);
	}
	
	public static void removeAirport(Airport airport) {
		if(existAirport(airport))
			airports.remove(airport);
	}
	
	public static void removeRoute(Route route) {
		if(existRoute(route))
			routes.remove(route);
	}
	
	public static boolean existCity(City city) {
		
		for (City c : citys) {
			if(c.getName().equals(city.getName()))
				return true;
		}
		return false;
	}
	
	public static boolean existAirport(Airport airport) {
		
		for (Airport a : airports) {
			if((a.getName().equals(airport.getName())) &&
					(a.getCity().equals(airport.getCity())))
				return true;
		}
		return false;
	}
	
	public static boolean existRoute(Route route) {
		
		if(RouteService.existRoute(route))
			return true;

		return false;
	}
	
	
	
	
	public ArrayList<City> getCitys() {
		return citys;
	}
	public ArrayList<Airport> getAirports() {
		return airports;
	}

	public static MapRoute getMapRoute() {
		return mapRoute;
	}

	public static void setMapRoute(MapRoute mapRoute) {
		ControlCenter.mapRoute = mapRoute;
	}

	public static ArrayList<Route> getRoutes() {
		return routes;
	}

	public static void setRoutes(ArrayList<Route> routes) {
		ControlCenter.routes = routes;
	}

	public static ArrayList<Flight> getFlights() {
		return flights;
	}	
	
}
