package projeto.ExerciciosDasListas;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.IOException;
import projeto.ImprimirArquivo;
import projeto.MenuListas;

public class ExerciciosOperadores {

    //Pasta com caminho para ser salvo
    String pasta = "D:\\Users\\gabri\\Documents\\ESTUDOS\\ANHEMBI\\programação de soluções computacionais\\Listas\\ProjetoFinalProgramacaoEsolucoes\\src\\projeto\\ArquivosGravados\\ListaOperadores\\";

    public void ExercicioUm() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Faça um programa que leia um número inteiro e o imprima\n";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Ler número inteiro", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //declarando variável do tipo inteiro e atribuindo valor\n"
                + "    int numero = 9;\n"
                + "    //imprimindo o valor da variável numero\n"
                + "     System.out.println(\"O número é \" + numero);\n"
                + "    }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Ler número inteiro",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {

                ImprimirArquivo.escreverTexto(pasta+"exercicioUM.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }

    public void ExercicioDois() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Faça um programa que leia um número real e o imprima\n";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Ler número real", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //declarando a variável do tipo float que pode receber números reais\n"
                + "    float numero = 9.6f;\n"
                + "    //imprimindo a variável numero\n"
                + "    System.out.println(\"O número é: \" + numero); \n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Ler número real",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioDOIS.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }

    public void ExercicioTres() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Peça ao usuário para digitar três números inteiros e imprima a soma deles\n";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Soma de 3 números", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {"
                + "  public static void main(String[] args) {\n"
                + "    //Instanciando a variável scanner para receber valor\n"
                + "    Scanner scanner = new Scanner(System.in);"
                + "    //Pedindo ao usuário para digitar o primeiro número\n"
                + "    System.out.println(\"Digite um número inteiro: \");\n"
                + "    //criando a variável numero1 para receber o valor digitado\n"
                + "    int numero1 = scanner.nextInt();\n"
                + "    //Pedindo ao usuário para digitar o segundo número\n"
                + "    System.out.println(\"Digite um número inteiro: \");"
                + "    //criando a variável numero2 para receber o valor digitado\n"
                + "    int numero2 = scanner.nextInt();\n"
                + "    //criando a variável soma para receber a soma do valor\n"
                + "    int soma = numero1 + numero2;\n;"
                + "    System.out.println(numero1 + \" + \" + numero2 + \" = \" + soma);\n"
                + "  }\n"
                + "}\n";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Soma de 3 números",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {

                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioTRES.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }

    public void ExercicioQuatro() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Faça um programa que o usuário digita uma letra\n e o programa retorna o número inteiro do código UNICODE referente aquela letra\n";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Retonando cód UNICODE", JOptionPane.YES_NO_OPTION);
        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instanciando a classe scanner para poder ler valores\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    //Pedindo ao usuário para digitar o que \n"
                + "    System.out.println(\"Digite uma letra: \");\n"
                + "    //Guardando o valor digitado na variável letra\n"
                + "    String letra = scanner.next();\n"
                + "    //Transformando a letra digitada em UNICODE com a função codPointAt()\n"
                + "    int unicode = letra.codePointAt(0);\n"
                + "    //Exibindo o valor digitado e o código unicode\n"
                + "    System.out.println(\"O código unicode de \" + letra + \" é: \" + unicode);\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Retornando cód Unicode",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioQUATRO.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }

    public void ExercicioCinco() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Peça ao usuário inserir a temperatura em °C e imprima a temperatura em °F\n";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Converter °C para °F", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instanciando a classe scanner para receber valor\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    //Pedindo ao usuário para digitar o valor\n"
                + "    System.out.println(\"Digite a temperatura em ºC: \");\n"
                + "    //Guardando o valor digitado na variável c\n"
                + "    double c = scanner.nextDouble();\n"
                + "    //Formúla para tranformar a ºC em ºF\n"
                + "    double f = c * 9/5 + 32;\n"
                + "    //Exibindo as variáveis c e f\n"
                + "    System.out.println(c + \"ºC = \" + f + \" ºF\");\n"
                + "  }/n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Converter °C para °F",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioCINCO.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }

    public void ExercicioSeis() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Faça um programa que converta km/h para m/s";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Converter km/h em m/s", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    // Instanciando a classe scanner para receber valores\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    // Pedindo ao usuário para digitar o valor de km/h"
                + "    System.out.println(\"Digite a velocidade em km/h: \");\n"
                + "    // Guardando o valor digitado na variável km\n"
                + "    double km = scanner.nextDouble();\n"
                + "    // Fórmula para converter km/h em m/s\n"
                + "    double ms = km / 3.6;\n"
                + "     // Exibindo as variáveis km e ms\n"
                + "     System.out.println(km + \"km/h = \" + ms + \" m/s\");\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Converter km/h em m/s",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioSEIS.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }

    public void ExercicioSete() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Peça ao usuário para digitar um número e imprima seu antecessor";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Imprimir número antecessor", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    // Instanciando a classe scanner para receber valores\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    // Pedindo ao usuário para digitar um numero"
                + "    System.out.println(\"Digite um número \");\n"
                + "    // Guardando o valor digitado na variável número\n"
                + "    int numero = scanner.nextInt();\n"
                + "    // Guardando o valor de numero - 1 na variável antecessor\n"
                + "    int antecessor = numero - 1;\n"
                + "    // Exibindo as variáveis numero e antecessor\n"
                + "    System.out.println(\"O número antecessor a \" + numero + \" é \" + antecessor);\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Imprimir número antecessor",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioSETE.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }

    public void ExercicioOito() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Peça ao usuário para inserir seu ano de nascimento e imprima sua idade";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Calcular idade", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "import java.util.Date;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    Date date = new Date();\n"
                + "    System.out.println(\"Digite o ano de nascimento: \");\n"
                + "    int ano = scanner.nextInt();\n"
                + "    int anoatual = date.getYear() + 1900;\n"
                + "    int idade = anoatual - ano;\n"
                + "    System.out.println(\"Sua idade é: \" + idade);\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Calcular idade",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioOITO.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }

    public void ExercicioNove() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Faça um programa que calcula a área de uma circunferência/n com a precisão de duas casas decimais";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Calcular àrea de um círculo", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    System.out.println(\"Escreva o valor do raio\");\n"
                + "    Scanner scan = new Scanner(System.in);\n"
                + "    double raio = scan.nextFloat();\n"
                + "    double area = Math.PI * raio * raio;\n"
                + "    System.out.printf(\"O valor da area é %.2f\", area);\n"
                + "  }\n"
                + "}";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Calcular àrea de um círculo",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioNOVE.txt", enunciado + "\n Resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaOperadores();
            }
        } else {
            lista.ListaOperadores();
        }
    }
}
