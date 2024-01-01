package me.choicore.study.book.object.chapter_02;

import java.time.DayOfWeek;

public class PeriodCondition implements DiscountCondition {
    private final DayOfWeek dayOfWeek;
    private final int startTime;
    private final int endTime;

    public PeriodCondition(final DayOfWeek dayOfWeek, final int startTime, final int endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    @Override
    public boolean isSatisfiedBy(final Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek)
                && startTime <= screening.getStartTime().getHour()
                && endTime >= screening.getStartTime().getHour();
    }
}
