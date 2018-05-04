package zad;
import java.util.ArrayList;
import java.util.List;

public class Product {
	public static void main(String[] args) {
		
		Cars car1 = new Cars("Sprzedam BMW",5000,"2018-04-11",2000,150000);
		Cars car2 = new Cars("Sprzedam Audi",15000,"2018-04-12",2004,50000);
		Cars car3 = new Cars("Sprzedam nowego forda",25000,"2018-04-13",2014,40000);
		Cars car4 = new Cars("BMW na sprzedaz",2000,"2018-04-14",1989,350000);
		Cars car5 = new Cars("Calkiem spoko bMw",65000,"2018-04-22",2010,20000);
		// tworzymy obiekty i liste
		List<Cars> list = new ArrayList<Cars>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);
		
		IFilter filter = new CarFilter();
		//poni¿ej filtry do wyboru wystarczy zakomentowaæ lub odkomentowaæ
		list = filter.searchByName("BMW", list);
		//list = filter.searchByPrice(100,1000000, list);
		//list = filter.searchByCreationDate("2018-04-14", list);
		//list = filter.searchByDateOfProduction(2010, list);
		//list = filter.searchByMileage(0, 300000, list);
		System.out.println("************Przefiltrowana lista obiektów************");
		for(Cars d : list){
		System.out.println(d.toString());
	}
		ISort sort = new CarSort();
		//poni¿ej sortowanie do wyboru wystarczy zakomentowaæ lub odkomentowaæ
//		list = sort.sortAscByPrice(list);  				 //sortowanie po cenie rosn¹co
//		list = sort.sortDescByPrice(list);				 //sortowanie po cenie malej¹co
		list = sort.sortAscByCreationDate(list);		 //sortowanie od najstarszej daty
//		list = sort.sortDescByCreationDate(list); 		 //sortowanie od najszybciej wypadaj¹cej daty
//		list = sort.sortAscByDateOfProduction(list);	 //sortowanie po roku produkcji od najstarszego
//		list = sort.sortDescByDateOfProduction(list);	 //sortowanie po roku produkcji od najm³odszego
//		list = sort.sortAscByName(list);				 //sortowanie po nazwie alfabetycznie
//		list = sort.sortDescByName(list);				 //sortowanie po nazwie odwrotnie
		System.out.println("************Posortowana lista obiektów: ************");
		for(Cars d : list){
			System.out.println(d.toString());
			
		}
	}
}