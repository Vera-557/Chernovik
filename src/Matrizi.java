
import java.util.Arrays;
public class Matrizi {

        public static void main(String[] args) {
            //распечатать матрицу

            int[][] matrix = {
                    {1,2,8},
                    {5,9,5},
                    {8,5,7},
                    {8,1,7}
            };
            //это будет массив [3][4]
            //for (int i = 0; i < matrix.length; i++){
            // i - это строка массива = 3 шт.
            // System.out.println(Arrays.toString(matrix[i]));
            //длинна массива = 4
// если я хочу итерироваться каждый раз самостоятельно по каждой ячейке
            for (int i = 0; i < matrix.length; i ++){
                int [] innerMas = matrix[i];
                for (int j = 0; j < innerMas.length; j++){
                    System.out.println(matrix[i][j]);
                    //первыми считаются строки.
                } System.out.println("***");
            }
            //}
        }


}
