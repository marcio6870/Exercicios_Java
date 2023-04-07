import java.util.Scanner;

public class Ex02_Nota {
    /*Digite uma nota esteja menor que 0 e maior do que 10, se for
    digitado uma nota entre 0 e 10 o programa finaliza.  
     */
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota Inválida, digite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Fim do Programa.");
    }
}
