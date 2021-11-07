package hu.petrik;

public class Kártya extends BankiSzolgáltatás{
    private Szamla szamla;
    private String kSzam;

    public Kártya(Tulajdonos tulajdonos,String kSzam, Szamla szamla){
        super(tulajdonos);
        this.szamla = szamla;
        this.kSzam = kSzam ;
    }

    public String getkSzam() {
        return kSzam;
    }

    public boolean vasarlas(int osszeg){
        return vasarlas(osszeg);
    }
}
