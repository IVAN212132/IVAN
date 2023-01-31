package org.etsntesla.arm.osobe;

public class Osoba {
   private String ime;
     public int god;
      public static int brOsoba=0;

      public String getime(){
          return this.ime;
      }
      public  void String setime(String ime){
          this.ime=ime;
      }

     public Osoba(String ime , int god){
         this.god=god;
         this.ime= ime;
         brOsoba++;
     }

     }



}





