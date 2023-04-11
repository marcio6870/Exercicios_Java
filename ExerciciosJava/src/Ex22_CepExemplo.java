
public class Ex22_CepExemplo {

    public static void main (String[] args) {
        try{

            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        }   
        catch(final CepInvalidoException e){
            e.printStackTrace();
        }
    }
    
   
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
            
            //simula um cep formatado
            return "23.765-064";
        }
    }

}
