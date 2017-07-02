package sybex.chapter03.understandingArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hector Huby on 05/12/2016.
 */
public class UsingArrayListRemove {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds.remove(0));
		System.out.println(birds);
	}
}
