package com.h2;

import java.lang.instrument.IllegalClassFormatException;

public class Utilities {
    public static long getLongValue(String in){
        long out = Long.MIN_VALUE;
        try{
            out = Long.MIN_VALUE;
        }
        catch (NumberFormatException e){
            new IllegalClassFormatException(in + " cannot be converted into a 'long' value. Exiting program.");

        }
        return out;
    }
}
