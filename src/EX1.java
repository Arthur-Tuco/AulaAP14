import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qntdAlunos = 3;
        int qntdNotas = 4;

        float[][] notas = new float[qntdAlunos][qntdNotas];

        preencherNotas(notas, scanner);

        System.out.println("--- BOLETIM DA TURMA ---");
        imprimirMatriz(notas);
    }

    public static void preencherNotas(float[][] matriz, Scanner scanner) {
        System.out.println("--- Preenchendo a Matriz ---");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("--- Nota do Aluno " + (i + 1) + "---");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("--- Avaliação " + (j + 1) + "---");
                matriz[i][j] = scanner.nextFloat();
            }
        }
    }

    public static void imprimirMatriz(float[][] matriz) {
        System.out.println("--- Imprimindo a Matriz ---");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":\t");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Nota: %.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
    }
}