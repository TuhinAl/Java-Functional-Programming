package basic;

public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr2 = { { 4, 5, 6 }, { 1, 3, 2 } };
		MatrixAdd.add(arr1, arr2);

	}
	
	public static void add(int one[][], int two[][]){
		int [][] result = new int[10][10] ;
		for(int i= 0; i < one.length; i++) {
			for(int j = 0; j<one[0].length; j++) {
				result [i][j] = one[i][j] +  two[i][j];
			}
		}
		
		for(int i= 0; i < one.length; i++) {
			System.out.println();
			for(int j = 0; j<one[0].length; j++) {
				System.out.print(result [i][j]+" ");
			}
		}
		
	}

}
