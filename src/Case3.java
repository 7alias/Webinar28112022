import java.util.Arrays;

public class Case3 {
    public static void main(String[] args) {
        System.out.println(digitalRoot(493193));
    }

    private static int digitalRoot(int n) {
        int res = Arrays.stream(String.valueOf(n).split(""))
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);

        return res <= 9 ? res : digitalRoot(res);
    }
}
