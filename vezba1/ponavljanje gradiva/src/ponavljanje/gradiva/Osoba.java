/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponavljanje.gradiva;

/**
 *
 * @author Korisnik
 */
public class Osoba {
        String Ime;
    int god;
    public Osoba(String _ime, int _god){
    this.Ime= _ime;
     this.god=_god;
}
    void pisem (){
    System.out.println("pisem ");
 }
  
    void ucenje (String predmet){
     System.out.println("Ucim " +predmet);
}
    
}
