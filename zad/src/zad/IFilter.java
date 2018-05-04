package zad;

import java.util.List;

public interface IFilter {
	
	List<Cars> searchByName(String nameKey, List<Cars> list);
	List<Cars> searchByPrice(float minPrice, float maxPrice,List<Cars> list);
	List<Cars> searchByCreationDate(String date,List<Cars> list);
	List<Cars> searchByDateOfProduction(int year,List<Cars> list);
	List<Cars> searchByMileage(int minmileage,int maxMileage,List<Cars> list);	
}