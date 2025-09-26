public class Transpose {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] matrix = new int[n][n];
        int index = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(args[index++]);
            }
        }

        System.out.println("Original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transposed:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}