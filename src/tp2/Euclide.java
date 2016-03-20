package tp2;

/**
 *
 * @author jgoodwin
 */
public class Euclide 
{
    public static int[] algoEtendu(int a,int b) throws Exception 
    {
        if (a<b || b<1)
            throw new Exception("a<b ou b<1");
        int r = a%b;
        int q = (a-r)/b;
        if (r == 1)
        {
            int tab[] = {r,-q};
            return tab;
        }
        else
        {
            int tab[] = algoEtendu(b, r);
            tab[0] = tab[0]-(q*tab[1]);
            int t = tab[0]; tab[0] = tab[1]; tab[1] = t;
            return tab;
        }
    }
    
    public static int inverse(int n, int m) throws Exception
    {
        return Euclide.algoEtendu(m, n)[1];
    }
}
