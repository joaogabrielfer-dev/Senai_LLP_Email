import java.util.Scanner;

public class RomanoParaInt {

    public static int valor(char letra) {
        switch (letra) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número romano:");
        String romano = ler.nextLine().toUpperCase();

        int resultado = 0;

        for (int i = 0; i < romano.length() - 1; i++) {

            int valorAtual = valor(romano.charAt(i));
            int proximoValor = valor(romano.charAt(i + 1));

            if (valorAtual < proximoValor) {
                resultado -= valorAtual;
            } else {
                resultado += valorAtual;
            }
        }

        resultado += valor(romano.charAt(romano.length() - 1));

        System.out.println("Resultado: " + resultado);

        ler.close();
    }
}