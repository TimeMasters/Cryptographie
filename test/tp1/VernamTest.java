package tp1;

import org.junit.Test;

public class VernamTest {
    
    @Test
    public void testChiffrer1() 
    {
        int message[] = {1,0,0,1,0,0,1,1,1,0,0};
        int cle[] ={1,1,0};
        int res[] = Vernam.chiffrer(message, cle);
        System.out.println("Chiffrage du message");
        for (int i = 0;i<res.length;i++)
        {
            System.out.print(res[i]);
        }
        System.out.println("");
    }
    
    @Test
    public void testChiffrer2() 
    {
        int message[] = {0,1,0,0,1,0,0,0,1,1,1};
        int cle[] ={1,1,0};
        int res[] = Vernam.chiffrer(message, cle);
        System.out.println("Dechiffrage du message");
        for (int i = 0;i<res.length;i++)
        {
            System.out.print(res[i]);
        }
        System.out.println("");
    }
}
