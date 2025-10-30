import java.util.Scanner;

public class L806 {

    public static int converterHora(int hora24, char[] periodo) {
        if (hora24 == 0) {
            periodo[0] = 'A'; 
            return 12;
        } else if (hora24 == 12) {
            periodo[0] = 'P'; 
            return 12;
        } else if (hora24 > 12 && hora24 <= 23) {
            periodo[0] = 'P'; 
            return hora24 - 12;
        } else if (hora24 > 0 && hora24 < 12) {
            periodo[0] = 'A'; 
            return hora24;
        }

        periodo[0] = 'A';
        return 0;
    }

    public static void exibirHora(int hora12, int minuto, char periodo) {
        String sufixo = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %d:%02d %s\n", hora12, minuto, sufixo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir = 'S'; 

        do {
            System.out.print("Digite a hora (0–23): ");
            int hora24 = scanner.nextInt();

            System.out.print("Digite os minutos (0–59): ");
            int minuto = scanner.nextInt();

            if (hora24 < 0 || hora24 > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Horário inválido. Tente novamente.\n");
                continue;
            }

            char[] periodo = new char[1];
            int hora12 = converterHora(hora24, periodo);

            exibirHora(hora12, minuto, periodo[0]);

            System.out.print("Deseja converter outro horário? (S/N): ");
            repetir = scanner.next().toUpperCase().charAt(0);

        } while (repetir == 'S');

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
