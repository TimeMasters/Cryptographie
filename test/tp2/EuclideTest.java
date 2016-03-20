package tp2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EuclideTest 
{
    @Test
    public void testAlgoEtendu() throws Exception 
    {
        int[] tab = Euclide.algoEtendu(26, 15);
        System.out.println(tab[0]+" "+tab[1]);
    }
    
    @Test
    public void testInverse() throws Exception
    {
        System.out.println(Euclide.inverse(51, 242));
    }
}
