package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LinearFunction functionVariable = new LinearFunction();

        ArrayList<LinearFunction> arrFunctions = new ArrayList<LinearFunction>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));
            String nextLine = br.readLine();

            while(nextLine != null) {
                nextLine = br.readLine();
                functionVariable.functionClass = nextLine;
                arrFunctions.add(functionVariable);
            }
        } catch (IOException e) {}

        for (int i = 0; i < arrFunctions.size(); i++) {
            System.out.println(arrFunctions.get(i));
        }

    }
}
