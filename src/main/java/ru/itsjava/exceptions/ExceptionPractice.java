package ru.itsjava.exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {
        // throw new NullPointerException();
//        try {
//
//            Object obj = null;
//           // obj.toString();
//            throw new RuntimeException();
//        } catch (NullPointerException npe){
//            System.err.println("Утебя npe");
//            //npe.printStackTrace();
//        }catch (Throwable throwable){
//            System.err.println("Я тебя поймал!");
//        }
//
//        System.out.println("После обработки ошибки");
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            throw  new RuntimeException();
//        } catch (RuntimeException runtimeException){
//            System.err.println(runtimeException);
//        } finally {
//            System.out.println("FINALLY");
//        }
//User emptyUser = new User("");
//try {
//    emptyUser.setName(" ");
//} catch (IncorrectUserNameException incorrectUserNameException){
//    System.out.println("Не корректное имя");
//        try {
//            Person person = new Person(-2, "");
//        } catch (IncorrectPersonAgeException IncorrectPersonAgeException) {
//            System.out.println("Введен некорректный возраст!");
//        } finally {
//            System.out.println("Здесь в любом случае выполнится блок finally");
//        }
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("Вторая ошибка поймана!");
//        } finally {
//            System.out.println("Здесь в любом случае выполнится блок finally");
//        }
        Person person = new Person(-2, "");
    }


}




