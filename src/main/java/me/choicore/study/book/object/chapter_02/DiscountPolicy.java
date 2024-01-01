package me.choicore.study.book.object.chapter_02;

import java.util.ArrayList;
import java.util.List;

public abstract class DiscountPolicy {

    public static final DiscountPolicy NONE_DISCOUNT_POLICY = new DiscountPolicy() {
        @Override
        protected Money getDiscountAmount(final Screening screening) {
            return Money.ZERO;
        }
    };

    private final List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(final DiscountCondition... conditions) {
        this.conditions.addAll(List.of(conditions));
    }

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
