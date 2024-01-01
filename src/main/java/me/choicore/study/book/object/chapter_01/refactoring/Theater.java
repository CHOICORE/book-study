package me.choicore.study.book.object.chapter_01.refactoring;

public class Theater {
    private final TicketSeller ticketSeller;

    public Theater(final TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(final Audience audience) {
        this.ticketSeller.sellTo(audience);
    }
}
