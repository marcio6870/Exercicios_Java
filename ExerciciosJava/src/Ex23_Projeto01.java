import java.util.concurrent.ThreadLocalRandom;
public class Ex23_Projeto01{
    public static void main(String[] args) {      
        
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    
    
    }
    static void imprimirSelecionados(){
        String[] candidatos ={"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° "+(indice+1)+" é "+candidatos[indice]);
        }
        System.out.println("Forma abrevida de interação for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }

    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatoSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendidio = valorPretendido();

            System.out.println("O candidato "+ candidato+" solicitou este valor de salário "+ salarioPretendidio);
            if(salarioBase >= salarioPretendidio){
                System.out.println("O candidato "+ candidato+" foi selecionado para a vaga");
                candidatoSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendidio){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendidio){
            System.out.println("Ligar para o Candidato");
        }else if(salarioBase == salarioPretendidio){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }

}