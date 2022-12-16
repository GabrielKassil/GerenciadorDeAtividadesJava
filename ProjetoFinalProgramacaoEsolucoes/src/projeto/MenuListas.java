package projeto;

import projeto.ExerciciosDasListas.ExerciciosWhile;
import projeto.ExerciciosDasListas.ExerciciosOperadores;
import projeto.ExerciciosDasListas.ExerciciosLooping;
import projeto.ExerciciosDasListas.ExerciciosString;
import projeto.ExerciciosDasListas.ExerciciosFor;
import projeto.ExerciciosDasListas.ExerciciosCondicional;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MenuListas {
  public void ListaCondicional() throws IOException {
    MenuInicial menu = new MenuInicial();
    ExerciciosCondicional listaDeExercicios = new ExerciciosCondicional();

    UIManager.put("OptionPane.cancelButtonText", "Voltar");
    UIManager.put("OptionPane.okButtonText", "Avançar");
    String[] exercicios = { "1° Exercicio - Salário, IR e salliq",
                            "2° Exercicio - Expressões verdadeiras ou falsas",
                            "3° Exercicio - Expressões verdadeiras ou falsas AND e OR",
                            "4° Exercicio - Par ou ímpar/ Positivo ou negativo",
                            "5° Exercicio - Peso ideal", 
                            "6° Exercicio - Multa do peixe",
                            "7° Exercicio - Hemoglobina",
                            "8° Exercicio - Banco de sangue" };
    String selecao = (String) JOptionPane.showInputDialog(null,
        "-------------------------------------------------Lista Condicional e Condicional Relacional!!!-------------------------------------------------\n"
            + "Você selecionou para ver os exercícios sobre Condicional e Condicional Relacional.\n"
            + "Veja a relação dos exercícios abaixo:",
        "Projeto - Gerenciador de atividades", JOptionPane.QUESTION_MESSAGE, null, exercicios, exercicios[0]);

    if (selecao != null) {
      char resposta = selecao.charAt(0);

      switch (resposta) {
        case '1':
          listaDeExercicios.ExercicioUm();
          break;
        case '2':
          listaDeExercicios.ExercicioDois();
          break;
        case '3':
          listaDeExercicios.ExercicioTres();
          break;
        case '4':
          listaDeExercicios.ExercicioQuatro();
          break;
        case '5':
          listaDeExercicios.ExercicioCinco();
          break;
        case '6':
          listaDeExercicios.ExercicioSeis();
          break;
        case '7':
          listaDeExercicios.ExercicioSete();
          break;
        case '8':
          listaDeExercicios.ExercicioOito();
          break;
      }
    } else {
      menu.Menu();
    }
  }

  public void ListaFor() throws IOException {
    MenuInicial menu = new MenuInicial();
    ExerciciosFor listaDeExercicios = new ExerciciosFor();

    UIManager.put("OptionPane.cancelButtonText", "Voltar");
    UIManager.put("OptionPane.okButtonText", "Avançar");
    String[] exercicios = { "1° Exercicio - Números de 1 à 50", 
                            "2° Exercicio - Fatorial",
                            "3° Exercicio - Pares de 1 à 100", 
                            "4° Exercicio - Tabuada", 
                            "5° Exercicio - Média entre as idades",
                            "6° Exercicio - Pares e ímpares", 
                            "7° Exercicio - Contas de subtração",
                            "8° Exercicio - 1 à 100 (fizz, buzz e Fizz Buzz)" };
    String selecao = (String) JOptionPane.showInputDialog(null,
        "-------------------------------------------------Lista For!!!-------------------------------------------------\n"
            + "Você selecionou para ver os exercícios sobre For.\n"
            + "Veja a relação dos exercícios abaixo:",
        "Projeto - Gerenciador de atividades", JOptionPane.QUESTION_MESSAGE, null, exercicios, exercicios[0]);

    if (selecao != null) {
      char resposta = selecao.charAt(0);

      switch (resposta) {
        case '1':
          listaDeExercicios.ExercicioUm();
          break;
        case '2':
          listaDeExercicios.ExercicioDois();
          break;
        case '3':
          listaDeExercicios.ExercicioTres();
          break;
        case '4':
          listaDeExercicios.ExercicioQuatro();
          break;
        case '5':
          listaDeExercicios.ExercicioCinco();
          break;
        case '6':
          listaDeExercicios.ExercicioSeis();
          break;
        case '7':
          listaDeExercicios.ExercicioSete();
          break;
        case '8':
          listaDeExercicios.ExercicioOito();
          break;
      }
    } else {
      menu.Menu();
    }
  }

  public void ListaLooping() throws IOException {
    MenuInicial menu = new MenuInicial();
    ExerciciosLooping listaDeExercicios = new ExerciciosLooping();

    UIManager.put("OptionPane.cancelButtonText", "Voltar");
    UIManager.put("OptionPane.okButtonText", "Avançar");
    String[] exercicios = { "1° Exercicio - Validação de 0 à 10", 
                            "2° Exercicio - Usuário e senha",
                            "3° Exercicio - Validação", 
                            "4° Exercicio - População A e B",
                            "5° Exercicio - População e taxas de crescimento", 
                            "6° Exercicio - Em baixo e do lado",
                            "7° Exercicio - Maior número", 
                            "8° Exercicio - Soma e média",
                            "9° Exercicio - ímpares de 1 a 50", 
                            "10° Exercicio - Inteiros no intervalo",
                            "11° Exercicio - Soma dos números" };
    String selecao = (String) JOptionPane.showInputDialog(null,
        "-------------------------------------------------Lista Looping!!!-------------------------------------------------\n"
            + "Você selecionou para ver os exercícios sobre Looping.\n"
            + "Veja a relação dos exercícios abaixo:",
        "Projeto - Gerenciador de atividades", JOptionPane.QUESTION_MESSAGE, null, exercicios, exercicios[0]);

    if (selecao != null) {
      String resposta;
      char respostaUm = selecao.charAt(0);
      char respostaDois = selecao.charAt(1);
      if (respostaDois == '1' || respostaDois == '0') {
        resposta = Character.toString(respostaUm) + Character.toString(respostaDois);
      } else {
        resposta = Character.toString(respostaUm);
      }

      switch (resposta) {
        case "1":
          listaDeExercicios.ExercicioUm();
          break;
        case "2":
          listaDeExercicios.ExercicioDois();
          break;
        case "3":
          listaDeExercicios.ExercicioTres();
          break;
        case "4":
          listaDeExercicios.ExercicioQuatro();
          break;
        case "5":
          listaDeExercicios.ExercicioCinco();
          break;
        case "6":
          listaDeExercicios.ExercicioSeis();
          break;
        case "7":
          listaDeExercicios.ExercicioSete();
          break;
        case "8":
          listaDeExercicios.ExercicioOito();
          break;
        case "9":
          listaDeExercicios.ExercicioNove();
          break;
        case "10":
          listaDeExercicios.ExercicioDez();
          System.out.println("dez");
          break;
        case "11":
          listaDeExercicios.ExercicioOnze();
          System.out.println("onze");
          break;

      }
    } else {
      menu.Menu();
    }
  }

  public void ListaOperadores() throws IOException {
    MenuInicial menu = new MenuInicial();
    ExerciciosOperadores listaDeExercicios = new ExerciciosOperadores();

    UIManager.put("OptionPane.cancelButtonText", "Voltar");
    UIManager.put("OptionPane.okButtonText", "Avançar");
    String[] exercicios = { "1° Exercicio - Ler número inteiro", 
                            "2° Exercicio - Ler número real",
                            "3° Exercicio - Soma de 3 números", 
                            "4° Exercicio - Retonando cód UNICODE",
                            "5° Exercicio - Converter °C para °F", 
                            "6° Exercicio - Converter km/h em m/s",
                            "7° Exercicio - Imprimir número antecessor", 
                            "8° Exercicio - Calcular idade",
                            "9° Exercicio - Calcular àrea de um círculo" };
    String selecao = (String) JOptionPane.showInputDialog(null,
        "-------------------------------------------------Lista Operadores!!!-------------------------------------------------\n"
            + "Você selecionou para ver os exercícios sobre Operadores.\n"
            + "Veja a relação dos exercícios abaixo:",
        "Projeto - Gerenciador de atividades", JOptionPane.QUESTION_MESSAGE, null, exercicios, exercicios[0]);

    if (selecao != null) {
      char resposta = selecao.charAt(0);

      switch (resposta) {
        case '1':
          listaDeExercicios.ExercicioUm();
          break;
        case '2':
          listaDeExercicios.ExercicioDois();
          break;
        case '3':
          listaDeExercicios.ExercicioTres();
          break;
        case '4':
          listaDeExercicios.ExercicioQuatro();
          break;
        case '5':
          listaDeExercicios.ExercicioCinco();
          break;
        case '6':
          listaDeExercicios.ExercicioSeis();
          break;
        case '7':
          listaDeExercicios.ExercicioSete();
          break;
        case '8':
          listaDeExercicios.ExercicioOito();
          break;
        case '9':
          listaDeExercicios.ExercicioNove();
          break;
      }
    } else {
      menu.Menu();
    }
  }

  public void ListaString() throws IOException {
    MenuInicial menu = new MenuInicial();
    ExerciciosString listaDeExercicios = new ExerciciosString();

    UIManager.put("OptionPane.cancelButtonText", "Voltar");
    UIManager.put("OptionPane.okButtonText", "Avançar");
    String[] exercicios = { "1° Exercicio - Caixa alta",
                            "2° Exercicio - Código BEB",
                            "3° Exercicio - Último caractere",
                            "4° Exercicio - CPF sem pontos e hífen", 
                            "5° Exercicio - Palavra secreta" };
    String selecao = (String) JOptionPane.showInputDialog(null,
        "-------------------------------------------------Lista String!!!-------------------------------------------------\n"
            + "Você selecionou para ver os exercícios sobre String.\n"
            + "Veja a relação dos exercícios abaixo:",
        "Projeto - Gerenciador de atividades", JOptionPane.QUESTION_MESSAGE, null, exercicios, exercicios[0]);

    if (selecao != null) {
      char resposta = selecao.charAt(0);

      switch (resposta) {
        case '1':
          listaDeExercicios.ExercicioUm();
          break;
        case '2':
          listaDeExercicios.ExercicioDois();
          break;
        case '3':
          listaDeExercicios.ExercicioTres();
          break;
        case '4':
          listaDeExercicios.ExercicioQuatro();
          break;
        case '5':
          listaDeExercicios.ExercicioCinco();
          break;
      }
    } else {
      menu.Menu();
    }
  }

  public void ListaWhile() throws IOException {
    MenuInicial menu = new MenuInicial();
    ExerciciosWhile listaDeExercicios = new ExerciciosWhile();

    UIManager.put("OptionPane.cancelButtonText", "Voltar");
    UIManager.put("OptionPane.okButtonText", "Avançar");
    String[] exercicios = { "1° Exercicio - Imprimir Hello World! 11 vezes", 
                            "2° Exercicio - Exibir números pares de 1 a 50",
                            "3° Exercicio - Exibir média de 3 notas", 
                            "4° Exercicio - Imprimir contador até sair",
                            "5° Exercicio - Validar entrada", 
                            "6° Exercicio - Acertar número aleatório",
                            "7° Exercicio - Lançar notas" };
    String selecao = (String) JOptionPane.showInputDialog(null,
        "-------------------------------------------------Lista While!!!-------------------------------------------------\n"
            + "Você selecionou para ver os exercícios sobre While.\n"
            + "Veja a relação dos exercícios abaixo:",
        "Projeto - Gerenciador de atividades", JOptionPane.QUESTION_MESSAGE, null, exercicios, exercicios[0]);

    if (selecao != null) {
      char resposta = selecao.charAt(0);

      switch (resposta) {
        case '1':
          listaDeExercicios.ExercicioUm();
          break;
        case '2':
          listaDeExercicios.ExercicioDois();
          break;
        case '3':
          listaDeExercicios.ExercicioTres();
          break;
        case '4':
          listaDeExercicios.ExercicioQuatro();
          break;
        case '5':
          listaDeExercicios.ExercicioCinco();
          break;
        case '6':
          listaDeExercicios.ExercicioSeis();
          break;
        case '7':
          listaDeExercicios.ExercicioSete();
          break;
      }
    } else {
      menu.Menu();
    }
  }
}
