package me.choicore.study.book.object.chapter_02;

public class AmountDiscountPolicy extends DiscountPolicy {
    private final Money discountAmount;

    public AmountDiscountPolicy(final Money discountAmount, final DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(final Screening screening) {
        return discountAmount;
    }
}
