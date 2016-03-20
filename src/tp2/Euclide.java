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
    
    /**
     * Retourne le résultat de x^p modulo n
     * @param x
     * @param p
     * @param n
     * @return 
     */
    public static int restexpmn(int x, int p, int n)
    {
        int resultat = p;
        int compteur = 1;
        int i = 1;
        while (resultat != 1)
        {
            resultat = resultat/2;
            compteur = compteur * 2;
            i += 1;
        }
        int resultab[] = new int[i];
        for (int j=0; j<i+1;j++)
        {
            if (p>0 && compteur <= p)
            {
                resultab[(i-j)-1] = 1;
                p = p - compteur;
            }
            compteur = compteur/2;
        }
        int fini = x%n;
        int r = 1;
        for (int j = 0; j < i; j++)
        {
            if (j>0)
                fini = (fini*fini)%n;
            if (resultab[j] == 1)
                r = (r*fini)%n;
        }
        return r;
    }
}
