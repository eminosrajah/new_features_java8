package com.example.demo.String_Joiner;

import java.lang.String;
import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args){

        String[] words={"Rajah","Amir","Islem","Anoir"};

        StringJoiner sj= new StringJoiner(",","{","}"); //with StringJoiner
        //String all="{"; //immutable
        sj.setEmptyValue("no data added"); //with StringJoiner
        for (String word : words) {
            //all+=word + " , "; // (number of words in collection)4 memory locations
            sj.add(word);// just one memory location

        }
        //all+="}";
        //System.out.println(all); // Classic method
        System.out.println(sj); // With StringJoiner

    }
}
