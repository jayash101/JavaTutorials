public class multidimArray {
    public static void main(String[] args) {
        // declaring and initializing 2D array
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // printing 2D array
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println(); // new line after each row
        } 
    }
}
