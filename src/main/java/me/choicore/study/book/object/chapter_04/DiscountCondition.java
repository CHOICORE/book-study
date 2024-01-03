package me.choicore.study.book.object.chapter_04;

import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
public class DiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
}
