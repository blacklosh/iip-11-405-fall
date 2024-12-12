package org.example2;

public class Main {

    public static void main(String[] args) {
        UserDataValidator validator = new UserDataFormatValidator();

        String email = "fedorbk.ru";
        String password = "qwerty007";

        System.out.println(validator.isCorrectEmail(email));
        System.out.println(validator.isCorrectPassword(password));
    }
}
