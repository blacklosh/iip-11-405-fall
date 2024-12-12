package org.example2;

public class UserDataFormatValidator implements UserDataValidator{

    @Override
    public boolean isCorrectEmail(String email) {
        return email.contains("@");
    }

    @Override
    public boolean isCorrectPassword(String password) {
        return password.length() > 4;
    }
}
