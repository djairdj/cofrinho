package cofrinho;

/*
 * O trabalho consiste em implementar um pequeno sistema que emula um "Cofrinho 
de moedas" em Java. Crie um menu em que é oferecido ao usuário:
 Adicionar moedas de diferentes valores e países em seu cofrinho
 Remover moedas específicas do cofrinho.
 Listar todas as moedas que estão dentro do cofrinho
 Calcular quanto dinheiro existe no cofrinho convertido para Real
 */
/*
TODO    [] Desmembrar a responsabilidade do valor da taxa de câmbio da classe da moeda;
        [] Criar um conversor para ser utilizado apenas na hora de checar os valores cambiados,
        dessa forma o cálculo será atualizado em tempo "real";
        [] Gerar lógica de consumo da API e/ou do arquivo json de maneira dinâmica, tentando
         consumir a API primeiro e caso dê errado ou time-out, consumir o arquivo
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