package me.choicore.study.book.object.chapter_02;

public class Reservation {
    private final Customer customer;
    private final Screening screening;
    private final Money fee;
    private final int audienceCount;

    public Reservation(final Customer customer, final Screening screening, final Money money, final int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = money;
        this.audienceCount = audienceCount;
    }
}
