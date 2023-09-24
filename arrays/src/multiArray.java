//трехмерный массив
public class multiArray {


        static int[][][] multiArray = new int[][][]{{{10,10,10}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

        public static void main(String[] args) {
            for(int[][]i:multiArray){
                System.out.print("{ ");
                for(int[]j:i){
                    System.out.print(" {  ");
                    for(int k:j){
                        System.out.print(k+" ");
                    }
                    System.out.print("  } ");
                }
                System.out.print(" }     ");
            }
        }
    }

