package me.choicore.study.book.object.chapter_04.refactoring;

import lombok.Getter;
import lombok.Setter;
import me.choicore.study.book.object.chapter_04.DiscountConditionType;
import me.choicore.study.book.object.chapter_04.Money;
import me.choicore.study.book.object.chapter_04.MovieType;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public List<DiscountCondition> getDiscountConditions() {
        return Collections.unmodifiableList(discountConditions);
    }

    public Money calculateAmountDiscountedFee() {
        if (this.movieType != MovieType.AMOUNT_DISCOUNT) {
            throw new IllegalArgumentException();
        }
        return this.fee.minus(this.discountAmount);
    }

    public Money calculatePercentDiscountedFee() {
        if (this.movieType != MovieType.PERCENT_DISCOUNT) {
            throw new IllegalArgumentException();
        }
        return this.fee.minus(this.fee.times(this.discountPercent));
    }

    public Money calculateNoneDiscountedFee() {
        if (this.movieType != MovieType.NONE_DISCOUNT) {
            throw new IllegalArgumentException();
        }
        return this.fee;
    }

    public boolean isDiscountable(final LocalDateTime whenScreened, int sequence) {
        for (DiscountCondition condition : discountConditions) {

            if (DiscountConditionType.PERIOD == condition.getType()) {
                return condition.isDiscountable(whenScreened.getDayOfWeek(), whenScreened.toLocalTime());
            } else {

                return condition.isDiscountable(sequence);
            }
        }
        return false;
    }
}
