package twoDimensionalArrays;

// syntax for creating a 2D array :
// array_identifier = new type[number_of_arrays][length];
// so
// int[][] sales = new int[5][4];

public class twoDarray {
    public static void main(String[] args) {

        // 2D array
        int[][] yearlySales = new int[5][4];

        yearlySales[0][0] = 1000;
        yearlySales[0][1] = 1500;
        yearlySales[0][2] = 1800;
        yearlySales[1][0] = 1000;
        yearlySales[3][3] = 2000;

        // how to process with nested for loops:
        System.out.println("Yearly sales by quarter beginning 2020: ");

        for (int i = 0; i < yearlySales.length; i++) {
            for (int j = 0; j < yearlySales[i].length; j++) {
                System.out.println("\tQ" + (j +1) + " " + yearlySales[i][j]);
            }
            System.out.println();
        }
    }
}
