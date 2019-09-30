package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> primeList = new ArrayList<Integer>();
        String maxString = JOptionPane.showInputDialog(null, "skriv inn max tall for å generere primtall opp til");
        int max =   Integer.parseInt(maxString);

        boolean flag;       //flagg som blir true hvis det er primtall
        int i = 2;           //tall for å sjekke om er primtall
        int o = 0;         //tall som skal deles med i   i / n    (bare primtall her)  altså hvis primtall n = i;
        int sumPrim = 0;
                                    // 2 blir ikke med på denne måten...
        for (o = 2; o < max; o+=1) {     //o skal sjekkes om er primtall.    starter på 1 med 2 increment (prim er
            // odd)

            flag = true;                 //for hver break starter o på neste tall fordi da vet vi at forrige o ikke er
            // prim

            for (i=2; i <= Math.sqrt(o); i++) {
                if(o==1){
                    flag = false;
                    break;
                }                   //i er tallet o deles på for å sjekke om moduloen blir 0.    legg det i en liste
                                    // istede for en "sum" variabel.
                if(o==2){
                    System.out.println(o);
                }
                if(o%i==0){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                sumPrim = o + sumPrim;    //vanlig addisjon er litt tregt?
                primeList.add(o);

            }
        }


        double average = (double)sumPrim/primeList.size();


        for(int k = 0; k<primeList.size();k++){
            System.out.println(primeList.get(k));
        }
        System.out.println("Gjennomsnittet av alle primtall i lista med "+primeList.size() +" elementer blir " + average);
    }
}