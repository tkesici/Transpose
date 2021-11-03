public class Transpose {
    public static void main(String[] args) {

        Transpose2DArray t = new Transpose2DArray();
        int arr[][] = new int[3][3];
        t.initializeArray(arr);
        t.displayTransposedArray(arr);
        t.displayArray(arr);


    }
}
class Transpose2DArray{
    private final int row = 3;
    private final int column = 3;


    private int[][] arr = new int[row][column];

    public void initializeArray(int[][] arr) {
        int[] elements = {1,2,3,4,5,6,7,8,9};
        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[j][i] = elements[k];
                k++;
            }
        }
    }

    public void displayTransposedArray(int[][] arr) {
        int[][] arr2 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                    arr2[i][j] = arr[j][i];
            }

        }
        arr=arr2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }

    }

    public void displayArray(int[][] arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }

    }

}
