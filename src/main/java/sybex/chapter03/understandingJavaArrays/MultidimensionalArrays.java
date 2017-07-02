package sybex.chapter03.understandingJavaArrays;

/**
 * Created by Hector Huby on 01/12/2016.
 */
public class MultidimensionalArrays {
	int[][] vars1;//2D array
	int vars2 [][];//2D array
	int[] vars3[];//2D array
	int[] vars4, space [][];//a 2D y 3D array

	public static void main(String[] args) {
		/*String [][] rectangle = new String[3][2];
		rectangle[0][1] = "set";
		*/

		/* Array asimetricos
		int[][] differentSize = {{1, 4},{3},{9, 8, 7}};
		*/

		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " ");//print element
			System.out.println();//time for a new row
		}
	}
}
