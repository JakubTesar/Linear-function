package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LinearFunction functionVariable = new LinearFunction();

        ArrayList<LinearFunction> arrFunctions = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));
            String nextLine = br.readLine();

            for (int i = 0; nextLine != null; i++) {
                functionVariable.functionClass = nextLine;
                arrFunctions.add(functionVariable);
                nextLine = br.readLine();

                System.out.println(arrFunctions.get(i).functionClass);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = arrFunctions.size();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
                bw.write(count+"");
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("count_distinct.txt"));
            for (int i = 0; i < arrFunctions.size(); i++) {
                bw.write(arrFunctions.get(i).functionClass);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(count);
    }
}