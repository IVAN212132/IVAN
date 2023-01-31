package org.etsntesla.arm;

import org.etsntesla.arm.osobe.Osoba;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1;
        Osoba osoba2;
        osoba1= new Osoba("Zika" , 17);
        osoba2= new Osoba("Pera" , 18);
        System.out.println(Osoba.brOsoba);
        Osoba[] nizOsoba= new Osoba[3];
        nizOsoba[0]=osoba1;
        nizOsoba[1]=osoba2;
        nizOsoba[2]= new Osoba("Mirko" , 18);


        }

    }






