
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int length = scanner.nextInt();
        int[][] matrix = new int[length][length];
        int startColumn = 0, startRow = 0, endColumn = matrix[0].length - 1, endRow = matrix.length - 1, value = (length/2) - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++) {
                matrix[startRow][i] = value;
            }

            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endColumn] = value;
            }

            endColumn--;

            if (startRow <= endRow){
                for (int i = endColumn; i >= startColumn; i--) {
                    matrix[endRow][i] = value;
                }
            }

            endRow--;

            if(startColumn <= endColumn){
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startColumn] = value;
                }
            }

            startColumn++;

            value -= 1;
        }

        for(int[] row : matrix) {
            for(int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
