package org.example2;

public class UserDataFakeValidator implements UserDataValidator{

    @Override
    public boolean isCorrectEmail(String email) {
        return true;
    }

    @Override
    public boolean isCorrectPassword(String password) {
        return true;
    }
}
