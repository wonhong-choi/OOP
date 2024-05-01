package Model;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition ... discountConditions) {
        super(discountConditions);
        this.percent = percent;
    }

    @Override
    protected int getDiscountAmount(Screening screening) {
        return (int)(percent * screening.getMovieFee());
    }

}
