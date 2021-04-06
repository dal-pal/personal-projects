package org.dal;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {
        Scanner fileInput = new Scanner(System.in);
        System.out.print( "Please locate CSV file: " );
        String path = fileInput.nextLine();


        CSVReader reader = new CSVReader(new FileReader(path));
        List<String[]> csvOutput = reader.readAll();

        String csvInfo = "";
        int count = 0;

        for (String[] lineStrings : csvOutput) {
            for (int i = 0; i < lineStrings.length; i++) {
                if (lineStrings[i] == null || lineStrings[i].equals("")) {
                }
                else
                    lineStrings[i] = "\\\"" +
                            lineStrings[i].replaceAll("\"","\\\"").trim() +
                            "\\\"";
            }

            if (count < csvOutput.toArray().length - 1) {
                csvInfo = csvInfo + "\"" + Arrays.toString(lineStrings).replace("[", "").replace("]", "") + "\",\n";
            } else {
                csvInfo = csvInfo + "\"" + Arrays.toString(lineStrings).replace("[", "").replace("]", "") + "\"\n";
            }
            count++;
        }

        System.out.println(new CallBuilder(path, csvInfo).callBuilder(path, csvInfo.replaceAll(", ",",")));
    }
}
