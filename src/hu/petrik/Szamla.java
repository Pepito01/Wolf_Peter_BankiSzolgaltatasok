package hu.petrik;

public abstract class Szamla extends BankiSzolgáltatás {
    protected int aktEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktEgyenleg() {
        return aktEgyenleg;
    }

    public void befiz(int osszeg){
        this.aktEgyenleg+= osszeg;
    }

    public abstract boolean kivesz(int osszeg);

    public Kártya ujKartya(String kSzam){
        return new Kártya(getTulajdonos(), kSzam, this);
    }

}


