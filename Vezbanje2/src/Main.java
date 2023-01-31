public class Main {

    public static void main(String[] args) {

//        int x= 5, y=3;
//        Osoba [] putnici= new Osoba[4];
//        Osoba osoba1= new Osoba("Mika",17);
//        Osoba osoba2= new Osoba("Zika",18);
//        Osoba osoba3= new Osoba("Vlada", 14);
//        x = y;
//        osoba1 = osoba2;
//        y=y+1;
//        System.out.println("x=" +x+" y=" +y);
//        osoba2.god++;
//        System.out.println(osoba1.ime+" ima "+ osoba1.god+" godina,a "+osoba2.ime+" ima "+osoba2.god+" godina.");
//        System.out.println("Broj osoba: " +Osoba.brosoba);
//        putnici[1]= new Osoba("Stefan", 17);

        Osoba osoba4 = new Osoba("Miika",17);
        Osoba osoba5 = new Osoba("Ziika" , 18);

        System.out.println("Ukupan broj osoba je: " + Osoba.brosoba);
        Osoba[] nizOsoba=new Osoba[3];
        nizOsoba[0] = osoba4;
        nizOsoba[1] = osoba5;
        nizOsoba[2]= new Osoba("Zika", 17);
        for (Osoba os:nizOsoba){
            if (Osoba.proveraPunoletsva(os)) {
                System.out.println(os.getIme()+" je punoletna");

            }
                else{
                    System.out.println(os.getIme()+" nije punoletna");
            }

        }
        System.out.println("Ukupan broj osoba je: " + Osoba.brosoba);
        osoba4.vezbanje();
        osoba5.vezbanje(osoba4);
    }
}