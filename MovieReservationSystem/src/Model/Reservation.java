package Model;

public class Reservation {
    private String title;
    private Screening screening;
    private int numAudiences;
    private int fee;
    private int discountedFee;

    public Reservation(Screening screening, int numAudiences, int fee, int discountedFee) {
        this.title = screening.getMovieTitle();
        this.screening = screening;
        this.numAudiences = numAudiences;
        this.fee = fee;
        this.discountedFee = discountedFee;
    }

    public void showReceipt(){
        System.out.printf("Title : %s\n", title);
        System.out.printf("Audeinces : %d\n", numAudiences);
        System.out.printf("Default Fee was %d, but discounted fee is %d\n", fee, discountedFee);
    }
}
