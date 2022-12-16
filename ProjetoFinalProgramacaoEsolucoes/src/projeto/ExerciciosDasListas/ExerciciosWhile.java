package projeto.ExerciciosDasListas;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.IOException;
import projeto.ImprimirArquivo;
import projeto.MenuListas;

public class ExerciciosWhile {

    //Pasta com caminho para ser salvo
    String pasta = "D:\\Users\\gabri\\Documents\\ESTUDOS\\ANHEMBI\\programação de soluções computacionais\\Listas\\ProjetoFinalProgramacaoEsolucoes\\src\\projeto\\ArquivosGravados\\ListaWhile\\";

    public void ExercicioUm() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Crie um programa que imprima 11 vezes a frase \" Hello World!\"\n utilizando uma estrutura sequencial e uma estrutura de repetição while.";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "~Imprimir Hello World! 11 vezes", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) { \n"
                + "    int cont = 0;\n"
                + "    while (cont < 12){\n "
                + "      System.out.println(cont + \". Hello, world!\");\n"
                + "      cont++;\n"
                + "    }\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Imprimir Hello World! 11 vezes",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioUM.txt", enunciado + "\nResolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaWhile();
            }
        } else {
            lista.ListaWhile();
        }
    }

    public void ExercicioDois() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Escrever um programa para exibir os números pares de 1 até 50 na tela.";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Exibir números pares de 1 a 50", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    int cont = 0;\n"
                + "    while(cont <= 50){\n"
                + "    if(cont %% 2 == 0){\n"
                + "      int par = cont;\n"
                + "      System.out.println(par);\n"
                + "      }\n"
                + "      cont++;\n"
                + "    }\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Exibir números pares de 1 a 50",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioDOIS.txt", enunciado + "\nResolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaWhile();
            }
        } else {
            lista.ListaWhile();
        }
    }

    public void ExercicioTres() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Crie um programa para ler 3 notas e mostrar a média delas.";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Exibir média de 3 notas", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    int nota, media, soma = 0, contador = 1;\n"
                + "    while(contador <= 3){\n"
                + "      System.out.println(\"Digite a nota: \");\n"
                + "      nota = scanner.nextInt();\n"
                + "      soma = soma + nota;\n"
                + "      contador++;\n"
                + "    }\n"
                + "  media = soma/ 3;\n"
                + "  System.out.println(\"A média é: \" + media);\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Exibir média de 3 notas",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioTRES.txt", enunciado + "\nResolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaWhile();
            }
        } else {
            lista.ListaWhile();
        }
    }

    public void ExercicioQuatro() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Escreva um programa com um looping indeterminado/n em que enquanto o usuário não pedir para o programa sair, /nele continua printando um contador na tela.";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Imprimir contador até sair", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "  Scanner scanner = new Scanner(System.in);\n"
                + "  int cont = 1;\n"
                + "  while(cont != 0){\n"
                + "    System.out.println(\"1 para continuar ou 0 para sair\");\n"
                + "    int num = scanner.nextInt();\n"
                + "    cont++;\n"
                + "    System.out.println(\"Rodada número \"cont);\n"
                + "    }\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Imprimir contador até sair",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioQUATRO.txt", enunciado + "\nResolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaWhile();
            }
        } else {
            lista.ListaWhile();
        }
    }

    public void ExercicioCinco() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Faça um programa que peça ao usuário um número entre 12 e 20.\n Se a pessoa digitar um número diferente, mostrar a mensagem \"entrada inválida\"\n e solicitar o número novamente. Se digitar correto mostrar o número digitado.";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Validar entrada", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n "
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    int num = 12;\n"
                + "    while (num >= 12 || num <= 20){\n"
                + "      System.out.println(\"Digite um número entre 12 e 20\");\n"
                + "      num = scanner.nextInt();\n"
                + "      if(num < 12 || num > 20){\n"
                + "        System.out.println(\"Número inválido. Digite novamente\");\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Validar entrada",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioCINCO.txt", enunciado + "\nResolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaWhile();
            }
        } else {
            lista.ListaWhile();
        }
    }

    public void ExercicioSeis() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Usando o laço while para pedir ao usuário que tente acertar um número aleatório\n entre 0 e 10 (incluindo) e mostrar a quantidade de tentativas feitas.\n Dica: Usar o comando Random numero = new Random();";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Acertar número aleatório", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "import java.util.Random;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "  Scanner scanner = new Scanner(System.in);\n"
                + "  Random random = new Random();\n"
                + "  int num = 0;\n"
                + "  int aleatorio = random.nextInt(10);\n"
                + "  while(aleatorio != num){\n"
                + "    System.out.println(\"Digite um número entre 0 e 10\");\n"
                + "    num = scanner.nextInt();\n"
                + "    System.out.println(\"Número digitado: \" + num);\n"
                + "    System.out.println(\"Número aleatório: \" + aleatorio);\n"
                + "    if(num == aleatorio){\n"
                + "      System.out.println(\"Você acertou!\");\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, "Resolucao do exercicio", "Acertar número aleatório", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioSEIS.txt", enunciado + "\nResolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaWhile();
            }
        } else {
            lista.ListaWhile();
        }
    }

    public void ExercicioSete() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "O usuário vai digitar uma nota válida (de 0 até 10).\n O programa deverá armazenar estas notas em um acumulador.\n Usar uma segunda variável para contar quantas notas foram armazenadas.\n Ao final, quando o usuário não quiser mais lançar notas,\n ele pede para sair e o programa imprime na tela a média das notas.";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Lançar notas", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    int nota, media, soma = 0, contador = 0, opcao = 0;\n"
                + "    while(opcao != 2){\n"
                + "      System.out.println(\"1 - Digitar notas 2 - Sair\");\n"
                + "      opcao = scanner.nextInt();\n"
                + "      if(opcao == 1){\n"
                + "        System.out.println(\"Digite uma nota entre 0 e 10: \");\n"
                + "        nota = scanner.nextInt();\n"
                + "        if(nota > 10 || nota < 0){\n"
                + "          System.out.println(\"Digite uma nota válida!\");\n"
                + "          }\n"
                + "        soma = soma + nota;\n"
                + "        contador++;\n"
                + "      }/n"
                + "    }\n"
                + "    media = soma/ contador;\n"
                + "    System.out.println(\"A média é: \" + media);\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Lançar notas",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioSETE.txt", enunciado + "\nResolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaWhile();
            }
        } else {
            lista.ListaWhile();
        }
    }
}
