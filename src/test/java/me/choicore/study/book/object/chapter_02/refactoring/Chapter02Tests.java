package me.choicore.study.book.object.chapter_02.refactoring;

import me.choicore.study.book.object.chapter_02.Money;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class Chapter02Tests {

    @Test
    void t2() {
        Movie starWars = new Movie(
                "스타워즈",
                Duration.ofMinutes(120),
                Money.wons(10000),
                screening -> Money.ZERO
        );

        Screening screening = new Screening(starWars, 1, null);
        Money money = starWars.calculateMovieFee(screening);

        System.out.println(money.getAmount());
    }
}