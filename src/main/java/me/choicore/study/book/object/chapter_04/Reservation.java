package me.choicore.study.book.object.chapter_04;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
