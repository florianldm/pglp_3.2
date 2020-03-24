package fr.uvsq.florianldm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
    /** Init manager. */
    Manager M;

    /**
     * initialisation employe.
     */
    @Before
    public void initEmploye() {
        M = new Manager("Emile", 10);
        Employe E = new Employe("Jean", 15);
        Vendeur V = new Vendeur("Thierry", 10);
        M.ajoutEmploye(E);
        M.ajoutEmploye(V);
    }

    /**
     * testInstance de manager.
     */
    @Test
    public void testInstance() {
        Assert.assertTrue(M.getNom().equals("Emile") && M.getAnciennete() == 10);
    }

    /**
     * test de calcul de salaire.
     */
    @Test
    public void testSalaire() {
        Assert.assertTrue(M.calculSalaire() == (10 * 20 + M.getSalaire()) + 100 * 2);
    }
}
