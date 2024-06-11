import java.util.Scanner;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Processo Seletivo");
    
        System.out.println("Qual o seu salário pretendio? ");  
        double analisarCandidato = scanner.nextDouble(); 

    }
    static void analisarCandidato(double salarioPretendido){

        double SalarioBase = 2.000;
        
        if (SalarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SalarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
