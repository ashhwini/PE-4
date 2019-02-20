package com.stackroute.unittest;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurencesOfWord {
    public static String[] multipleOccurencesOfWord(String string,String word)
    {

        String str="";
        Pattern p =Pattern.compile(word);
        Matcher m = p.matcher(string);
        while (m.find()){
            str+="Found at: "+m.start()+" - "+m.end()+",";
        }
        String[] output = str.split(",");
        return output;
    }

}
