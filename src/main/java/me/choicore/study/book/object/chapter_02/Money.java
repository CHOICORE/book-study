package me.choicore.study.book.object.chapter_02;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class Money {
    public static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    Money(final BigDecimal amount) {
        this.amount = amount;
    }

    public static Money wons(final long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(final double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public Money plus(final Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(final Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(final double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }
}
