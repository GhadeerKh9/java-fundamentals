import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(2);
        clock();

    }

    public static String pluralize(String word, int number) {


        if (number == 0 || number > 1) {


            return word + "s";


        } else {
            return word;
        }
    }


    public static void flipNHeads(int n) {

        int primary = 0;

        int counter = 0;


        while (primary != n) {
            double random = Math.random();
            if (random < .5) {
                System.out.println("Tails");
                primary = 0;
                counter++;
            }
            if (random >= .5) {
                System.out.println("Heads");
                primary++;
                counter++;
            }
        }
        System.out.println("It took " + counter + " to flip  " + n + " heads in a row.");
    }

    public static void clock() throws InterruptedException {



        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//            int second = now.getSecond();
            Thread.sleep(1000);
            System.out.println(time);

        }

    }

}

