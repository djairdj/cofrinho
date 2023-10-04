package cofrinho;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Cofre {
  private static final Scanner sc = new Scanner(System.in);
  private ArrayList<Moeda> moedas = new ArrayList<>();
  private int floating = 2;
  private MoedaTipo[] moedaTipos = MoedaTipo.values();

  /**
   * Método usado para situações onde é necessário alterar o valor do câmbio em
   * tempo de execução.
   * Ele interage com o usuário exibindo o valor atual do câmbio de cada moeda e
   * possibilita que seja alterado esse valor.
   */
  public void setCambioMoedas() {
    for(int i = 0; i < this.moedaTipos.length; i++) {
      MoedaTipo m = this.moedaTipos[i];
      try {
        System.out.println("Valor atual do câmbio para moeda " + m + ": " + m.cambio());
        System.out.print("Qual novo valor de cambio da moeda " + m + "? ");
        m.setCambio(Math.abs(Double.parseDouble(sc.nextLine())));
      } catch(Exception e) {
        System.out.println("Valor inválido");
        i--;
      }
    }
  }

  /**
   * @param nCasasDecimais Inteiro positivo que vai corresponder à quantidade de
   *                       casas decimais
   *                       na exibição dos valores monetários do cofre.
   */
  public void setFloating(int nCasasDecimais) {
    this.floating = Math.max(floating, Math.abs(nCasasDecimais));
  }

  /**
   * @param tipo Tipo específico da moeda a ser contabilizada os valores.
   * @return Um valor double correspondente ao total das moedas do tipo
   * especificado.
   */
  public double valorAcumulado(MoedaTipo tipo) {
    double soma = 0;
    for(Moeda moeda : this.moedas) {
      if(moeda.tipo == tipo) {
        soma += moeda.valor;
      }
    }
    return roundTo(soma, floating);
  }

  /**
   * @param tipo Tipo da moeda especificada.
   * @return Um double referente ao valor total do cofre sendo convertido
   * para a moeda especificada.
   */
  public double totalAcumulado(MoedaTipo tipo) {
    double soma = 0;
    for(Moeda moeda : moedas) {
      double cambiado = moeda.tipo.cambio() * moeda.valor;
      soma += cambiado;
    }
    return roundTo(soma / tipo.cambio(), floating);
  }

  /**
   * Exibe o total de moedas dentro do Cofre de forma que cada moeda
   * é exibida com seu respectivo símbolo.
   */
  public void listagemTotalAcumulado() {
    for(MoedaTipo m : this.moedaTipos) {
      NumberFormat dinheiro = NumberFormat.getCurrencyInstance(m.local());
      System.out.println("Total acumulado " + m + ": " + dinheiro.format(this.totalAcumulado(m)));
    }
  }

  /**
   * Método interage com usuário ao configurar uma moeda para adição ao cofre.
   */
  public void addMoeda() {
    while(true) {
      System.out.print("Informe o valor da moeda: ");
      try {
        double inputValue = Double.parseDouble(sc.nextLine());
        MoedaTipo tipo = null;
        int opt = -1;
        while(true) {
          System.out.println("Informe o número do tipo da moeda: ");
          for(int i = 0; i < moedaTipos.length; i++) {
            System.out.println((i + 1) + " - " + moedaTipos[i]);
          }
          try {
            opt = Integer.parseInt(sc.nextLine()) - 1;
          } catch(Exception e) {
            System.out.println("Valor não é um número.");
          }
          if(opt >= 0 && opt < moedaTipos.length) {
            tipo = moedaTipos[opt];
            break;
          }
        }
        addMoeda(new Moeda(inputValue, tipo));
        break;
      } catch(Exception e) {
        System.err.println("Valor informado não é um valor monetário.");
      }
    }
  }

  /**
   * @param moeda Instância de uma Moeda que será adicionada a lista de moedas do
   *              cofre.
   */
  public void addMoeda(Moeda moeda) {
    this.moedas.add(moeda);
  }

  /**
   * Método interage com o usuário coletando a quantidade de moedas a serem
   * adicionadas uma a uma
   */
  public void addMoedas() {
    while(true) {
      try {
        System.out.print("Quantas moedas vais adicionar ao cofre dessa vêz? ");
        int nVezes = Math.abs(Integer.parseInt(sc.nextLine()));
        for(int i = 1; i <= nVezes; i++) {
          System.out.println("Moeda " + i + ":");
          addMoeda();
        }
        break;
      } catch(Exception e) {
        System.out.println("Informe um número!");
      }
    }
  }

  /**
   * Método expressa a representação em String das informções do objeto.
   * Esse método é uma sobrescrita do método que está na classe Object
   */
  public String toString() {
    String r = "Estatísticas do cofre:\n";
    if(!this.moedas.isEmpty()) {
      r += "Moedas:\n";
      for(int i = 0; i < moedas.size(); i++) {
        r += String.format("%s\n", i + 1 + "ª " + this.moedas.get(i));
      }
    }
    return r + "Valor total em Reais: " + this.totalAcumulado(MoedaTipo.REAL) + "R$";
  }

  /**
   * @param valor Valor double que será arredondado
   * @param casas Número de casas decimais para arredondamento
   * @return Um double arredondado para a quantidade de casas decimais definidas
   * em casas
   */
  private double roundTo(double valor, int casas) {
    String c = "%." + Math.abs(casas) + "f";
    return Double.parseDouble(String.format(c, valor).replace(",", "."));
  }
}
