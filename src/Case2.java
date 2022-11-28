public class Case2 {
    public static void main(String[] args) {

        System.out.println(digitalRoot(16));
    }
    private static  int digitalRoot(int n){
        int res = 0;

        while (n>0) {
            res += n % 10;
            n /= 10;
        }
         if (n>9){return digitalRoot(res);}
        return res;
    }
}
