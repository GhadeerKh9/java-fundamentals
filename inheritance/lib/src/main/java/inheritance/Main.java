package inheritance;

public class Main {
    public static void main(String[] args) {


        Review review1 = new Review("GREAT", "SOME GUY", 3);
        Review review2 = new Review("BAD", "Ahmad", 10);
//
        Restaurant restaurant1 = new Restaurant("KFC", "high");
        restaurant1.addReview(review1);
        restaurant1.addReview(review2);
//
//
//
        Shop shop1 = new Shop("ON THE RUN", "GROCERIES", 2);
           shop1.addShopReview(review1);
           shop1.addShopReview(review2);



        System.out.println(shop1);


        System.out.println(restaurant1);


        Theater theater1 = new Theater("AAAA");
        theater1.addMovie("Before sunset");



    }
}
