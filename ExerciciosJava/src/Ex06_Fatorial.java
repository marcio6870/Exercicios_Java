import java.util.Scanner;
public class Ex06_Fatorial {
    /*
     * Faça um rograma que calcule o fatorial de um número inteiro
     * fornecido pelo usuário EX: 5!= 120 (5x4x3x2x1).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial +"! = ");
        for(int i = fatorial; i >= 1; i --){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
    
}
