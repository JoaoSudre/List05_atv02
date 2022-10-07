import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Entre com o numero de linhas");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imprimirLinhas(n);

        sc.close();
    }

    private static void imprimirLinhas (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println("  ");
        }
    }
}
