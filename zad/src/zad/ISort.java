package zad;

import java.util.List;

public interface ISort {
	
	List<Cars> sortAscByPrice(List<Cars> list);
	List<Cars> sortDescByPrice(List<Cars> list);
	List<Cars> sortAscByDateOfProduction(List<Cars> list);
	List<Cars> sortDescByDateOfProduction(List<Cars> list);
	List<Cars> sortAscByCreationDate(List<Cars> list);
	List<Cars> sortDescByCreationDate(List<Cars> list);
	List<Cars> sortAscByName(List<Cars> list);
	List<Cars> sortDescByName(List<Cars> list);
}