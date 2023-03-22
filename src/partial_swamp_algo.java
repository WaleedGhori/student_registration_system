import java.util.ArrayList;

class partial {
    int[] partial1 = { 5 , 8 , 9 , 3};
    int[] partial2 = { 5 , 7 , 3 , 1};
    int[] partial3 = { 4 , 2 , 8 , 4};
    int[] partial4 = { 11 , 5 , 6 , 7};
    int[] partial5 = { 1 , 8 , 26 , 4};

//    public  void max(int[][] p){
//
//        for (int i = 0; i < p.length; i++) {
//            int p_best_max = p[i][0];
//            for (int j = 0; j < p[i].length; j++) {
//                if (p[i][j]> p_best_max) {
//                    p_best_max = p[i][j];
//                }
//            }
//            System.out.println("Maximum value of partial" + (i+1) + ": " + p_best_max);
//        }
//
//    }
}


public class partial_swamp_algo {

    public static void main(String args[]){
        partial partialObj = new partial();

        // here I am storing all the array in multidimensional array
        int[][] partialArrays = { partialObj.partial1, partialObj.partial2, partialObj.partial3, partialObj.partial4, partialObj.partial5 };

        int [] p_best_max = new int [partialArrays.length];

        for (int i = 0; i < partialArrays.length; i++) {
            p_best_max[i]  = partialArrays[i][0];
            for (int j = 0; j < partialArrays[i].length; j++) {
                if (partialArrays[i][j] > p_best_max[i]) {
                    p_best_max[i] = partialArrays[i][j];
                }
            }
        }


        // here I am declared the arraylist where I am  adding my all p_best_value in the arrayList
        ArrayList<Integer>  numbers = new ArrayList<Integer>();
        for (int i = 0; i < p_best_max.length; i++) {
            numbers.add(p_best_max[i]);
            System.out.println("Maximum value of partial" + (i+1) + ": " + p_best_max[i]);
        }

        // here I am trying to take the g_best_value from given p_best_value
        int g_best_max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)>g_best_max) {
                g_best_max = numbers.get(i);
            }
        }
        System.out.println(g_best_max);
        System.out.println(numbers);
//        int p_best_max1 = partialObj.partial1[0];
//        int p_best_max2 = partialObj.partial2[0];
//        int p_best_max3 = partialObj.partial3[0];
//        int p_best_max4 = partialObj.partial4[0];
//        int p_best_max5 = partialObj.partial5[0];
//
//        for (int k = 0; k<partialObj.partial1.length; k++){
//            if (partialObj.partial1[k]>p_best_max1) {
//                p_best_max1 = partialObj.partial1[k];
//            }
//        }
//        System.out.println(p_best_max1);
    }

}
