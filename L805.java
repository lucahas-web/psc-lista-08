import java.util.Scanner;

public class L805 {
    public static void somaImposto(double taxaImposto, double custo){
        double valorFinal = (taxaImposto * custo) + custo;
        System.out.println("O valor final é " + valorFinal);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a taxa de imposto: ");
        double a = scanner.nextDouble();
        double ti = a/100;
        System.out.print("Insira o custo: ");
        double b = scanner.nextDouble();
        somaImposto(ti, b);
    }
}
