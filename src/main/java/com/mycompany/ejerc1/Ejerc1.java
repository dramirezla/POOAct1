/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerc1;

/**
 *
 * @author David R.L
 */
import java.util.*;
public class Ejerc1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int juan,ana,alber,mama;
        juan=entrada.nextInt();
        alber=(juan*2)/3;
        ana=(juan*4)/3;
        mama=juan+alber+ana;
        System.out.println("La edad de juan es: "+juan);
        System.out.println("La edad de alber es: "+alber);
        System.out.println("La edad de ana es: "+ana);
        System.out.println("La edad de mama es: "+mama);
    }
}
