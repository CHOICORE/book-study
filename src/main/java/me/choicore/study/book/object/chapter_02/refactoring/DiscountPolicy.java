package me.choicore.study.book.object.chapter_02.refactoring;

import me.choicore.study.book.object.chapter_02.Money;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
