package me.choicore.study.book.object.chapter_01;

public class Theater {
    private final TicketSeller ticketSeller;

    public Theater(final TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(final Audience audience) {
        final Ticket ticket = ticketSeller.ticketOffice().getTicket();
        if (!audience.bag().hasInvitation()) {
            audience.bag().minusAmount(ticket.fee());
            ticketSeller.ticketOffice().plusAmount(ticket.fee());
        }

        audience.bag().setTicket(ticket);
    }
}
