package inheritance;

import java.util.HashMap;
import java.util.LinkedList;

public class Theater {

  public String name;



  public HashMap<Review, String> reviewsOfTheater = new HashMap<>();
  public LinkedList<String> movies = new LinkedList<>();


  public Theater(String name) {
    this.name = name;
  }



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

    this.movies.remove(movie);


  }


  public void addReviewTheater(Review review, String movie){
    if(!getReviewsOfTheater().containsValue(movie)){
      getReviewsOfTheater().put(review,movie);
    }else {
      System.out.println("You can't review it twice!");
    }

  }



  @Override
  public String toString() {
    return "Theater{" +
            "name='" + name + '\'' +
            ", reviewsOfTheater=" + reviewsOfTheater +
            ", movies=" + movies +
            '}';
  }
}

