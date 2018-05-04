package zad;

import java.util.Collections;
import java.util.Comparator;

public class Cars implements Comparable<Cars>{
	
	private String name;
	private float price;
	private String creationDate;
	private int dateOfProduction;
	private int mileage;
	
	public String getName() {
		return name.toUpperCase();
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public int getDateOfProduction() {
		return dateOfProduction;
	}
	public void setDateOfProduction(int dateOfProduction) {
		this.dateOfProduction = dateOfProduction;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Cars() {
		//konstruktor bezargumentowy
	}
	public Cars(String name,float price,String creationDate,int dateOfProduction,int mileage) {
		this.name = name;
		this.price = price;
		this.creationDate = creationDate;
		this.dateOfProduction = dateOfProduction;
		this.mileage = mileage;
	}
	// funkcja odpowiedzialna za sortowanie po nazwie rosn¹co i malej¹co (zastosowane Collections.sort() i Collections.reverse())
	@Override
	public int compareTo(Cars a) {
		// TODO Auto-generated method stub
		return name.compareTo(a.name.toUpperCase());
	}	
	// funkcja odpowiedzialna za sortowanie po cenie rosn¹co
	 public static Comparator<Cars> sortAscByPrice = new Comparator<Cars>() {

			public int compare(Cars s1, Cars s2) {
			   float price1 = s1.getPrice();
			   float price2 = s2.getPrice();
			return (int) (price1-price2);
		    }};
	
	 // funkcja odpowiedzialna za sortowanie po cenie malej¹co
    public static Comparator<Cars> sortDescByPrice = new Comparator<Cars>() {

    	public int compare(Cars s1, Cars s2) {
			float price1 = s1.getPrice();
			float price2 = s2.getPrice();			  
		return (int) (price2-price1);
    	}};
		
	// funkcja odpowiedzialna za sortowanie po roku produkcji rosn¹co
	public static Comparator<Cars> sortAscByDateOfProduction = new Comparator<Cars>() {

		public int compare(Cars s1, Cars s2) {
			float dateOfProduction1 = s1.getPrice();
			float dateOfProduction2 = s2.getPrice();			  
		return (int) (dateOfProduction1-dateOfProduction2);
		 }};
			    
	// funkcja odpowiedzialna za sortowanie po roku produkcji malej¹co
	public static Comparator<Cars> sortDescByDateOfProduction = new Comparator<Cars>() {

		public int compare(Cars s1, Cars s2) {
		float dateOfProduction1 = s1.getPrice();
		float dateOfProduction2 = s2.getPrice();			  
	return (int) (dateOfProduction2-dateOfProduction1);
	}};
	
	// funkcja odpowiedzialna za sortowanie po dacie zgloszenia od najstarszej 
	public static Comparator<Cars> sortAscByCreationDate = new Comparator<Cars>() {

		public int compare(Cars s1, Cars s2) {
			String creationDate1 = s1.getCreationDate().toUpperCase();
			String creationDate2 = s2.getCreationDate().toUpperCase();
		return creationDate1.compareTo(creationDate2);		        	  
		}};
	// funkcja odpowiedzialna za sortowanie po dacie zgloszenia od najmlodszej
	public static Comparator<Cars> sortDescByCreationDate = new Comparator<Cars>() {

		public int compare(Cars s1, Cars s2) {
			String creationDate1 = s1.getCreationDate().toUpperCase();
			String creationDate2 = s2.getCreationDate().toUpperCase();
		return creationDate2.compareTo(creationDate1);
		}};
	// wyœwietlane wartoœci
	public String toString() {
		return "Nazwa og³oszenia: " + getName() + " || "
				+ "Cena: " + getPrice() + "z³ || " 
				+ "Data utworzenia zg³oszenia: " + getCreationDate() + " || " 
				+ "Data produkcji: " + getDateOfProduction() + "r. || "
				+ "Przebieg: " + getMileage() + "km || " + "\n";
	}	
}
