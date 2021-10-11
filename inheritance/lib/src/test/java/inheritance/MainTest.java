package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testing() {
        MainTest test = new MainTest();

    }


    @Test
    public void testing2() {
        Restaurant test = new Restaurant("KFC", "High");

    }

    @Test
    public void RestaurantTest() {
        Restaurant restaurant = new Restaurant("kfc", "high");

     assertEquals("Restaurant{name='kfc', priceCategory='high', numberOfStars=0.0, reviews=[]}", restaurant.toString());

    }


    @Test
    public void ReviewTest() {
        Review review1 = new Review("GREAT", "SOME GUY", 3);

        assertEquals("Review{body='GREAT', author='SOME GUY', numberOfStars=3}", review1.toString());
    }

    @Test
    public void AddReviewsTest() {
        Restaurant restaurant = new Restaurant("kfc", "high");

        Review review1 = new Review("GREAT", "SOME GUY", 3);
        Review review2 = new Review("BAD", "Ahmad", 10);


        restaurant.addReview(review1);
        restaurant.addReview(review2);


        assertEquals("[Review{body='GREAT', author='SOME GUY', numberOfStars=3}, Review{body='BAD', author='Ahmad', numberOfStars=5}]", restaurant.getReviews().toString());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Test
    public void ShopTest() {
        Shop shop1 = new Shop("ON THE RUN", "GROCERIES", 2);

        assertEquals("Shop{name='ON THE RUN', description='GROCERIES', numberOfDollarSign=0, reviews=[]}", shop1.toString());
    }

    @Test
    public void ShopReviewTest() {
        Review review1 = new Review("GREAT", "SOME GUY", 3);

        assertEquals("Review{body='GREAT', author='SOME GUY', numberOfStars=3}", review1.toString());
    }

    @Test
    public void ShopAddReviewsTest() {
        Shop shop1 = new Shop("ON THE RUN", "GROCERIES", 2);

        Review review1 = new Review("GREAT", "SOME GUY", 3);
        Review review2 = new Review("BAD", "Ahmad", 10);


        shop1.addShopReview(review1);
        shop1.addShopReview(review2);

        assertEquals("[Review{body='GREAT', author='SOME GUY', numberOfStars=3}, Review{body='BAD', author='Ahmad', numberOfStars=5}]", shop1.getReviews().toString());
    }

    @Test
    public void TheaterTest() {
        Theater theater1 = new Theater("AAA");

        assertEquals("Theater{name='AAA', reviewsOfTheater={}, movies=[]}", theater1.toString());
    }

    @Test
    public void TheaterReviewTest() {
        Review review1 = new Review("GREAT", "SOME GUY", 3);

        assertEquals("Review{body='GREAT', author='SOME GUY', numberOfStars=3}", review1.toString());
    }

    @Test
    public void TheaterAddMovieTest() {
        Theater theater1 = new Theater("AAA");


        theater1.addMovie("Before Sunset");


        assertEquals("Theater{name='AAA', reviewsOfTheater={}, movies=[Before Sunset]}", theater1.toString());
    }

    @Test
    public void TheaterRemoveMovieTest() {
        Theater theater1 = new Theater("AAA");

        theater1.addMovie("Before Sunset");


        theater1.removeMovie("Before sunset");

        assertEquals("Theater{name='AAA', reviewsOfTheater={}, movies=[Before Sunset]}", theater1.toString());
    }

    @Test
    public void TheaterAddReviewsTest() {
        Theater theater1 = new Theater("AAA");

        Review review1 = new Review ("Good","Mohammad", 4);

        theater1.addReviewTheater(review1, "Before Sunshine");


        assertEquals("{Review{body='Good', author='Mohammad', numberOfStars=4}=Before Sunshine}", theater1.getReviewsOfTheater().toString());
    }

}
