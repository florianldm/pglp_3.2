package fr.uvsq.florianldm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GestionSalairesTest {
    /** Init. */
    GestionSalaires g;

    /**
     * Initialisation liste d'employes.
     */
    @Before
    public void initListEmploye() {
        g = new GestionSalaires();
        Employe e = new Employe("Jean",10);
        Vendeur v = new Vendeur("Paul", 5);
        v.setCommission(200);
        g.ajoutEmployeEntreprise(e);
        g.ajoutEmployeEntreprise(v);
    }

    /**
     * test de calcul de salaires.
     */
    @Test
    public void testSalaires() {
        int salaire = g.calculSalairesEntreprise();
        Assert.assertEquals(salaire, 3500);
    }

}
