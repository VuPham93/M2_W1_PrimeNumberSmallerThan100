public class PrimeNumberSmallerThan100 {
    public static void main(String[] args) {
        System.out.print("Dãy số nguyên tố nhỏ hơn 100: ");
        for (int N = 2; N < 100; N++) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    if (i == N) {
                        System.out.print(N + ", ");
                    }
                    break;
                }
            }
        }
    }
}
