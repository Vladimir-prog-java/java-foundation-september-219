package ru.itsjava.enums;

public enum Weekdays {
    MONDAY("ПОНЕДЕЛЬНИК"), TUESDAY("ВТОРНИК"), WEDNESDAY("СРЕДА"), THURSDAY("ЧЕТВЕРГ"), FRIDAY("ПЯТНИЦА"), SATURDAY("СУББОТА"), SUNDAY("ВОСКРЕСЕНЬЕ");
    final String translate;

    Weekdays(String translate) {
        this.translate = translate;
    }

    @Override
    public String toString() {
        return "Weekdays{" + this.name() +
                " translate = '" + translate + '\'' +
                '}';
    }
}
