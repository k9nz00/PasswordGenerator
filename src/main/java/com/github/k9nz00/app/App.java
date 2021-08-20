package com.github.k9nz00.app;

import com.github.k9nz00.app.factory.PasswordFactory;
import com.github.k9nz00.app.factory.PasswordFactoryImpl;

import java.util.Collections;
import java.util.List;

public class App {

    public void start(String[] args) {
        int passwordsCount = Utils.getPasswordsCount(args);
        int passwordLength = Utils.getPasswordLength(args);
        List<String> symbols = Utils.getSymbols();
        Collections.shuffle(symbols);

        PasswordFactory ps = new PasswordFactoryImpl();
        List<String> passwords = ps.getPassword(passwordsCount, passwordLength, symbols);

        System.out.printf("Generated passwords: %s%n", passwordsCount);
        printPassword(passwords);
    }

    private void printPassword(List<String> passwords) {

        for (int i = 1; i <= passwords.size(); i++) {
            System.out.printf("%d: %s%n", i, passwords.get(i - 1));
        }
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
