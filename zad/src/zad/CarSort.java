package zad;

import java.util.Collections;
import java.util.List;

public class CarSort implements ISort{

	@Override
	public List<Cars> sortAscByPrice(List<Cars> list) {				
		Collections.sort(list, Cars.sortAscByPrice);
		return list;
	}

	@Override
	public List<Cars> sortDescByPrice(List<Cars> list) {
		// TODO Auto-generated method stub
		Collections.sort(list, Cars.sortDescByPrice);
		return list;
	}

	@Override
	public List<Cars> sortAscByDateOfProduction(List<Cars> list) {
		// TODO Auto-generated method stub
		Collections.sort(list, Cars.sortAscByDateOfProduction);
		return list;
	}

	@Override
	public List<Cars> sortDescByDateOfProduction(List<Cars> list) {
		// TODO Auto-generated method stub
		Collections.sort(list, Cars.sortDescByDateOfProduction);
		return list;
	}

	@Override
	public List<Cars> sortAscByCreationDate(List<Cars> list) {
		// TODO Auto-generated method stub
		Collections.sort(list, Cars.sortAscByCreationDate);
		return list;
	}

	@Override
	public List<Cars> sortDescByCreationDate(List<Cars> list) {
		// TODO Auto-generated method stub
		Collections.sort(list, Cars.sortDescByCreationDate);
		return list;
	}

	@Override
	public List<Cars> sortAscByName(List<Cars> list) {
		// TODO Auto-generated method stub
		Collections.sort(list);
		return list;
	}

	@Override
	public List<Cars> sortDescByName(List<Cars> list) {
		// TODO Auto-generated method stub
		Collections.sort(list);
		Collections.reverse(list);
		return list;
	}

}
