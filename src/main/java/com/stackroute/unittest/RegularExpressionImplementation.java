package com.stackroute.unittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionImplementation {
    public String regularexpression(String string, String word)
    {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(string);

        if(matcher.find()) {
            return ("Is "+word+" here ? true");
        }
        else
        {
            return ("Is "+word+" here ? false");
        }

    }

}
