package chepter2.class1.ex;

public class Test1 {

    public static void main(String[] args) {



        MovieReview review1 = new MovieReview();
        MovieReview review2 = new MovieReview();

        review1.title = "어바웃 타임";
        review1.review = "good";

        review2.title = "범죄의 도시";
        review2.review = "not bed";

        System.out.println( review1.title + " " + review1.review);
        System.out.println( review2.title + " " + review2.review);

    }

}
