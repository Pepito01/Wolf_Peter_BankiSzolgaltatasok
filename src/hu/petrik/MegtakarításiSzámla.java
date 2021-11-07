package hu.petrik;

public class MegtakarításiSzámla extends Szamla {
    private double kamat;
    public static double alapKamat;

    public MegtakarításiSzámla (Tulajdonos tulajdonos, double kamat){
        super (tulajdonos);
        this.kamat = kamat;
    }

    public static double getAlapKamat() {
        return alapKamat;
    }

    public  void setAlapKamat(double alapKamat) {
        this.alapKamat = alapKamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        boolean teljesult = false;
        if(0 < (getAktEgyenleg()-osszeg)){
            teljesult = true;
        }

        return teljesult;
    }

    public void kamatJovairas(){

    }
}
