package Model;

public class Movie {
    private DiscountPolicy discountPolicy;
    private int fee;
    private String title;

    public Movie(DiscountPolicy discountPolicy, int fee, String title) {
        this.discountPolicy = discountPolicy;
        this.fee = fee;
        this.title = title;
    }

    public int getDefaultFee() {
        return fee;
    }

    public int calculateFee(Screening screening) {
        return getDefaultFee() - discountPolicy.calculateDiscountAmount(screening);
    }

    public String getTitle() {
        return title;
    }
}
