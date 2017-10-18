package by.it.sc04_evening_tue_thu.yanushkevich.lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {



        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            ArrayList<String> listOfStrings = new ArrayList<String>();

            String currentString;

            while (!(currentString = reader.readLine()).equals("END")) {

                listOfStrings.add(currentString);

            }

            System.out.println(listOfStrings);

        }

    }

