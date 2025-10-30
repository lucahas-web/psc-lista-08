import java.util.Scanner;

public class L804 {
    public static char numero(int a){
        char p = 'P', n = 'N';
        if (a > 0){
            return p;
        } else {
            return n;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        char result = numero(num);
        System.out.println(result);
    }
}
