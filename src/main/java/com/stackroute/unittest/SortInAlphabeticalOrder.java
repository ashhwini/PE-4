package com.stackroute.unittest;

import java.util.Arrays;

public class SortInAlphabeticalOrder {
    public String sortInAlphabeticalOrder(String str)
    {
        String string = str.replaceAll("\\s+","");
        char[] temp = string.toCharArray();

        Arrays.sort(temp);

        String sort = new String(temp);

        return sort;

    }
}
