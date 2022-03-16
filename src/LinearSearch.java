import java.util.*;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int a[] = new int[n];
        int key = ip.nextInt();
        for (int i=0; i<n; i++)
        {
            a[i] = ip.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                System.out.println(a[i] + " ");
            }
        }
    }
}