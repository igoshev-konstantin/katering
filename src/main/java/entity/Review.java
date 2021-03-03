package entity;

public class Review {
    private String review;
    private float rate;

    public String getReview() {
        return review;
    }

    public float getRate() {
        return rate;
    }

    public Review(String review, float rate) {
        this.review = review;
        this.rate = rate;
    }
}
