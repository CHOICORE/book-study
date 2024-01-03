package me.choicore.study.book.object.chapter_04.refactoring;

import lombok.Getter;
import me.choicore.study.book.object.chapter_04.DiscountConditionType;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
public class DiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isDiscountable(
            final DayOfWeek dayOfWeek,
            final LocalTime time) {
        if (type != DiscountConditionType.PERIOD) {
            throw new IllegalArgumentException();
        }
        return this.dayOfWeek.equals(dayOfWeek) &&
                this.startTime.isBefore(time) &&
                this.endTime.isAfter(time);
    }

    public boolean isDiscountable(final int sequence) {
        if (type != DiscountConditionType.SEQUENCE) {
            throw new IllegalArgumentException();
        }
        return this.sequence == sequence;
    }
}
