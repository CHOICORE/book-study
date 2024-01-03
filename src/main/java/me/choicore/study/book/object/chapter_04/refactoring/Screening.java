package me.choicore.study.book.object.chapter_04.refactoring;

import lombok.Getter;
import lombok.Setter;
import me.choicore.study.book.object.chapter_04.Money;

import java.time.LocalDateTime;

@Getter
@Setter
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Money calulateFee(int audienceCount) {
        switch (movie.getMovieType()) {
            case AMOUNT_DISCOUNT:
                if (movie.isDiscountable(whenScreened, sequence)) {
                    return movie.getFee().minus(movie.getDiscountAmount());
                }
                break;
            case PERCENT_DISCOUNT:
                if (movie.isDiscountable(whenScreened, sequence)) {
                    return movie.getFee().minus(movie.getFee().times(movie.getDiscountPercent()));
                }
                break;
            case NONE_DISCOUNT:
                return movie.calculateNoneDiscountedFee().times(audienceCount);
        }
        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
