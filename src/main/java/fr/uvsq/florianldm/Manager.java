package fr.uvsq.florianldm;

import java.util.ArrayList;

public class Manager extends Employe {
    /**Liste des employés qu'il gère.*/
    private ArrayList<Employe> employesgeres;

    /**
     * Constructeur.
     * @param nom manager.
     * @param anciennete manager.
     */
    public Manager(final String nom, final int anciennete) {
        super(nom, anciennete);
        employesgeres = new ArrayList<Employe>();
    }

    /**
     * Ajout employe sous la direction.
     * @param e Employe.
     */
    public void ajoutEmploye(final Employe e) {
        employesgeres.add(e);
    }

    /**
     * getter.
     * @return nombre employes gérés.
     */
    public int getNombreEmployes() {
        int cpt = 0;
        for (Employe e : employesgeres) {
            cpt++;
        }
        return cpt;
    }

    /**
     * Calcul du salaire manager.
     * @return salaire calculé.
     */
    @Override
    public int calculSalaire() {
        return (this.getSalaire() + 20 * this.getAnciennete()) + 100 * this.getNombreEmployes();
    }
}
