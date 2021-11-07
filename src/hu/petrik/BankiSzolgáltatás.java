package hu.petrik;

public class BankiSzolgáltatás {
    private Tulajdonos tulajdonos;

    public BankiSzolgáltatás(Tulajdonos tulajdonos){
        this.tulajdonos = tulajdonos;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

}
