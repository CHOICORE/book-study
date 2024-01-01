package me.choicore.study.book.object.chapter_01;


import lombok.Getter;
import lombok.Setter;

@Getter

public class Bag {
    private final Invitation invitation;
    private Long amount;
    @Setter
    private Ticket ticket;

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(final long amount, final Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
