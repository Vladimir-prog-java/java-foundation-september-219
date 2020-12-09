package ru.itsjava.proxy;

public class Main {
    public static void main(String[] args) {
//        User user =new User("");
//        try {
//            user.setName("Владимир");
//        } catch (IncorrectUserNameException e) {
//            e.printStackTrace();
//        }
        UserProxy user = new UserProxy("");
        user.setName("Владимир");
    }
}
