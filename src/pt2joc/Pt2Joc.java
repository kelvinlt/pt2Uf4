/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt2joc;

import java.util.Random;

/**
 *
 * @author x2382383c
 */
public class Pt2Joc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt((10 - 0)+1)+0;
        System.out.println(randomNum);
    }
    
}
