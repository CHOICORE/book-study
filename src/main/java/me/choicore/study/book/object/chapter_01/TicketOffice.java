package me.choicore.study.book.object.chapter_01;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private final List<Ticket> tickets = new ArrayList<>();
    private Long amount;

    public TicketOffice(final Long amount, final Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(List.of(tickets));
    }

    public Ticket getTicket() {
        return tickets.removeFirst();
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
