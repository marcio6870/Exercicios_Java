public class Ex16_ExemploForArray {
    public static void main(String[] args) {
        //em arrays o indice de elementos inicia em Zero
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

      /*   for(int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indece x= "+x+" é "+ alunos[x]);
        }
      */

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: "+ aluno);
        }
    }
}
