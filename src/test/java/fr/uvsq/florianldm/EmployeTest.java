package fr.uvsq.florianldm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeTest {
    /** Employe. */
    Employe e;

    /**
     * Initialisation employe.
     */
    @Before
    public void initEmploye() {
        e = new Employe("Edouard", 15);
    }

    /**
     * test instance d'employe.
     */
    @Test
    public void testInstance() {
        Assert.assertTrue(e.getNom().equals("Edouard") && e.getAnciennete() == 15);
    }

    /**
     * test du calcul de salaire.
     */
    @Test
    public void testSalaire() {
        Assert.assertTrue(e.calculSalaire() == 15 * 20 + e.getSalaire());
    }
}
