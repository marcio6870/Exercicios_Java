import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex21_TryCatch_AboutMe{

    public static void main(String[] args) {
        //criando o objeto scanner

        try{
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.println("Digite sua idade: ");
        double idade = scan.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e alturam precisam ser numéricos");
        }
    }
}