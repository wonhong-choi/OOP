package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> discountConditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ... discountConditions){
        this.discountConditions = Arrays.asList(discountConditions);
    }

    public int calculateDiscountAmount(Screening screening) {
        for (DiscountCondition discountCondition : discountConditions) {
            if(discountCondition.isSatisfied(screening)){
                return getDiscountAmount(screening);
            }
        }
        return 0;
    }

    protected abstract int getDiscountAmount(Screening screening);
}
