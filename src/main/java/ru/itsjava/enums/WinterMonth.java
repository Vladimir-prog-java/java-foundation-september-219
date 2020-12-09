package ru.itsjava.enums;

public enum WinterMonth {
    DECEMBER("Я перед НГ"), JANUARY("Я после НГ"), FEBRUARY("Я после НГ тоже");

    private final String addInfo;
    WinterMonth(String addInfo){
        this.addInfo=addInfo;

    }

    @Override
    public String toString() {
        return "WinterMonth{" + this.name()+
                "addInfo='" + addInfo + '\'' +
                '}';
    }
}
