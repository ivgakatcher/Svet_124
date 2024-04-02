import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        System.out.println("введите N и M");
        n = scanner.nextInt();
        m= scanner.nextInt();
        int[] results = new int[n];
        System.out.println("вводите тоннели:");
        for (int i = 0; i < m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            results[from-1]++;
            results[to-1]++;
        }
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]+" ");
        }
    }
}