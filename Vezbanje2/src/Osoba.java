public class Osoba {
    private int god;

    private String ime;
    public static int brosoba=0;
    public String getIme(){
        return this.ime;
    }
    public void setIme(){
        this.ime=ime;
    }
    public Osoba(String _ime,int _god){
        this.ime=_ime;
        this.god=_god;
        Osoba.brosoba++;
    }
    static boolean proveraPunoletsva(Osoba o){
        if (o.god>=18)
            return true;
        else
            return false;


        }
    public int getGod() {
        return this.god;
    }
    public void SetGod(int god) {
        this.god=god;
    }
    public void vezbanje() {
        System.out.println(this.ime + " radi fizicke vezbe");
    }
    public void vezbanje(Osoba osoba) {
    System.out.println(this.ime + " vezba zajedno sa " +osoba.ime );
    }
    public boolean vezbanje(int x){
        if (x > 100)
            return true;
        else{
            return false;
        }
    }
}
