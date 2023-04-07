import java.util.Scanner;
/*Faça um programa que solicita nome e idade continuamente e só para 
quando for inserido 0 no nome 
 */
public class Ex01_NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Fim");
    }
        


}

    

