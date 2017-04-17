package sybex.chapter03.understandingArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alvaro Alcocer on 05/12/2016.
 */
public class UsingArrayListClear {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		birds.clear();
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());


	}
}
