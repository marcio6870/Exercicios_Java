import java.util.Scanner;

public class Ex05_Tabuada {
/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
 * numero inteiro entre 1 a 10. O usuário deve infromar de qual 
 * numero ele deseja ver a tabuada. A saida deve ser conforme o exemplo
 * abaixo
 * 
 * Tabuada de:
 * 5x1=5
 * 5x2=10
 * ...
 * 5x10=50
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("tabuada de " + tabuada);
        for(int i = 1; i <= 10; i = i + 1){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));

        }
    }

    
}
