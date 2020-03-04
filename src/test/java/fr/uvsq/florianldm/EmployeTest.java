package fr.uvsq.florianldm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeTest {
    Employe E;
    @Before
    public void initEmploye(){
        E = new Employe("Edouard", 15);
    }
    @Test
    public void testInstance(){
        Assert.assertTrue(E.getNom().equals("Edouard") && E.getAnciennete() == 15);
    }

    @Test
    public void testSalaire(){
        Assert.assertTrue(E.calculSalaire() == 15 * 20 + E.getSalaire());
    }
}
