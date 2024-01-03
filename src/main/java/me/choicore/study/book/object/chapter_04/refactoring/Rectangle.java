package me.choicore.study.book.object.chapter_04.refactoring;


import lombok.Getter;

@Getter
public class Rectangle {
    private final int left;
    private final int top;
    private int right;
    private int bottom;

    public Rectangle(final int left, final int top, final int right, final int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public void enlarge(int multiple) {
        this.right *= multiple;
        this.bottom *= multiple;
    }
}
