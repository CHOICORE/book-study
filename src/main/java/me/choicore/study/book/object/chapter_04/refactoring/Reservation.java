package me.choicore.study.book.object.chapter_04.refactoring;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.choicore.study.book.object.chapter_04.Customer;
import me.choicore.study.book.object.chapter_04.Money;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;
}
