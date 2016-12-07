This repository
Search
Pull requests
Issues
Gist
 @WeissenbachMarkus
 Watch 0
  Star 0
  Fork 0 WeissenbachMarkus/W-rterLesen
 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Pulse  Graphs  Settings
Branch: master Find file Copy pathW-rterLesen/src/main/java/com/mycompany/woerterzaehlen/lesen.java
5a53fac  25 minutes ago
 weiss No commit message
0 contributors
RawBlameHistory     
68 lines (42 sloc)  1.37 KB
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */repository
Search
Pull requests
Issues
Gist
 @WeissenbachMarkus
 Watch 0
  Star 0
  Fork 0 WeissenbachMarkus/W-rterLesen
 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Pulse  Graphs  Settings
Branch: master Find file Copy pathW-rterLesen/src/main/java/com/mycompany/woerterzaehlen/lesen.java
5a53fac  25 minutes ago
 weiss No commit message
0 contributors
RawBlameHistory     
68 lines (42 sloc)  1.37 KB
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.woerterzaehlen;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


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