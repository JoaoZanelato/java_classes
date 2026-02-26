package org.candidatura;

import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    private static final double SALARIO_BASE = 2000.0;
    private static final String[] CANDIDATOS = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","JOAO"};

    public static void main(String[] args) {
        imprimirSelecionados(selecaoCandidatos());

    }

    static void imprimirSelecionados(String[] selecionados){
        System.out.println("Imprimindo lista de candidatos informado o indice do elemento");
        for(int indice =0; indice < selecionados.
        )

    }
    static String[] selecaoCandidatos(){
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        String[] candidatosSelecionados_Lista = new String[5];
        while (candidatosSelecionados < 5 && candidatoAtual  < CANDIDATOS.length){
            String candidato = CANDIDATOS[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou esse valor de salario " + salarioPretendido);

            if (SALARIO_BASE > salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                candidatosSelecionados_Lista[candidatosSelecionados] = candidato;
            }
            candidatoAtual++;
        }
        return candidatosSelecionados_Lista;
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        if (SALARIO_BASE > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SALARIO_BASE == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}
