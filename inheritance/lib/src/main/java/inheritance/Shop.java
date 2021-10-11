package inheritance;

import java.util.LinkedList;

public class Shop {

private String name;
private String description;
private int numberOfStars;



    public LinkedList<Review> reviewsShop  = new LinkedList<>();

    public Shop(String name, String description, int numberOfDollarSign) {
        this.name = name;
        this.description = description;


    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfDollarSign() {
        return numberOfStars;
    }





    public LinkedList<Review> getReviews() {
        return reviewsShop;
    }


    public void addShopReview(Review review){

        this.reviewsShop.add(review);
        StarsUpdate();

    }

    public void StarsUpdate (){
        double current = 0;
        for(int i = 0; i < getReviews().size(); i++){
            current += getReviews().get(i).getNumberOfStars();
        }
        current = current/(getReviews().size());
        current = Math.round(current );
        this.numberOfStars = (int) current;
    }



    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSign=" + numberOfStars +
                ", reviews=" + reviewsShop +
                '}';
    }
}
