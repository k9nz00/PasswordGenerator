package com.github.k9nz00.app;

import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class Utils {

    public static int getPasswordsCount(String[] args) {
        int passwordsCount = 0;
        if (args.length != 0) {
            try {
                passwordsCount = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.print("can't parse value from data: {}");
                System.out.println(Arrays.toString(args));
            }
        } else {
            passwordsCount = 5;
        }
        return passwordsCount;
    }

    public static int getPasswordLength(String[] args) {
        int passwordsCount = 0;
        if (args.length != 0) {
            try {
                passwordsCount = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.print("can't parse value from data: {}");
                System.out.println(Arrays.toString(args));
            }
        } else {
            passwordsCount = 12;
        }
        return passwordsCount;
    }

    public static List<String> getSymbols() {
        String symbols = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, !, &, ?, #";

        String[] split = symbols.split(", ");
        return Arrays.stream(split)
                .map(String::trim)
                .collect(Collectors.toList());
    }
}
