package integer;
public class integersum {
    public static int digitsum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int lastdigit = n%10;
            sum = sum+lastdigit;
             n = n/10;

        }
        return sum;
    }
    public static void main(String[] args) {
        int result = digitsum(144456);
        System.out.println("Sum of the digits is: "+result);
    }
}
