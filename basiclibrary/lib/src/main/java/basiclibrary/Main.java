package basiclibrary;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Library calling = new Library();
        int numTest = 5;
        int[] testArr = {1,2,3};

        System.out.println(Arrays.toString(calling.roll(numTest)));

        int[] testArr1 = {1,2,3};

        System.out.println(calling.checkDuplicates(testArr1));

        int[] testArr3 = {1,2,3};
        System.out.println(calling.simpleAvg(testArr3));


      int[][] testArr4= {{1,1,1}, {2,2,2}, {3,3,3}, {4,4,4}};
        System.out.println(Arrays.toString(calling.minAvgOfArrOfArrays(testArr4)));

    }
}
