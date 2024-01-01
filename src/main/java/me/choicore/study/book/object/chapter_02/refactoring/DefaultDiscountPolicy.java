package me.choicore.study.book.object.chapter_02.refactoring;

import me.choicore.study.book.object.chapter_02.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private final List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(final DiscountCondition... conditions) {
        this.conditions.addAll(List.of(conditions));
    }

    @Override
    public Money calculateDiscountAmount(final Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(final Screening screening);
}
