package com.stackroute.unittest;

public class Transpose {
    public String reverse(String str)
    {
       String[] string = str.split(" ");
       String temp="";
        for(int i=0;i<string.length;i++)
        {
            StringBuffer sbf = new StringBuffer(string[i]);
            temp+=sbf.reverse()+" ";
        }
        temp=temp.trim();
        return temp;

    }

}
