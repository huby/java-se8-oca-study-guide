package sybex.chapter03.understandingArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alvaro Alcocer on 05/12/2016.
 */
public class UsingArrayListSet {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println(birds.size());
		birds.set(0, "robin");
		System.out.println(birds.size());
		birds.set(1, "robin");
		System.out.println(birds.size());
	}
}
