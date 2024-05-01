package Model;

public class SequenceDiscountCondition implements DiscountCondition{
    private int sequence;

    public SequenceDiscountCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfied(Screening screening) {
        return screening.isSequence(sequence);
    }

}
