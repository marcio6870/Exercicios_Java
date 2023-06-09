import java.util.Random;

/*
 * Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * amarzene-os num vetor. Ao final mostre os númenros e seus sucessores.
 */
public class EX09_NumeroAleatorio {
    public static void main(String[] args) {
        Random radom = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = radom.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Numeros Aleatórios: ");
        for (int numero  : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessor Aleatórios: ");
        for (int numero  : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
