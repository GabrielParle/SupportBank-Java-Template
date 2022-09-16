package training.supportbank;

import java.io.IOException;

import java.text.ParseException;

import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String args[]) throws IOException, ParseException {
        // Your code here!

        CsvReader csv = new CsvReader();
        csv.test();
        //while loop for user inout request
        while(true) {
            Userinput.requestUserInput();
        }
    }
    //Transaction one = new Transaction("john","mark",100,"narrative",29/12/2014);
    //System.out.println(one.amount)
}