package cofrinho;
/*
 * O trabalho consiste em implementar um pequeno sistema que emula um "Cofrinho 
de moedas" em Java. Crie um menu em que é oferecido ao usuário:
 Adicionar moedas de diferentes valores e países em seu cofrinho
 Remover moedas específicas do cofrinho.
 Listar todas as moedas que estão dentro do cofrinho
 Calcular quanto dinheiro existe no cofrinho convertido para Real
 */
public class Run {
    public static void main(String[] args) {
        Cofre cofrinho = new Cofre();
        cofrinho.addMoedas();
        //cofrinho.setFloating(3);
        cofrinho.listagemTotalAcumulado();
        //System.out.println("\n" + cofrinho+"\n");
        // cofrinho.setCambioMoedas();
        //System.out.println("\n"+cofrinho);
    }
}