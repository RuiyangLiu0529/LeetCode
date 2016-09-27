public class Rotate Image {
    public void rotate(int[][] matrix) {
        int length = matrix[0].length;
        for(int i=0; i<length; i++) {
            for(int j=0; j<length-i; j++) {
                swap_1(matrix, i, j);
            }
        }
        for(int i=0; i<length/2; i++) {
            for(int j=0; j<length; j++) {
                swap_2(matrix, i, j);
            }
        }
    }
    private void swap_1 (int[][]matrix, int x, int y) {
        int length = matrix[0].length;
        int temp = matrix[x][y];
        matrix[x][y] = matrix[length-1-y][length-1-x];
        matrix[length-1-y][length-1-x] = temp;
    }
    private void swap_2 (int[][] matrix, int x, int y) {
        int length = matrix[0].length;
        int temp = matrix[x][y];
        matrix[x][y] = matrix[length-1-x][y];
        matrix[length-1-x][y] = temp;
    }
}