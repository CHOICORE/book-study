package me.choicore.study.book.object.chapter_01.refactoring;


import lombok.Getter;
import lombok.Setter;
import me.choicore.study.book.object.chapter_01.Invitation;
import me.choicore.study.book.object.chapter_01.Ticket;

@Getter

public class Bag {
    public static final long ZERO_FEE = 0L;
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

    public Long hold(Ticket ticket) {
        Long fee = ticket.fee();
        if (!this.hasInvitation()) {
            this.minusAmount(fee);
            return ZERO_FEE;
        }
        this.setTicket(ticket);
        return fee;
    }
}
