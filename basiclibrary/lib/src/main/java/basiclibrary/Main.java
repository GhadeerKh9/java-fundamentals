package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


     int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println((calling.notIncludedValues(weeklyMonthTemperatures)));


        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String name = calling.tally(votes);
        System.out.println(name+ " received the most votes!");
    }




}
