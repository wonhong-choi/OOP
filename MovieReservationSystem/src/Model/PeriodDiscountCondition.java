package Model;

import java.time.LocalTime;

public class PeriodDiscountCondition implements DiscountCondition {
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodDiscountCondition(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfied(Screening screening) {
        return screening.getWhenScreened().toLocalTime().isAfter(startTime) || 
            screening.getWhenScreened().toLocalTime().isBefore(endTime);
    }

}
