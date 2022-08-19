package basic;

public class MatrixMulti {

	public static void main(String[] args) {
		int one [][] = {{1,2,3},{4,5,6}};
		int two [][] = {{7, 8},{9,10},{11, 12}};
		MatrixMulti.multi(one, two);
	}
	
	public static void multi(int one[][], int two[][]) {
		
		int result [][] = new int [10][10];
		int rowOfFisrtMatrix = one.length;
		int rowOfSecondMatrix = two.length;
		int columnOfSecondMatrix = two[0].length;
		for(int i = 0; i< rowOfFisrtMatrix; i++){
			for(int  j = 0; j < columnOfSecondMatrix; j++) {
				int sum = 0;
				for(int k = 0; k < rowOfSecondMatrix; k++) {
					sum = sum + (one[i][k] * two [k][j]);
				}
				result[i][j] = sum;
 			}
		}
		
		for(int i = 0; i< rowOfFisrtMatrix; i++){
			System.out.println();
			for(int  j = 0; j < columnOfSecondMatrix; j++) {
				System.out.print(result[i][j]+" ");
			}
		}
		
	}

}
