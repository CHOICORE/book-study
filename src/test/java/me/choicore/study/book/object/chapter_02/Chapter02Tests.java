package me.choicore.study.book.object.chapter_02;

import org.junit.jupiter.api.Test;

import java.time.Duration;

class Chapter02Tests {

    @Test
    void t1() {
        Movie avatar = new Movie("아바타", Duration.ofMinutes(120), Money.wons(11_000),
                new AmountDiscountPolicy(Money.wons(1_000), new SequenceCondition(1), new SequenceCondition(10)));

        Money money = avatar.calculateMovieFee(new Screening(avatar, 1, null));
        System.out.println(money);
    }


    @Test
    void t2() {
        Movie starWars = new Movie(
                "스타워즈",
                Duration.ofMinutes(120),
                Money.wons(10000),
                DiscountPolicy.NONE_DISCOUNT_POLICY
        );
        starWars.changeDiscountPolicy(new AmountDiscountPolicy(Money.wons(800), new SequenceCondition(1)));
        starWars.changeDiscountPolicy(new PercentDiscountPolicy(0.1, new SequenceCondition(1)));
        Money money = starWars.calculateMovieFee(new Screening(starWars, 1, null));
        System.out.println(money.getAmount());
    }
}