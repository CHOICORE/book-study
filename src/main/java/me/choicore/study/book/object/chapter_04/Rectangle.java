package me.choicore.study.book.object.chapter_04;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {
    private int left;
    private int top;
    private int right;
    private int bottom;

    public Rectangle(final int left, final int top, final int right, final int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }
}
