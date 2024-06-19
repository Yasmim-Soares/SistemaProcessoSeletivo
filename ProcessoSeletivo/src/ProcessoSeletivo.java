import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       
        System.out.println("PROCESSO SELETIVO");

    }
    static void analisarCandidatos(){
      
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5);{
           String candidato = candidatos[candidatosAtual];
           double salarioPretendido = valorPretendido();
           
           System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
           if (salarioBase >= salarioPretendido){
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
              candidatosSelecionados++;
           }
           candidatosAtual++;
        }
        
    }
    static double valorPretendido() {
         return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

    static void analisarCandidato(double salarioPretendido){
        double SalarioBase = 2000.0; 
        
        if (SalarioBase> salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SalarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
