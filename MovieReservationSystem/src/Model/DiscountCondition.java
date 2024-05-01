package Model;

public interface DiscountCondition {
    public abstract boolean isSatisfied(Screening screening);
}
