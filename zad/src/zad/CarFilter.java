package zad;

import java.util.ArrayList;
import java.util.List;

public class CarFilter implements IFilter {
	/*
	 *
	 * Wyszukiwanie po nazwie
	 * 
	 */
	@Override
	public List<Cars> searchByName(String nameKey, List<Cars> list) {
		// TODO Auto-generated method stub
		List<Cars> finalList = new ArrayList<Cars>();
		
		for(Cars d : list) {		
		if(d.getName() != null && d.getName().contains(nameKey)) {			
			//ELEMENT PRZEFILTROWANY
			finalList.add(d);			
		}
		else {
			// nie dodawaj elementu
		}
		}
		return finalList;
	}
	/*
	 *
	 * Wyszukiwanie po cenie
	 * 
	 */
	@Override
	public List<Cars> searchByPrice(float minPrice, float maxPrice, List<Cars> list) {
		List<Cars> finalList = new ArrayList<Cars>();
		
		for(Cars d : list) {
		
			if(d.getPrice()>minPrice && d.getPrice()<maxPrice) {
				finalList.add(d);
			}
			else {
				// nie dodawaj elementu
			}	
		}
		return finalList;						
	}
	/*
	 *
	 * Wyszukiwanie po dacie utworzenia
	 * 
	 */
	@Override
	public List<Cars> searchByCreationDate(String date, List<Cars> list) {
		List<Cars> finalList = new ArrayList<Cars>();
		for(Cars d : list) {
			
			if(d.getCreationDate().compareTo(date)>=0) {				
				finalList.add(d);				
			}
			else {
				// nie dodawaj elementu 
			}
			}
		return finalList;
	}
	/*
	 *
	 * Wyszukiwanie po roku produkcji
	 * 
	 */
	@Override
	public List<Cars> searchByDateOfProduction(int year, List<Cars> list) {
		List<Cars> finalList = new ArrayList<Cars>();
		for(Cars d : list) {
		if(d.getDateOfProduction()==year) {
			finalList.add(d);
		}
		else {
			// nie dodawaj elementu 
		}
		
	}
		return finalList;
	}
	/*
	 *
	 * Wyszukiwanie po przebiegu
	 * 
	 */
	@Override
	public List<Cars> searchByMileage(int minMileage,int maxMileage, List<Cars> list) {
		List<Cars> finalList = new ArrayList<Cars>();
		for(Cars d : list) {
		if(d.getMileage()>minMileage && d.getMileage()<maxMileage) {
			finalList.add(d);
		}
		else {
			// nie dodawaj elementu 
		}
		}
		return finalList;
	}

	

}
