/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt2joc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import joc.joc;
import joc.numeros.jocEndevinaNumero;

/**
 *
 * @author x2382383c
 */
public class Pt2Joc {
    
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testEndevinaNumero();
    }
    
    public static void triaJoc(){
    
    }
    
    public static void testEndevinaNumero(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("---------------------------------------");
            System.out.println("Test de la clase endevinaNumero");
            System.out.println("Escoge las vidas iniciales");
            System.out.println("---------------------------------------");
            int n = Integer.parseInt(br.readLine());
            jocEndevinaNumero joc1 = new jocEndevinaNumero(numeroRandom010(), n);
            
            joc1.juga();
            System.out.println("Test finalizado!");
            System.out.println("---------------------------------");
            
        } catch (Exception e) {
        }

    }
    
    public static int numeroRandom010(){
        Random r = new Random();
        int randomNum = r.nextInt((10 - 0)+1)+0;
        return randomNum;
    }
}
