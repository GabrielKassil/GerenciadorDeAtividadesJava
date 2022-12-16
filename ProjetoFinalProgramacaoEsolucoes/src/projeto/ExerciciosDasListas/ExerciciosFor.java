package projeto.ExerciciosDasListas;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.IOException;
import projeto.ImprimirArquivo;
import projeto.MenuListas;

public class ExerciciosFor {

    //Pasta com caminho para ser salvo
    String pasta = "D:\\Users\\gabri\\Documents\\ESTUDOS\\ANHEMBI\\programação de soluções computacionais\\Listas\\ProjetoFinalProgramacaoEsolucoes\\src\\projeto\\ArquivosGravados\\ListaFor\\";

    public void ExercicioUm() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Escrever um programa para exibir os números de 1 até 50 na tela.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Números de 1 à 50", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //criacao do for de 1 à 50\n"
                + "    for(int i = 1; i <= 50; i++){\n"
                + "      //exibindo na tela o valor de i\n"
                + "      System.out.println(i);\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Números de 1 à 50",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioForUM.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaFor();
            }
        } else {
            lista.ListaFor();
        }
    }

    public void ExercicioDois() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Crie um programa que calcula o fatorial de um número.\n Mas o incremento do for deve ser regressivo.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Fatorial", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //instânciando o leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    //declaração de variavel\n"
                + "    int numero, fatorial = 1;\n\n"
                + "    //solicitando a entrada do usuário\n"
                + "    System.out.println(\"Digite um número para cálculo do fatorial: \");\n"
                + "    numero = scanner.nextInt();\n\n"
                + "    //criando for para calculo do fatorial\n"
                + "    for (int i = numero; i > 0; i--) {\n"
                + "      fatorial *= i;\n"
                + "    }\n"
                + "    //exibindo o fatorial\n"
                + "    System.out.println(\"O fatorial desse número é \"+fatorial);\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Fatorial",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioForDOIS.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaFor();
            }
        } else {
            lista.ListaFor();
        }
    }

    public void ExercicioTres() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Fazer um programa para encontrar todos os números pares entre 1 e 100.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Pares de 1 à 100", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //exibindo mensagem na tela\n"
                + "    System.out.println(\"Os números pares entre 1 e 100 são:\");\n\n"
                + "    //criação do for para exibir numeros pares de 1 à 100\n"
                + "    for(int i=1;i<=100;i++){\n"
                + "      //se o módulo de i por 2 for igual a 0, o número é par\n"
                + "      if(i%2 == 0){\n"
                + "        //exibindo na tela\n"
                + "        System.out.println(i);\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Pares de 1 à 100",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioForTRES.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaFor();
            }
        } else {
            lista.ListaFor();
        }
    }

    public void ExercicioQuatro() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Tabuada", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando o leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    //declaração de variáveis\n"
                + "    int numero, resultado;\n\n"
                + "    //Solicitando entrada do usuário\n"
                + "    System.out.println(\"Digite um número inteiro de 1 à 10:\");\n"
                + "    numero = scanner.nextInt();\n\n"
                + "    //exibindo a tabuada\n"
                + "    System.out.println(\"A tabuada do \"+numero+\" é:\");\n"
                + "    for(int i=0; i<=10; i++){\n"
                + "      resultado = i*numero;\n"
                + "      System.out.printf(\"%d x %d = %d\n\", numero, i, resultado);\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Tabuada",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioForQUATRO.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaFor();
            }
        } else {
            lista.ListaFor();
        }
    }

    public void ExercicioCinco() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Leia várias idades e calcule a média entre as idades (usar uma variável para idade).\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Média entre as idades", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Declaração das variáveis\n"
                + "    int [] idade = {10, 30, 40, 20 ,50, 60, 70};\n"
                + "    int media, soma=0;\n\n"
                + "    //criação do for para realizar a soma\n"
                + "    for(int i=0; i < idade.length; i++){\n"
                + "      soma += idade[i];\n"
                + "    }\n"
                + "    //calculando media\n"
                + "    media = soma/idade.length;\n"
                + "    //exibindo resultado na tela\n"
                + "    System.out.println(\"A média das idades é \"+(media));\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Média entre as idades",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioForCINCO.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaFor();
            }
        } else {
            lista.ListaFor();
        }
    }

    public void ExercicioSeis() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Ler 10 números e imprimir quantos são pares e quantos são ímpares.\n";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Pares e ímpares", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    //Declarando variáveis\n"
                + "    int[] numeros = new int[10];\n"
                + "    int pares = 0, impares = 0;\n\n"
                + "    //criação do for\n"
                + "    for(int i=0; i<10; i++){\n"
                + "      //solicitando entrada do usuário\n"
                + "      System.out.println(\"Digite um número inteiro:\");\n"
                + "      numeros[i] = scanner.nextInt();\n"
                + "      //se o módulo do numero por 2 for 0, é par, senão é impar\n"
                + "      if(numeros[i]%2 == 0){\n"
                + "        pares += 1;\n"
                + "      }\n"
                + "      else{\n"
                + "        impares += 1;\n"
                + "      }\n"
                + "    }\n"
                + "    //Exibindo resultados\n"
                + "    System.out.printf(\"Existem %d números pares.\n\",pares);\n"
                + "    System.out.printf(\"Existem %d números ímpares.\",impares);\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Pares e ímpares",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioForSEIS.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaFor();
            }
        } else {
            lista.ListaFor();
        }
    }

    public void ExercicioSete() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração.\nO usuário deve conseguir reconhecer que são três contas diferentes.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Contas de subtração", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    //Declaração das variáveis\n"
                + "    int numUm, numDois;\n\n"
                + "    //Exibindo apresentação\n"
                + "    System.out.println(\"--Esse programa permite a realização de 3 contas de subtração--\");\n"
                + "    //criação do for\n"
                + "    for(int i=1; i<=3; i++){\n"
                + "      //Solicitando entradas do usuário\n"
                + "      System.out.printf(\"--%d° conta--\n\",i);\n"
                + "      System.out.println(\"Digite o primeiro número:\");\n"
                + "      numUm = scanner.nextInt();\n"
                + "      System.out.println(\"Digite o segundo número:\");\n"
                + "      numDois = scanner.nextInt();\n"
                + "      //Exibindo resultado\n"
                + "      System.out.println(\"O resultado da subtração é: \"+(numUm-numDois));\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Contas de subtração",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioForSETE.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaFor();
            }
        } else {
            lista.ListaFor();
        }
    }

    public void ExercicioOito() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Neste exercício você deverá projetar um programa que imprime na tela números de 1 a 100, mas:\n"
                + "a.   Sempre que o número for divisível por 3, aparece fizz.\n"
                + "b.   Sempre que um número for divisível por 5, aparece buzz.\n"
                + "c.   Quando for divisível pelos 2, aparece Fizz Buzz.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "1 à 100 (fizz, buzz e Fizz Buzz)", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //criação do for\n"
                + "    for(int i=1;i<=100;i++){\n"
                + "      //se o módulo por 3 for zero, exibir fizz\n"
                + "      if(i%3 == 0){\n"
                + "        System.out.println(\"fizz\");\n"
                + "      }else if(i%5 == 0){//se o módulo por 5 for zero, exibir buzz\n"
                + "        System.out.println(\"buzz\");\n"
                + "      }else if(i%2 == 0){//se o módulo por 3 for zero, exibir Fizz Buzz\n"
                + "        System.out.println(\"Fizz Buzz\");\n"
                + "      }else{//senão exibir o número\n"
                + "        System.out.println(i);\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "1 à 100 (fizz, buzz e Fizz Buzz)",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioForOITO.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaFor();
            }
        } else {
            lista.ListaFor();
        }
    }
}
