public class ExemploBreakContinue {
    public static void main(String[] args) {
        // interrupção com break, continue pula o numero e imprime o restante 
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                continue;
            }
            System.out.println(numero);
        }
    }
}
