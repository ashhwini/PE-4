package com.stackroute.unittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceOfCharacter {

    public int occurrenceOfCharacter(String str, char ch)
    {
        String str1 = str.replaceAll(String.valueOf(ch),"");

        int count = str.length()-str1.length();

        return count;
    }

}
