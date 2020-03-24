package fr.uvsq.florianldm;

public class Employe {
    /** Nom Employe.*/
    private String nom;
    /** salaire Employe.*/
    private int salaire = 1500;
    /** anciennete Employe.*/
    private int anciennete;
    /** prime de base Employe.*/
    private static int primebase = 20;

    /**
     * Constructeur.
     * @param nom1 employe.
     * @param anciennete1 employe.
     */
    public Employe(final String nom1, final int anciennete1) {
        this.nom = nom1;
        this.anciennete = anciennete1;
    }

    /**
     * getter.
     * @return nom employe
     */
    public String getNom() {
        return nom;
    }

    /**
     * getter.
     * @return salaire de base
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * getter.
     * @return anciennete
     */
    public int getAnciennete() {
        return anciennete;
    }

    /**
     * Calcul du salaire en fonction de l'ancienneté.
     * @return salaire employe
     */
     public int calculSalaire() {
        return this.salaire + (primebase * this.anciennete);
     }
}
