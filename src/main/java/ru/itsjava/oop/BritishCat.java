package ru.itsjava.oop;

public class BritishCat extends Cat {

    public BritishCat() {
        super("британская");
        System.out.println("Я дочь - Британская кошка");
    }

    @Override // ALt+Ins
    public void sayMeow() {
        System.out.println("Mrrr");
        super.sayMeow();
    }
    public void sayMrr(){
        System.out.println("Mrr");
    }

}
