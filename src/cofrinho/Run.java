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
        cofrinho.addMoeda();
        cofrinho.addMoeda();
        cofrinho.addMoeda();
        cofrinho.setFloating(3);
        // cofrinho.setCambioMoedas();
        System.out.println("total acumulado Euro " + cofrinho.totalAcumulado(MoedaTipo.EURO));
        System.out.println("total acumulado Dollar " + cofrinho.totalAcumulado(MoedaTipo.DOLLAR));
        System.out.println("total acumulado Reais " + cofrinho.totalAcumulado(MoedaTipo.REAL));
        System.out.println("valor de Euro " + cofrinho.valorAcumulado(MoedaTipo.EURO));
        System.out.println("valor de Dollar " + cofrinho.valorAcumulado(MoedaTipo.DOLLAR));
        System.out.println("valor de Reais " + cofrinho.valorAcumulado(MoedaTipo.REAL));
        System.out.println("\n" + cofrinho);
    }
}