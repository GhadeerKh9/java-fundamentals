/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Restaurant{



    private  String name;
    private String priceCategory;
    private double numberOfStars;


    public LinkedList<Review> reviews  = new LinkedList<>();




    public Restaurant(String name, String priceCategory ) {
            this.name = name;
            this.priceCategory = priceCategory;


        }



    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", reviews=" + reviews +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void addition(Review review){

        this.reviews.add(review);
        StarsUpdate();

    }
//

    public void StarsUpdate (){
        double current = 0;
        for(int i = 0; i < getReviews().size(); i++){
            current += getReviews().get(i).getNumberOfStars();
        }
        current = current/(getReviews().size());
        current = Math.round(current );
        this.numberOfStars = current;
    }
}

