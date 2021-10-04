package inheritance;

public class Main {
    public static void main(String[] args) {


        Review review1 = new Review("GREAT", "SOME GUY", 3);
        Review review2 = new Review("BAD", "OSAID", 10);

        Restaurant restaurant1 = new Restaurant("KFC", "high");
        restaurant1.addition(review1);
        restaurant1.addition(review2);
        System.out.println(restaurant1);
//        System.out.println(restaurant1.getName());




    }
}
