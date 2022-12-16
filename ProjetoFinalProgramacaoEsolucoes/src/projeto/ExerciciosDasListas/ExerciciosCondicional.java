package projeto.ExerciciosDasListas;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.IOException;
import projeto.ImprimirArquivo;
import projeto.MenuListas;

public class ExerciciosCondicional {

    //Pasta com caminho para ser salvo
    String pasta = "D:\\Users\\gabri\\Documents\\ESTUDOS\\ANHEMBI\\programação de soluções computacionais\\Listas\\ProjetoFinalProgramacaoEsolucoes\\src\\projeto\\ArquivosGravados\\ListaCondicional\\";

    public void ExercicioUm() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Tendo as variáveis salario, ir e salliq, e considerando os valores abaixo, informe se "
                + "as expressões são verdadeiras ou falsas:\n"
                + "Salario |    Ir   | Salliq |      Expressão           | Verdadeiro ou falso\n"
                + " 100,00 |  0,0  | 100,00 |    (salliq >= 100)      |                    \n"
                + " 200,00 | 10,0 | 190,00 |    (salliq <  190)        |                    \n"
                + " 300,00 | 15,0 | 285,00 | (salliq = salario+ir) |                    \n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "variáveis salario, ir e salliq", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Declarando variáveis\n"
                + "    float [] salario = {100.00f, 200.00f, 300.00f};\n"
                + "    float [] ir = {0.00f, 10.00f, 15.00f};\n"
                + "    float [] salliq = {100.00f, 190.00f, 285.00f};\n\n"
                + "    //Exibindo resultados\n"
                + "     System.out.println(salliq[0]>=100);\n"
                + "     System.out.println(salliq[1]<190);\n"
                + "     System.out.println(salliq[2]==salario[2]+ir[2]);\n"
                + "    }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Salário, IR e salliq", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioCondicionalUM.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaCondicional();
            }
        } else {
            lista.ListaCondicional();
        }
    }

    public void ExercicioDois() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Sabendo que a = 3, b = 7 e c = 4, informe se as expressões abaixo são verdadeiras ou falsas:\n a. (a+c)>b\n b. b > = (a + 2)\n c. c == (b – a)\n d. (b + a) < = c\n e. (c + a) > b\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Expressões verdadeiras ou falsas", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Declarando variáveis\n"
                + "    int a=3, b=7, c=4;\n\n"
                + "    //Exibindo na tela\n"
                + "    System.out.println((a+c)>b);\n"
                + "    System.out.println(b>=(a+2));\n"
                + "    System.out.println(c==(b-a));\n"
                + "    System.out.println((b+a)<=c);\n"
                + "    System.out.println((c+a)>b); \n"
                + "    }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Expressões verdadeiras ou falsas", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioCondicionalDOIS.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaCondicional();
            }
        } else {
            lista.ListaCondicional();
        }
    }

    public void ExercicioTres() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Sabendo que a = 5, b = 4, c = 3 e d = 6, informe se as expressões abaixo são verdadeiras ou falsas:\n"
                + "a. (a > c) AND (c <= d)\n b. (a + b) > 10 OR (a + b) == (c + +d) \nc. (a >= c) AND (d >= c)\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Expressões verdadeiras ou falsas AND e OR", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Declarando variáveis\n"
                + "    int a=5, b =4, c=3, d=6;\n\n"
                + "    //Exibindo na tela\n"
                + "    System.out.println((a>c)&&(c<=d));\n"
                + "    System.out.println((a+b)>10 || (a+b)==(c+d));\n"
                + "    System.out.println((a>=c)&&(d>=c));\n"
                + "    }\n"
                + " }";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Expressões verdadeiras ou falsas AND e OR", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioCondicionalTRES.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaCondicional();
            }
        } else {
            lista.ListaCondicional();
        }
    }

    public void ExercicioQuatro() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String enunciado = "Faça um programa que leia um número inteiro e retorna ao usuário uma mensagem\n informando se o número é par ou ímpar e se é positivo ou negativo.\n";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Par ou ímpar/ Positivo ou negativo", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n\n"
                + "    //Pedindo entrada para o usuário\n"
                + "    System.out.println(\"Digite um número inteiro:\");\n"
                + "    int numero = scanner.nextInt();\n\n"
                + "    //Testando as condições e exibindo na tela\n"
                + "    if((numero%%2)==0){\n"
                + "        if(numero > 0){\n"
                + "            System.out.println(\"O número digitado é par e positivo\");\n"
                + "      } else {\n"
                + "        System.out.println(\"O número digitado é par e negativo\");\n"
                + "      }\n"
                + "    } else {\n"
                + "      if (numero > 0) {\n"
                + "        System.out.println(\"O número digitado é ímpar e positivo\");\n"
                + "      } else {\n"
                + "        System.out.println(\"O número digitado é ímpar e negativo\");\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Par ou ímpar/ Positivo ou negativo", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioCondicionalQUATRO.txt", enunciado+ "\n Resolução: \n"+ resolucaoDoExercicio);
            } else {
                lista.ListaCondicional();
            }
        } else {
            lista.ListaCondicional();
        }
    }

    public void ExercicioCinco() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Tendo como dados de entrada a altura e o sexo de uma pessoa,\n" + "construa um programa que calcule seu peso ideal utilizando as seguintes fórmulas:\n"
                + "a. Homens: Peso Ideal = (72,7 * altura) - 58\n"
                + "b. Mulheres: Peso Ideal = (62,1 * altura) – 44,7\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Peso ideal", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n\n"
                + "    //Declarando variáveis\n"
                + "    char sexo;\");\n"
                + "    float altura;\n"
                + "    float pesoIdeal=0;\n"
                + "    boolean validacao = true;\n\n"
                + "    //Loop para entrada do usuário, e validação de sexo\n"
                + "    do{\n"
                + "      System.out.println(\"Digite seu sexo:\");\n"
                + "      sexo = scanner.next().toUpperCase().charAt(0);\n"
                + "      if(sexo == 'M' || sexo == 'F'){\n"
                + "        validacao = false;\n"
                + "      }else{\n"
                + "        System.out.println(\"Digite um sexo válido(M ou F)\");\n"
                + "      }\n"
                + "    }while(validacao);\n\n"
                + "    //Pedindo entrada para usuário\n"
                + "    System.out.println(\"Digite sua Altura:\");\n"
                + "    altura = scanner.nextFloat();\n\n"
                + "    //Condicional para peso ideal\n"
                + "    if(sexo == 'M'){\n"
                + "      pesoIdeal =(72.7f*altura)-58.0f;\n"
                + "    }else if(sexo == 'F'){\n"
                + "      pesoIdeal = (62.1f * altura)-44.7f;\n"
                + "    }\n\n"
                + "    //Exibindo na tela\n"
                + "    System.out.printf(\"Seu peso ideal é %.2f Kg \n\", pesoIdeal);\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Peso ideal", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioCondicionalCINCO.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaCondicional();
            }
        } else {
            lista.ListaCondicional();
        }
    }

    public void ExercicioSeis() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "João é pescador e um microcomputador para controlar o seu rendimento diário.\n"
                + "Toda vez que ele traz um peso de peixe maior do que o estabelecido no regimento"
                + "de pesca do Estado de SP (50 quilos),\n ele deve pagar uma multa de R$ 4,00 por"
                + "quilo excedente.\n Faça um programa que, quando João informar o peso de peixes"
                + "que trouxe no dia, o programa retorna o valor da multa.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Multa do peixe", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Criando a avariavel que acessará o teclado\n"
                + "    Scanner scanner = new Scanner(System.in);\n\n"
                + "    //Declarando variáveis\n"
                + "    float pesoEncedido, peso, valorPago=0;\n"
                + "    int valorPorPeso = 4;\n\n"
                + "    //Recebendo o peso do usuário\n"
                + "    System.out.print(\"Digite o peso do seu peixe: \");\n"
                + "    peso = scanner.nextFloat();\n\n"
                + "    //Se o peso exceder de 50kg, o sistema calculará o valor da multa\n"
                + "    if(peso>50){\n"
                + "      //calculando o peso que se excedeu\n"
                + "      pesoEncedido = peso - 50;\n"
                + "      //calculando o valor da multa, caso o usuario digitou um valor quebrado para o peso, o valor será arredondado\n"
                + "      valorPago = valorPorPeso * Math.round(pesoEncedido);\n"
                + "    }\n\n"
                + "    //exibindo o resultado na tela\n"
                + "    System.out.println(\"O valor da multa a ser paga é R$\"+ valorPago);\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Multa do peixe", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioCondicionalSEIS.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaCondicional();
            }
        } else {
            lista.ListaCondicional();
        }
    }

    public void ExercicioSete() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa de resultado de exames em que o usuário digitará Nome,\n"
                + "idade, sexo e quantidade de hemoglobina em g/gL. O programa deverá, com base"
                + "na tabela abaixo, informar se o resultado está normal ou se há alguma alteração.\n"
                + " Crianças de 2 a 6 anos  |  11,5 a 13,5 g/dL\n"
                + " Crianças de 6 a 12 anos |  11,5 a 15,5 g/dL\n"
                + "              Homens               |    14 a 18 g/dL\n"
                + "             Mulheres              |    12 a 16 g/dL \n"
                + "             Grávidas               |      11 g/dL \n";
        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Hemoglobina", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n\n"
                + "    //Declarando variáveis\n"
                + "    String nome;\n"
                + "    int idade;\n"
                + "    char sexo;\n"
                + "    float quantHemoglobina;\n\n"
                + "    //Pedindo entradas para o usuário\n"
                + "    System.out.print(\"Digite seu nome: \");;\n"
                + "    nome = scanner.next();\n"
                + "    System.out.print(\"Digite sua idade: \");\n"
                + "    idade = scanner.nextInt();\n"
                + "    System.out.print(\"Digite seu sexo: \");\n"
                + "    sexo = scanner.next().toUpperCase().charAt(0);\n"
                + "    System.out.print(\"Digite a quantidade de hemoglobina em g/gL: \");\n"
                + "    quantHemoglobina = scanner.nextFloat();\n\n"
                + "    //Testando condição para tabela\n"
                + "    if(idade >= 2 && idade <= 6){\n"
                + "      if(quantHemoglobina >= 11.5f && quantHemoglobina <= 13.5f){\n"
                + "        System.out.println(\"Resultado está normal\");\n"
                + "      }else{\n"
                + "        System.out.println(\"Resultado não está normal\");\n"
                + "      }\n"
                + "    }else if(idade > 6 && idade <= 12){\n"
                + "      if(quantHemoglobina >= 11.5f && quantHemoglobina <= 15.5f ){\n"
                + "        System.out.println(\"Resultado está normal\");\n"
                + "      }else{\n"
                + "        System.out.println(\"Resultado não está normal\");\n"
                + "      }\n"
                + "    }else if(sexo == 'M'){\n"
                + "      if(quantHemoglobina >= 14 && quantHemoglobina <= 18){\n"
                + "        System.out.println(\"Resultado está normal\");\n"
                + "      }else{\n"
                + "        System.out.println(\"Resultado não está normal\");\n"
                + "      }\n"
                + "    }else if(sexo == 'F'){\n"
                + "      System.out.println(\"Está grávida?\");\n"
                + "      char resposta = scanner.next().toUpperCase().charAt(0);\n"
                + "      if(resposta == 'S'){\n"
                + "        if(quantHemoglobina == 11){\n"
                + "          System.out.println(\"Resultado está normal.\");\n"
                + "        }else{\n"
                + "          System.out.println(\"Resultado não está normal\");\n"
                + "        }\n"
                + "      }else if(resposta == 'N'){\n"
                + "        if(quantHemoglobina >= 12 && quantHemoglobina <= 16){\n"
                + "          System.out.println(\"Resultado está normal.\");\n"
                + "        }else{\n"
                + "          System.out.println(\"Resultado não está normal\");\n"
                + "        }\n"
                + "      }else{\n"
                + "        System.out.println(\"Resposta inválida\");\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Hemoglobina", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioCondicionalSETE.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaCondicional();
            }
        } else {
            lista.ListaCondicional();
        }
    }

    public void ExercicioOito() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa para um banco de sangue em que o usuário informará\n qual o"
                + "tipo sanguíneo de um paciente e o programa retornará\n que tipo de sangue este "
                + "paciente pode receber.\n"
                + " Sangue Tipo |  Pode doar para:  | Pode receber doação de: \n"
                + "         A+           |        AB+ e A+        |   A+, A-, O+ e O- \n"
                + "         A-            | A+, A-, AB+ e AB- |       A+ e O- \n"
                + "         B+           |        AB+ e B+        |   B+, B-, O+ e O- \n"
                + "         B-            | B+, B-, AB+ e AB- |       B- e O- \n"
                + "        AB+          |             AB+            |        todos  \n"
                + "        AB-           |        AB+ e AB-       |   A-, B-, O- e AB- \n"
                + "         O+           |  A+,B+, O+ e AB+ |       O+ e O- \n"
                + "         O-            |           todos            |          O- \n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Banco de sangue", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n\n"
                + "    //Declarando variáveis\n"
                + "    String sangue;\n"
                + "    String [] tiposDeSangue = {\"A+\",\"A-\",\"B+\",\"B-\",\"AB+\",\"AB-\",\"O+\",\"O-\"};\n\n"
                + "    //Pedindo entrada para usuário\n"
                + "    System.out.println(\"Informe o tipo de sangue do paciente\");\n"
                + "    sangue = scanner.next().toUpperCase();\n\n"
                + "    //Condicional para tabela\n"
                + "    if(sangue.equals(tiposDeSangue[0])){\n"
                + "      System.out.println(\"Pode receber doação de: \"+tiposDeSangue[0]+\", \"+tiposDeSangue[1]+\", \"+tiposDeSangue[7]+\" e \"+tiposDeSangue[6]);\n"
                + "    }else if(sangue.equals(tiposDeSangue[1])){\n"
                + "      System.out.println(\"Pode receber doação de: \"+tiposDeSangue[1]+\" e \"+tiposDeSangue[7]);\n"
                + "    }else if(sangue.equals(tiposDeSangue[2])){\n"
                + "    System.out.println(\"Pode receber doação de: \"+tiposDeSangue[2]+\", \"+tiposDeSangue[3]+\", \"+tiposDeSangue[7]+\" e \"+tiposDeSangue[6]);\n"
                + "    }else if(sangue.equals(tiposDeSangue[3])){\n"
                + "      System.out.println(\"Pode receber doação de: \"+tiposDeSangue[3]+\" e \"+tiposDeSangue[7]);\n"
                + "    }else if(sangue.equals(tiposDeSangue[4])){\n"
                + "      System.out.println(\"Pode receber doação de todos os tipos\");\n"
                + "    }else if(sangue.equals(tiposDeSangue[5])){\n"
                + "      System.out.println(\"Pode receber doação de: \"+tiposDeSangue[1]+\", \"+tiposDeSangue[3]+\", \"+tiposDeSangue[7]+\" e \"+tiposDeSangue[5]);\n"
                + "    }else if(sangue.equals(tiposDeSangue[6])){\n"
                + "      System.out.println(\"Pode receber doação de: \"+tiposDeSangue[6]+\" e \"+tiposDeSangue[7]);\n"
                + "    }else if(sangue.equals(tiposDeSangue[7])){\n"
                + "      System.out.println(\"Pode receber doação de: \"+tiposDeSangue[7]);\n"
                + "    }else{\n"
                + "      System.out.println(\"Tipo não existente.\");\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Banco de sangue", JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioCondicionalOITO.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaCondicional();
            }
        } else {
            lista.ListaCondicional();
        }
    }
}
