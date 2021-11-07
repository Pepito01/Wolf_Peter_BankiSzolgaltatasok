package hu.petrik;

public class HitelSzámla extends Szamla {
    private int hitelKeret;

    public HitelSzámla(Tulajdonos tulajdonos, int hitelKeret ) {
        super (tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
            boolean ertek = false;

            if (this.hitelKeret <(getAktEgyenleg() )){
                ertek = true;
            }

        return ertek;

    }
}
