package ProductManagement;

import java.io.File;
import java.util.ArrayList;

import MService.MService;

public class ProductHolon {
  
	//Attributes 
	private int id;
	private ArrayList<Product> products;
	
	//constructors
	public ProductHolon() {
	}
	
	//methods
	//This method will be called once we declare the list of products and it its own services  
	public void InitialiseProducts(File f) {
		/*le traitement ici est sp�cificifique � l'ontology products.
		  le d�roulement de l'initialisation d�pend de la struture de d�claration des produit.
		*/
	}
	
	public void addProduct(int id, String description,ArrayList<MService> services){
		 Product p = new Product(id, description, services);
		 products.add(p);
	}
}
