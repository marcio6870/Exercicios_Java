import java.util.concurrent.ThreadLocalRandom;
public class Ex15_ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada >= 0){
            Double valorDoce = valorAleatorio();
         
            if(valorDoce <= mesada);        
           
            System.out.println("Valor do doce: "+ valorDoce + " Adicionar ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: "+ mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
    }private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
        
    }
}
