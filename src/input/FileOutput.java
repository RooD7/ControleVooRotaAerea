package input;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

import model.City;
import model.MapRoute;
import model.Route;
import service.MapFlightService;

public class FileOutput {
	
	MapFlightService flight;
	MapRoute route;
	City[] citys;
	
	public FileOutput(MapFlightService flight, MapRoute route) {
		this.flight = flight;
		this.route = route;
	}
	public FileOutput(MapRoute mapRotas, City[] citys) {
		this.route = mapRotas;
		this.citys = citys;
	}
	
	// Carrega arquivo de saida	---	OK!
	public void Salve(String nomeArq) throws IOException {
		Document doc = new Document();
        
		Element root = new Element("structure");
		Element auto = new Element("automaton");
		Element type = new Element("type");
		type.setText("fa");
		root.addContent(type);
		root.addContent(auto);
		         
		double xl = 175.0;
		double yl = 150.0;
		
		Route rot;
//		Percorre apenas a diagonal principal da matriz
		for (int i = 0; i < citys.length; i++) {
//			Cria estados usando as cidades
		
			Element state = new Element("state");
			Attribute id = new Attribute("id",Integer.toString(citys[i].getId()));
			Attribute name = new Attribute("name",citys[i].getName());
			state.setAttribute(id);
			state.setAttribute(name);
			
//				Define posicao aeroporto
			Element x = new Element("x");
			Element y = new Element("y");
			x.setText(Double.toString(xl));
			y.setText(Double.toString(yl));
			state.addContent(x);
			state.addContent(y);
			
//				Escreve no arquivo
			auto.addContent(state);
			xl += 75;
			yl += 50;
		}
//		Route rot;
//		for (int i = 0; i < route.getRotas().getQuantidade(); i++) {
//			for (int j = 0; j < route.getRotas().getQuantidade(); j++) {
//				rot = this.route.getRotas().getRoute(i, j);
//			}
//		}
		
//			if(this.getEstadoInicial() == e) {
//				Element init = new Element("initial");
//				state.addContent(init);
//	        }
//	        if(this.getEstadoFinal().contains(e)) {
//	        	Element fini = new Element("final");
//				state.addContent(fini);
//	        }

		rot = null;
//		Percorre apenas a diagonal principal da matriz
		for (int i = 0; i < route.getQuantidade(); i++) {
			for (int j = 0; j < route.getQuantidade(); j++) {
//				Cria Rotas
				rot = this.route.getRoute(i, j);
				if ((rot != null) && (rot.getDistance() != -1)) {
					Element trs = new Element("transition");
					Element from = new Element("from");
					Element to = new Element("to");
					Element read = new Element("read");
	//				Seta rotas
					from.setText(Integer.toString(rot.getCityOrigin().getId()));
					to.setText(Integer.toString(rot.getCityDistin().getId()));
					read.setText(Float.toString(rot.getDistance()));
					trs.addContent(from);
					trs.addContent(to);
					trs.addContent(read);
	//				Escreve no arquivo
					auto.addContent(trs);
				}
			}
		}
         
		doc.setRootElement(root);
		         
		XMLOutputter xout = new XMLOutputter();
		OutputStream out = new FileOutputStream( new File(nomeArq));
		xout.output(doc , out);
	}
}
