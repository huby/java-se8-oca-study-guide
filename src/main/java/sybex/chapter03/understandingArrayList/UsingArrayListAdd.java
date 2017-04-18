package sybex.chapter03.understandingArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hector Huby on 05/12/2016.
 */
public class UsingArrayListAdd {
	public static void main(String[] args) {
		/*ArrayList list = new ArrayList();
		list.add("hawk");
		list.add(Boolean.TRUE);
		System.out.println(list);*/

		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		//safer.add(Boolean.TRUE);// NO compila

		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blue jay");
		birds.add(1, "cardinal");
		System.out.println(birds);

	}
}
