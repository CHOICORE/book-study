package me.choicore.study.book.object.chapter_02.refactoring;

public interface DiscountCondition {
    boolean isSatisfiedBy(final Screening screening);
}
