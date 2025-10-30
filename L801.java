import java.util.Scanner;

public class L801 {

    public static void numeros(int n) {
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(i + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para n: ");
        int n = scanner.nextInt();

        numeros(n);

        scanner.close();
    }
}
