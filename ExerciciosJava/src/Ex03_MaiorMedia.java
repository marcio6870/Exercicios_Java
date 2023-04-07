import java.util.Scanner;
/*faça um programa que pede 5 vezes um numero e após solicitar mostra 
 * o maior numero e a media dos numero digitados.
*/
public class Ex03_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;
        do {
            System.out.println("Numero: ");
            numero =scan.nextInt();

            soma = soma + numero;
            
            if (numero > maior) maior = numero;

            count = count + 1;
            
        }while(count < 5);

        System.out.println("Maior: "+ maior);
        System.out.println("Media: "+ (soma / 5));
        
    }
}
