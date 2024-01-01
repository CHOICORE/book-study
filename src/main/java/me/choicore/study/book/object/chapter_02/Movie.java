package me.choicore.study.book.object.chapter_02;

import lombok.ToString;

import java.time.Duration;


@ToString
public class Movie {
    private final String title;
    private final Duration runningTime;
    private final Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(final String title, final Duration runningTime, final Money fee, final DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(final Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
