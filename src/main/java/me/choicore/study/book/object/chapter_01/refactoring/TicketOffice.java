package me.choicore.study.book.object.chapter_01.refactoring;

import me.choicore.study.book.object.chapter_01.Ticket;

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

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void sellTicketTo(final Audience audience) {
        this.plusAmount(audience.buy(this.getTicket()));
    }
}

