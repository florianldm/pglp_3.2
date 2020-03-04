package fr.uvsq.florianldm;

public class Vendeur extends Employe{
    private int commission;

    public Vendeur(String nom, int anciennete){
        super(nom, anciennete);
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getCommission() {
        return commission;
    }

    @Override
    public int calculSalaire(){
        return (this.getSalaire() + (20 * this.getAnciennete())) + this.commission;
    }
}
