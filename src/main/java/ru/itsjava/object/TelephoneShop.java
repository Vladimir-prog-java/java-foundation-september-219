package ru.itsjava.object;

public class TelephoneShop {
    public static void main(String[] args) {
        Telephone vitaliyPhone = new Telephone("89991231212",
                "Iphone", 60);
        Telephone dashaPhone = new Telephone("892112312333",
                "Sony", 60);
        Telephone vitaliyPhone2 = new Telephone("89991231212",
                "Iphone", 60);
        System.out.println("vitaliyPhone.equals(vitaliyPhone2)= " + vitaliyPhone.equals(vitaliyPhone2));
        System.out.println("vitaliyPhone.equals(dashaPhone)= " + vitaliyPhone.equals(dashaPhone));
        System.out.println("new Object().hashCode(): " + (new Object().hashCode()));

        System.out.println("vitaliyPhone.toString(): " + vitaliyPhone.toString());


    }
}
