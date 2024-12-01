package uni.sw.unit.testing;

public class Fibo
{
    /* indices and values
     * 0 1 2 3 4 5 6  7  8  9 10 11  12  13  14  15  16   17   18   19   20    21    22    23
     * 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657
     */
    public int getFiboNumberIterative(int n)
    {
        if(n <= 1) return n;
        int result = 0;

        int left = 0;
        int right = 1;

        for(int i = 1; i < n; i++)
        {
            result = left + right;
            left = right;
            right = result;
        }

        return  result;
    }

    public int getFiboNumberRecursive(int n)
    {
        if(n == 0) return 0;

        if(n == 1) return 1;

        return getFiboNumberRecursive(n - 1) + getFiboNumberRecursive(n - 2);
    }

}
