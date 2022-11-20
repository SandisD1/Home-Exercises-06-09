package io.codelex.practice.ex3DatePeriod;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod datePeriod) {
        LocalDate intersectStart;
        LocalDate intersectEnd;
        if (this.end.isBefore(datePeriod.getStart()) || datePeriod.getEnd().isBefore(this.start)) {
            return null;
        } else {
            if (this.start.isBefore(datePeriod.getStart())) {
                intersectStart = datePeriod.getStart();
            } else {
                intersectStart = this.start;
            }
            if (this.end.isBefore(datePeriod.end)) {
                intersectEnd = this.end;
            } else {
                intersectEnd = datePeriod.end;
            }
            return new DatePeriod(intersectStart, intersectEnd);
        }
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
