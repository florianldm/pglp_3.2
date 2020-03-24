package fr.uvsq.florianldm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
    /** Init manager. */
    Manager m;

    /**
     * initialisation employe.
     */
    @Before
    public void initEmploye() {
        m = new Manager("Emile", 10);
        Employe e = new Employe("Jean", 15);
        Vendeur v = new Vendeur("Thierry", 10);
        m.ajoutEmploye(e);
        m.ajoutEmploye(v);
    }

    /**
     * testInstance de manager.
     */
    @Test
    public void testInstance() {
        Assert.assertTrue(m.getNom().equals("Emile") && m.getAnciennete() == 10);
    }

    /**
     * test de calcul de salaire.
     */
    @Test
    public void testSalaire() {
        Assert.assertTrue(m.calculSalaire() == (10 * 20 + m.getSalaire()) + 100 * 2);
    }
}
