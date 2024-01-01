package me.choicore.study.book.object.chapter_02.refactoring;

import me.choicore.study.book.object.chapter_02.Customer;
import me.choicore.study.book.object.chapter_02.Money;

import java.time.LocalDateTime;

public class Screening {
    private final Movie movie;
    private final int sequence;
    private final LocalDateTime whenScreened;

    public Screening(final Movie movie, final int sequence, final LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public boolean isSequence(final int sequence) {
        return this.sequence == sequence;
    }

    private Money calculateFee(final int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
