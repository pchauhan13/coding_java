public class Program_23 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--)
        {
            for (int k = i; k >= 0; k--)
            {
                if (k == 6)
                {
                    break;
                }
                if (k == 8)
                {
                    continue;
                }
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}