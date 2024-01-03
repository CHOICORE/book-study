package me.choicore.study.book.object.chapter_04.refactoring;


import me.choicore.study.book.object.chapter_04.Customer;
import me.choicore.study.book.object.chapter_04.Money;

public class ReservationAgency {

    public Reservation reserve(final Screening screening, final Customer customer, final int audienceCount) {
        Money fee = screening.calulateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
