package me.choicore.study.book.object.chapter_01.refactoring;


import me.choicore.study.book.object.chapter_01.Ticket;

public record Audience(Bag bag) {

    public Long buy(final Ticket ticket) {
        return bag.hold(ticket);
    }
}
