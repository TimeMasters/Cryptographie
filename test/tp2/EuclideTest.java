package tp2;


import org.junit.Test;


public class EuclideTest 
{
    @Test
    public void testAlgoEtendu() throws Exception 
    {
        //26u+15v =1
        int[] tab = Euclide.algoEtendu(26, 15);
                                     //26u+15v =1
        System.out.println("algo etendu");
        System.out.println(tab[0]+" "+tab[1]);
    }
    
    @Test
    public void testInverse() throws Exception
    {
        //Inverse de 15 , modulo 26
        System.out.println("inverse de a modulo b");
        System.out.println(Euclide.inverse(15, 26));
    }
    
    @Test
    public void test_restexpmn() throws Exception
    {
        //Retourne le reste de x^p modulo n
        
        System.out.println("reste xpmn");
        System.out.println(Euclide.restexpmn(7,2,11));
        // reste modulo 11 de                7 au carré
    }
}
