package fr.uvsq.florianldm;

public class Vendeur extends Employe {
    /** Commission du vendeur. */
    private int commission;

    /**
     * Constructeur.
     * @param nom vendeur.
     * @param anciennete vendeur.
     */
    public Vendeur(final String nom, final int anciennete) {
        super(nom, anciennete);
    }

    /**
     * setter.
     * @param commission1 vendeur.
     */
    public void setCommission(final int commission1) {
        this.commission = commission1;
    }

    /**
     * getter.
     * @return commission vendeur.
     */
    public int getCommission() {
        return commission;
    }

    /**
     * calcul du salaire.
     * @return salaire.
     */
    @Override
    public int calculSalaire() {
        return (this.getSalaire() + (20 * this.getAnciennete())) + this.commission;
    }
}
