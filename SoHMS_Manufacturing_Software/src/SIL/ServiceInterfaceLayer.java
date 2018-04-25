package SIL;

import java.util.HashSet;

public class ServiceInterfaceLayer {

	//Attributes
	private HashSet<RH_SIL> ressource_SILs;
	
	//Constructors
	public ServiceInterfaceLayer(){
		this.ressource_SILs = new HashSet<RH_SIL>();
	}
	//Getters & Setters
	public HashSet<RH_SIL> getRessource_SILs() {
		return ressource_SILs;
	}

	public void setRessource_SILs(HashSet<RH_SIL> ressource_SILs) {
		this.ressource_SILs = ressource_SILs;
	}

	//Methods
	public RH_SIL getRHSILByClass(Class rhSILClass) {
		for (RH_SIL rh_SIL : ressource_SILs) {
			if(rh_SIL.getClass()== rhSILClass){
				return rh_SIL;
			}
		}
		return null;
	}
	
	public void AssociateSIL2Ressource(RH_SIL r) {
    	this.ressource_SILs.add(r);
    }
}
