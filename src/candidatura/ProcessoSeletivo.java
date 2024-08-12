package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String []  canditados =  {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","JORGE"};
        selecaoCandidatos();
    }

    static void selecaoCandidatos (){
        String []  canditados =  {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","JORGE"};
        int canditadosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (canditadosSelecionados < 5  && candidatoAtual < canditados.length){
            String canditado = canditados[candidatoAtual];
            double salarioPretendido  = valorPretendido();
            System.out.println("O candidato: " + canditado + " Solicitou este valor de salario: " + salarioPretendido);
            if (salarioBase >=  salarioPretendido) {
                System.out.println("O Canditado " + canditado + " foi selecionado para a vaga");
                canditadosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCanditado(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDITADO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DE DEMAIS  CANDITATOS");
        }
    }
}
