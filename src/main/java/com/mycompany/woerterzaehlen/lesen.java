package com.mycompany.woerterzaehlen;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author weiss
 */
public class lesen {

  
    
    
    public static void main(String[] args) {


        BufferedReader br = null;
        FileReader fr = null;

        try {
            
            fr = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\mycompany\\woerterzaehlen\\woerter.txt");
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(fr);

            while ((sCurrentLine = br.readLine()) != null) {
               System.out.println("Anzahl Woerter: "+ sCurrentLine.split(" ").length);
                
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}