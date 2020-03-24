package fr.uvsq.florianldm;
import java.util.ArrayList;

public class GestionSalaires {
    /**Liste employes.*/
    private ArrayList<Employe> listeemployes;

    /**
     * Constructeur.
     */
    public GestionSalaires() {
        listeemployes = new ArrayList<Employe>();
    }

    /**
     * Ajouter un employe dans la liste.
     * @param e employe a ajouter.
     */
    public void ajoutEmployeEntreprise(final Employe e) {
        listeemployes.add(e);
    }

    /**
     * Parcours de la liste et calcul total des salaires.
     * @return salaire total.
     */
    public int calculSalairesEntreprise() {
        int salairetotal = 0;
        for (Employe E : listeemployes) {
            salairetotal += E.calculSalaire();
        }
        return salairetotal;
    }
}
