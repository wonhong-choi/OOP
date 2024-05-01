package Model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;
    private Duration duration;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Reservation reserve(int numAudiences){
        return new Reservation(
            this, 
            numAudiences,
            calculateDefaultFee(numAudiences),
            calculateFee(numAudiences));
    }

    private int calculateDefaultFee(int numAudiences){
        return movie.getDefaultFee() * numAudiences;
    }

    private int calculateFee(int numAudiences){
        return movie.calculateFee(this) * numAudiences;
    }


	public String getMovieTitle() {
		return movie.getTitle();
	}

    public LocalDateTime getWhenScreened(){
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public double getMovieFee() {
        return movie.getDefaultFee();
    }
}
