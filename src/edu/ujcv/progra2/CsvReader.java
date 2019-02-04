package edu.ujcv.progra2;

import java.io.*;
import java.util.ArrayList;

public class CsvReader {

   // FileInputStream
    //FileReader
    //BufferedReader


    public int[] getResults(){
        int[] retval = {};
        String csvFile = "test.csv";
        //define un bufferd reader.
        BufferedReader br = null;
        String line = "";
        // delimitador
        String cvsSplitBy = ",";
        ArrayList<ModeloDatos> modelos = new ArrayList<>();

        int i  = 0;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                if(i == 0){
                    i++;
                    continue;
                }

                String[] columnas = line.split(cvsSplitBy);

                ModeloDatos modelo = new ModeloDatos(columnas);

                modelos.add(modelo);
                i++;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        ModeloDatos modelo1 = modelos.get(0);

        ModeloDatos modelo2 = modelos.get(1);

        retval = modelo1.add(modelo2);


        return retval;
    }

}
