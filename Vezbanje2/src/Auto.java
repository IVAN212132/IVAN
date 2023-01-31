public class Auto {
    int srbr;
    Osoba[]putnici;
    public Auto(int srbr){
        this.srbr=srbr;
        this.putnici=new Osoba[4];
    }
    boolean ulazak(Osoba putnik, int brSed){
        if (brSed >= 0 && brSed < 4 && putnici[brSed]==null) {
            this.putnici[brSed]=putnik;
            return true;
        }
            else {
            return false;
        }
        }
            boolean izlazak(int brSed){
                if (brSed>=0 && brSed<4 && putnici[brSed]!=null){
                    this.putnici[brSed]=null;
                    return true;
                }
        else{
            return false;
                }
            }


}
