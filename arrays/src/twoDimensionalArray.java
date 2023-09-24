//двумерный массив
import java.util.Scanner;

public class twoDimensionalArray {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим количество строк(одномерных массивов)
        int raw = sc.nextInt();
        multiArray = new int[raw][];
        //вводим количество столбцов(элементов)
        for (int i = 0; i <multiArray.length ; i++) {
            multiArray[i]=new int[sc.nextInt()];
        }
        //вывод на экран пустого двумерного массива
        for(int[] i:multiArray){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
