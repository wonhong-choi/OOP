import java.time.LocalDateTime;

import Model.AmountDiscountPolicy;
import Model.Movie;
import Model.Screening;
import Model.SequenceDiscountCondition;


public class App {
    public static void main(String[] args) throws Exception {
        Movie avatar = new Movie(new AmountDiscountPolicy(800, new SequenceDiscountCondition(3)), 10000, "Avatar");
        
        Screening avataScreening = new Screening(avatar, 3, LocalDateTime.now());
        var reservation = avataScreening.reserve(2);

        reservation.showReceipt();
    }
}
