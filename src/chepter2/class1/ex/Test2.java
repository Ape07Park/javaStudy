package chepter2.class1.ex;

public class Test2 {

    public static void main(String[] args) {

        MovieReview[] reviews = new MovieReview[2];

        MovieReview review1 = new MovieReview();
        MovieReview review2 = new MovieReview();

        review1.title = "어바웃 타임";
        review1.review = "good";

        review2.title = "범죄의 도시";
        review2.review = "not bed";

        reviews[0] = review1;
        reviews[1] = review2;

        for (MovieReview review : reviews) {
            System.out.println(review.title + " " + review.review);
        }

    }

}
