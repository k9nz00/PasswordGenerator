package com.github.k9nz00.app.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordFactoryImpl implements PasswordFactory{
    @Override
    public List<String> getPassword(int passwordsCount, int passwordLength, List<String> symbols) {
        List<String> passwords = new ArrayList<>();
        for (int i = 0; i < passwordsCount; i++) {
            StringBuilder password = new StringBuilder();
            for (int j = 0; j < passwordLength; j++) {
                String symbol = symbols.get(new Random().nextInt(symbols.size()));
                password.append(symbol);
            }
            passwords.add(password.toString());
        }
        return passwords;
    }
}
