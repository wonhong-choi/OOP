package Model;

public class Reservation {
    private String title;
    private Screening screening;
    private int numAudiences;
    private int fee;
    private int discountedFee;

    public Reservation(String title, Screening screening, int numAudiences, int fee, int discountedFee) {
        this.title = title;
        this.screening = screening;
        this.numAudiences = numAudiences;
        this.fee = fee;
        this.discountedFee = discountedFee;
    }

}
