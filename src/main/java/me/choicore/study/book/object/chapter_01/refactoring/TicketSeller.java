package me.choicore.study.book.object.chapter_01.refactoring;

public class TicketSeller {

    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(final Audience audience) {
        this.ticketOffice.sellTicketTo(audience);
    }
}
