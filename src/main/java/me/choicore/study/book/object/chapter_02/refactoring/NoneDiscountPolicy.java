package me.choicore.study.book.object.chapter_02.refactoring;


import me.choicore.study.book.object.chapter_02.Money;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
