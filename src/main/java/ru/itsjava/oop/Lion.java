package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lion {
    private String name;
    private int pawsCount;

    public Lion(String name) {
        this.name = name;
        pawsCount = 4;
    }

    public void printLion() {
        System.out.println("Лев с именем " + name);
    }

//    public void setPawsCount(int pawsCount) {
//        this.pawsCount = pawsCount;
//    }
//
//    public int getPawsCount() {
//        return pawsCount;
//    }

    //    public void setName(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return name;
//    }
// горячие клавиши alt+ins автоматич генерация
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
}
