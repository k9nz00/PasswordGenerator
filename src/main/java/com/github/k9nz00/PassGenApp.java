package com.github.k9nz00;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class PassGenApp
{
    public static void main( String[] args )
    {
        log.info(Arrays.toString(args));
        log.info("Hello World, from my app!");
    }
}
