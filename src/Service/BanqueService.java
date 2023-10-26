package Service;

public class BanqueService  {
	
	 private double montant;
	 private double diff;
	  
	 private List<Compte> comptes = new ArrayList<>();

	 
public BanqueService(double montant,double diff) {
		super();
		this.montant = montant;
		this.diff=diff;
	}

public double getMontant() {
	return montant;
}

public void setMontant(double montant) {
	this.montant = montant;
}


public double getDiff() {
	return diff;
}

public void setDiff(double diff) {
	this.diff = diff;
}

public double conversion (double montant)
{
	
	return montant *0.1;
}


}
