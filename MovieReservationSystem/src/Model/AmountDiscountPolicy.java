package Model;

public class AmountDiscountPolicy extends DiscountPolicy {
    private int discountAmount;

    public AmountDiscountPolicy(int discountAmount, DiscountCondition ... discountConditions) {
        super(discountConditions);
        this.discountAmount = discountAmount;
    }
    
    @Override
    protected int getDiscountAmount(Screening screening) {
        return discountAmount;
    }

}
