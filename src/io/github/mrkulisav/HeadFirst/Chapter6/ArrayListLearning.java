package io.github.mrkulisav.HeadFirst.Chapter6;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLearning {

	public static void main(String[] args) {
		ArrayList<Egg> myList = new ArrayList<>();
		
		Egg s = new Egg();
		myList.add(s);
		Egg b = new Egg();
		myList.add(b);
		Egg g = new Egg();
		myList.add(g);
		
		int theSize = myList.size();
		boolean isIn = myList.contains(s);
		int indx = myList.indexOf(b);
		boolean isEmpty = myList.isEmpty();
		myList.remove(g);
		
		System.out.println(theSize);
		System.out.println(isIn);
		System.out.println(indx);
		System.out.println(isEmpty);
		System.out.println(Arrays.toString(myList.toArray()));

	}

}

class Egg{
	
}
