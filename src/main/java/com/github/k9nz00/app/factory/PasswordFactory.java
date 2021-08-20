package com.github.k9nz00.app.factory;

import java.util.List;

public interface PasswordFactory {

    List<String> getPassword(int passwordsCount, int passwordLength, List<String> symbols);
}
