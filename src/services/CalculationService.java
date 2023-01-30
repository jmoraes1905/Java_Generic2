package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) { //You must parameterize both the argument and the class/method
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty!");
		}
		
		T max = list.get(0);
		for (T item: list) {
			if(item.compareTo(max)>0) { // compare general objects, but you must specify that the type T is Comparable
				max= item;
			}
		}
		
		return max;
	}
}
