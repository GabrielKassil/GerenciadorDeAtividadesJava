package projeto.ExerciciosDasListas;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.IOException;
import projeto.ImprimirArquivo;
import projeto.MenuListas;

public class ExerciciosString {

    //Pasta com caminho para ser salvo
    String pasta = "D:\\Users\\gabri\\Documents\\ESTUDOS\\ANHEMBI\\programação de soluções computacionais\\Listas\\ProjetoFinalProgramacaoEsolucoes\\src\\projeto\\ArquivosGravados\\ListaString\\";

    public void ExercicioUm() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que verifica se o texto começa com letra em caixa alta ou não.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Caixa alta", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando o leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    //Declaração de variável\n"
                + "    char letra;\n\n"
                + "    //Solicitando entrada do usuário\n"
                + "    System.out.println(\"Digite um texto:\");\n"
                + "    letra = scanner.next().charAt(0);\n\n"
                + "    //Se o caractere for maiuscula entrará nessa condição\n"
                + "    if(Character.isUpperCase(letra)){\n"
                + "      System.out.println(\"Esse texto começa com caixa alta.\");\n"
                + "    }else {//senao dirá que é caixa baixa\n"
                + "      System.out.println(\"Esse texto não começa com caixa alta.\");\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Caixa alta",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioStringUM.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaString();
            }
        } else {
            lista.ListaString();
        }
    }

    public void ExercicioDois() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que verifica se o código inicial de um produto começa com “BEB”.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Código BEB", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Declaração das variáveis\n"
                + "    String codigo = \"BEBIUYHDUIAS90\";\n"
                + "    String textoInicial=\"\";\n\n"
                + "    //for para pegar as 3 primeiras letras do código\n"
                + "    for(int i = 0; i < 3; i++){\n"
                + "      textoInicial += codigo.charAt(i);\n"
                + "    }\n\n"
                + "    //Verificando se o texto começa com \"BEB\" ou não\n"
                + "    if(textoInicial.equals(\"BEB\")){\n"
                + "      System.out.println(\"O código inicial do produto começa com 'BEB'\");\n"
                + "    }else{\n"
                + "      System.out.println(\"O código inicial do produto NÃO começa com 'BEB'\");\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Código BEB",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioStringDOIS.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaString();
            }
        } else {
            lista.ListaString();
        }
    }

    public void ExercicioTres() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que verifica qual o último caractere digitado no texto.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Último caractere", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Declaração de variáveis\n"
                + "    String texto=\"texto para utilização no exercicio\";\n\n"
                + "    //pegando posição do ultimo caractere\n"
                + "    int i = texto.length() -1;\n"
                + "    //exibindo caractere\n"
                + "    System.out.println(\"O ultimo caractere digitado no texto é: \"+texto.charAt(i));\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Último caractere",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioStringTRES.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaString();
            }
        } else {
            lista.ListaString();
        }
    }

    public void ExercicioQuatro() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "O usuário insere um CPF seguindo xxx.xxx.xxx-xx.\n O programa deve apagar os pontos e o hífen e, depois contar quantos caracteres foram inseridos.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "CPF sem pontos e hífen", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n\n"
                + "    //Solicitando entrada do usuário\n"
                + "    System.out.println(\"Digite seu cpf no formato xxx.xxx.xxx-xx:\");\n"
                + "    String cpf = scanner.next();\n\n"
                + "    //Removendo . e -\n"
                + "    cpf = cpf.replaceAll(\"[.-]\",\"\");\n"
                + "    int cont = cpf.length();\n"
                + "    //Exibindo na tela\n"
                + "    System.out.printf(\"Foram inseridos %d caracteres.\n\",cont);\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "CPF sem pontos e hífen",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioStringQUATRO.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaString();
            }
        } else {
            lista.ListaString();
        }
    }

    public void ExercicioCinco() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Fazer um programa com uma palavra secreta. O usuário deverá tentar adivinhar esta palavra.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Palavra secreta", JOptionPane.YES_NO_OPTION);

        // String resolucaoDoExercicio = "";
        String resolucaoDoExercicio = "import java.util.Random;\n"
                + "import java.util.Scanner;\n"
                + "import java.text.Normalizer;\n"
                + "import java.util.regex.Pattern;\n"
                + "class Main {\n"
                + "  public static String deAccent(String str) {\n"
                + "    String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); \n"
                + "    Pattern pattern = Pattern.compile(\"\\p{InCombiningDiacriticalMarks}+\");\n"
                + "    return pattern.matcher(nfdNormalizedString).replaceAll(\"\");\n"
                + "  }\n"
                + "  public static void main(String[] args) {\n"
                + "    //Instânciando o leitor\n"
                + "    Scanner scanner = new Scanner(System.in);\n"
                + "    //Criando random para buscar palavra aleatoria\n"
                + "    Random aleatorio = new Random();\n"
                + "    //declarando variaveis\n"
                + "    String [] palavras = {\"Rosbife\", \"Pera\", \"Acucar\", \"Condicionador\", \"Limonada\", \"Cachorro-quente\", \"Siriquela\", \"Carro\", \"Mortadela\", \"Maca\", \"Ovo\", \"Macaxeira\", \"Orangotango\"};\n"
                + "    String palavraSecreta = palavras[aleatorio.nextInt(palavras.length)], tentativa;\n"
                + "    char [] palavra = palavraSecreta.toCharArray();\n\n"
                + "    //Exibindo apresentação\n"
                + "    System.out.println(\"\"\"\n"
                + "----------------------Bem vindo----------------------\n"
                + "-Nesse programa você deve adivinha a palavra secreta-\n"
                + "---------------------VAMOS LÁ!!!---------------------\n"
                + "\"\"\");\n\n"
                + "    //Exibindo na tela\n"
                + "    System.out.printf(\"A palavra possue %d letras\\n\",palavraSecreta.length());\n"
                + "    System.out.println(\"A primeira letra é \" + palavra[0]);\n"
                + "    System.out.println(\"Qual palavra você acha que é?\");\n"
                + "    tentativa = deAccent(scanner.next().toUpperCase());\n\n"
                + "    //Verificando a palavra\n"
                + "    if(tentativa.toUpperCase().equals(palavraSecreta.toUpperCase())){\n"
                + "      System.out.println(\"ACERTOOOUUUU!!! VOCÊ É FERA, PARABÉNS!!!\");\n"
                + "    }else{\n"
                + "      System.out.println(\"Infelizmente tu errou!\");\n"
                + "    }\n\n"
                + "    System.out.println(\"\"\"\n"
                + "-------------Ultima tentativa-------------\n"
                + "\"\"\");\n"
                + "    System.out.println(\"A anti-penúltima letra é \" + palavra[(palavra.length)-2]);\n"
                + "    System.out.println(\"Qual palavra você acha que é?\");\n"
                + "    tentativa = deAccent(scanner.next().toUpperCase());\n\n"
                + "    if(tentativa.toUpperCase().equals(palavraSecreta.toUpperCase())){\n"
                + "      System.out.println(\"ACERTOOOUUUU!!! VOCÊ É FERA, PARABÉNS!!!\");\n"
                + "    }else{\n"
                + "      System.out.println(\"Infelizmente tu errou! PERDEEUU!!!!\");\n"
                + "    }\n"
                + "  }\n"
                + " }";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Palavra secreta",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                ImprimirArquivo.escreverTexto(pasta+"exercicioStringCINCO.txt", enunciado + "\n Resolução: \n" + resolucaoDoExercicio);
            } else {
                lista.ListaString();
            }
        } else {
            lista.ListaString();
        }
    }
}
