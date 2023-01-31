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
public class Osoba {
    String ime;
    int god;
    public Osoba(String para_ime,int para_god) {
        this.ime=para_ime;
        this.god=para_god;
    
    }  
    int mnozenje(int x , int y ) {
         return x*y;
    }              
    
}

class Torba {
        String boja;
        int nosivost;
        int punoca;
        public Torba(String para_boja,int para_nosivost,int para_punoca){
        this.boja=para_boja;
        this.nosivost=para_nosivost;
        this.punoca=para_punoca;
     
    }

       
            
}       
