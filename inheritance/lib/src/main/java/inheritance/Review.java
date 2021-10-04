package inheritance;

public class Review {
    private String body;
    private String author;
    private int numberOfStars;


    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;

        if(numberOfStars > 5 ){
            this.numberOfStars = 5;
        }else if (numberOfStars < 0){
            this.numberOfStars = 0;
        }else {
            this.numberOfStars = numberOfStars;
        }
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }


}
