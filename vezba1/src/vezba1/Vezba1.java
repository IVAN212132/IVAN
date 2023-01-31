
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba1;

/**
 *
 * @author Korisnik
 */
public class Vezba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // telo metode main 
        // String pozdrav; //definicija
        // pozdrav="Hello world"; //inicijalizacija 
        String pozdrav="Hello world";
        //System.out.println("Poruka dana je:");
        //System.out.println("Pozdrav brate");
        String poruka="Poruka dana je ";
       System.out.println(poruka+pozdrav);
     
       
           //definicija objekata osoba1 i osoba2
           Osoba osoba1;
           Osoba osoba2;
           //inicijalizacija osobe1 i osobe2
           osoba1=new Osoba("Mika",17);
           osoba2=new Osoba("Pera",16);
           
          Torba  torba1 =new Torba("Plava",50,60);
          Torba  torba2 =new Torba ("Zelena",70,80);
           System.out.println("torba1 ima boju " + torba1.boja );
           System.out.println("torba2 ima boju " + torba2.boja );
            
           
           
           int c;
           c=osoba1.mnozenje(4,5);
           System.out.println(c);
       
    }
           
}
