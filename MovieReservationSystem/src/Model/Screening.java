package Model;

public class Screening {
    private Movie movie;

    public Reservation reserve(int numAudiences){
        return new Reservation(
            movie.getTitle(),
            this, 
            numAudiences,
            movie.getDefaultFee() * numAudiences,
            movie.calculateFee(this) * numAudiences);
    }
}
