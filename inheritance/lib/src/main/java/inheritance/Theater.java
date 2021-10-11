package inheritance;

import java.util.HashMap;
import java.util.LinkedList;

public class Theater {

  private String name;



  private HashMap<Review, String> reviewsOfTheater = new HashMap<>();
  private LinkedList<String> movies = new LinkedList<>();


//  public Theater(String name, HashMap<Review, String> reviewsOfTheater, LinkedList<String> movies) {
//    this.name = name;
//    this.reviewsOfTheater = reviewsOfTheater;
//    this.movies = movies;
//  }



  public String getName() {
    return name;
  }

  public HashMap<Review, String> getReviewsOfTheater() {
    return reviewsOfTheater;
  }

  public LinkedList<String> getMovies() {
    return movies;
  }


  public void addMovie(String movie){

    this.movies.add(movie);


  }
  public void removeMovie(String movie){

    this.movies.add(movie);


  }


  public void addReviewTheater(Review review, String movie){
    if(!getReviewsOfTheater().containsValue(movie)){
      getReviewsOfTheater().put(review,movie);
    }else {
      System.out.println("You can't review it twice!");
    }

  }


}

