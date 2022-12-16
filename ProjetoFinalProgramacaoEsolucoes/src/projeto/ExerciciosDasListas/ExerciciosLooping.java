package projeto.ExerciciosDasListas;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.IOException;
import projeto.ImprimirArquivo;
import projeto.MenuListas;

public class ExerciciosLooping {
    
    //Pasta com caminho para ser salvo
    String pasta = "D:\\Users\\gabri\\Documents\\ESTUDOS\\ANHEMBI\\programação de soluções computacionais\\Listas\\ProjetoFinalProgramacaoEsolucoes\\src\\projeto\\ArquivosGravados\\ListaLooping\\";

    public void ExercicioUm() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que peça uma nota, entre zero e dez\n. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido\n.";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Validação de 0 à 10", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "Scanner sc = new Scanner(System.in);\n"
                + "double nota = 0;\n"
                + "boolean notaValida = false;"
                + "do{\n"
                + "System.out.println(\"Entre com uma nota de 0 a 10: \");\n"
                + "nota = sc.nextDouble();\n"
                + "if(nota>=0 && nota<=10){\n"
                + "System.out.println(\"Nota: \" + nota);\n"
                + "notaValida = true;\n"
                + "}else{\n"
                + "System.out.println(\"Valor inválido\");\n"
                + "}\n"
                + "}while(notaValida == false);\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Validação de 0 à 10",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {

                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingUM.txt",enunciado + "\n Resolução \n" + resolucaoDoExercicio);

            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioDois() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,\n mostrando uma mensagem de erro e voltando a pedir as informações.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Usuário e senha", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "Scanner sc = new Scanner(System.in);\n"
                + "String nome;\n"
                + "String senha;\n"
                + "boolean diferente = false;\n"
                + "do{\n"
                + "System.out.println(\"Digite o nome do usuário: \");\n"
                + "nome = sc.next();\n"
                + "System.out.println(\"Digite a senha: \");"
                + "senha = sc.next();\n"
                + "if(nome.equalsIgnoreCase(senha)){\n"
                + "System.out.println(\"Erro, não é permitido que a senha seja igual ao nome\");\n"
                + "}else{\n"
                + "System.out.println(\"Concluído\");\n"
                + "diferente = true;\n"
                + "}\n"
                + "}while(diferente == false);\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Usuário e senha",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingDOIS.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioTres() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que leia e valide as seguintes informações:\n" + "a. Nome: maior que 3 caracteres;\n" + "b. Idade: entre 0 e 150;\n" + "c. Salário: maior que zero;\n" + "d. Sexo: 'f' ou 'm';\n" + "e. Estado Civil: 's', 'c', 'v', 'd';\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Validação", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "Scanner sc = new Scanner(System.in);\n"
                + "String nome;\n"
                + "int idade;\n"
                + "double salario;\n"
                + "String sexo;\n"
                + "String EstadoCivil;\n"
                + "boolean valido = false;\n"
                + "do{\n"
                + "System.out.println(\"Digite seu nome: \");\n"
                + "nome=sc.next();\n"
                + "if(nome.length()>3){\n"
                + "valido = true;\n"
                + "}else{\n"
                + "System.out.println(\"O nome precisa ser maior que 3 caracteres\");\n"
                + "}\n"
                + "}while(valido == false);\n"
                + "valido = false;\n"
                + "do{\n"
                + "System.out.println(\"Digite sua idade: \");\n"
                + "idade = sc.nextInt();\n"
                + "if(idade>=0 && idade<=150){\n"
                + "valido = true;\n"
                + "}else{\n"
                + "System.out.println(\"Idade inválida\");\n"
                + "}\n"
                + "}while(valido == false);\n"
                + "valido = false;\n"
                + "do{\n"
                + "System.out.println(\"Digite seu salario: \");\n"
                + "salario = sc.nextDouble();\n"
                + "if(salario>0){\n"
                + "valido = true;\n"
                + "}else{\n"
                + "System.out.println(\"O salário precisa ser maior que zero\");\n"
                + "}\n"
                + "}while(valido == false);\n"
                + "valido = false;\n"
                + "do{\n"
                + "System.out.println(\"Entre com seu sexo, sendo m para masculino ou f para feminino: \");\n"
                + "sexo = sc.next();\n"
                + "if(sexo.equalsIgnoreCase('f') || sexo.equalsIgnoreCase('m')){\n"
                + "valido = true;\n"
                + "}else{\n"
                + "System.out.println(\"Sexo inválido\");\n"
                + "}\n"
                + "}while(valido == false);\n"
                + "valido = false;\n"
                + "do{\n"
                + "System.out.println(\"Entre com seu estado civil, sendo s para solteiro(a), c para casado(a), v para viúvo(a) ou d para divorciado(a): \");\n"
                + "EstadoCivil = sc.next();\n"
                + "if(EstadoCivil.equalsIgnoreCase('s') || EstadoCivil.equalsIgnoreCase('c') || EstadoCivil.equalsIgnoreCase('v') || EstadoCivil.equalsIgnoreCase('d')){\n"
                + "valido = true;\n"
                + "}else{\n"
                + "System.out.println(\"Estado civil inválido\");\n"
                + "}\n"
                + "}while(valido == false);\n"
                + "System.out.println(\"Seu nome é: \" + nome);\n"
                + "System.out.println(\"Sua idade é: \" + idade);\n"
                + "System.out.println(\"Seu salário é: \" + salario);\n"
                + "System.out.println(\"Seu sexo é: \" + sexo);\n"
                + "System.out.println(\"Seu estado civil é: \" + EstadoCivil);\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Validação",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingTRES.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioQuatro() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% \ne que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.\n Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B,\n mantidas as taxas de crescimento.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "População A e B", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "int povoA=80000;\n"
                + "int povoB=200000;\n"
                + "int ano=0;\n"
                + "while(povoA<=povoB){\n"
                + "povoA += (povoA/100) * 3;\n"
                + "povoB += (povoB/100) * 1.5;\n"
                + "ano++;\n"
                + "}\n"
                + "System.out.println(\"Povo A: \" + povoA);\n"
                + "System.out.println(\"Povo B: \" + povoB);\n"
                + "System.out.println(\"Anos passados: \" + ano);\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "População A e B",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(
                        "exercicioLoopingQUATRO.txt",
                        enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioCinco() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.\n Valide a entrada e permita repetir a operação\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "População e taxas de crescimento", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "Scanner sc = new Scanner(System.in);\n"
                + "double povoA=0;\n"
                + "double povoB=0;\n"
                + "double taxaA=0;\n"
                + "double taxaB=0;\n"
                + "int ano=0;\n"
                + "boolean valido = false;\n"
                + "do{\n"
                + "System.out.print(\"Digite o povo A: \");\n"
                + "povoA = sc.nextInt();\n"
                + "System.out.print(\"Digite o povo B: \");\n"
                + "povoB = sc.nextInt();\n"
                + "if(povoA<=0 || povoB<=0 || povoA>povoB){\n"
                + "System.out.println(\"Ambos os povos devem ser maiores que 0 e o povo A precisa ser menor que o povo B\");\n"
                + "}else{\n"
                + "valido = true;\n"
                + "}\n"
                + "}while(valido == false);\n"
                + "valido = false;\n"
                + "do{\n"
                + "System.out.print(\"Digite a taxa de crescimento do povo A: \");\n"
                + "taxaA = sc.nextDouble();\n"
                + "System.out.print(\"Digite a taxa de crescimento do povo B: \");\n"
                + "taxaB = sc.nextDouble();\n"
                + "if(taxaA<=0 || taxaB<=0){\n"
                + "System.out.println(\"As taxas devem ser maiores que 0\");\n"
                + "}else{\n"
                + "valido = true;\n"
                + "}\n"
                + "}while(valido == false);\n"
                + "while(povoA<=povoB){\n"
                + "povoA += (povoA/100) * taxaA;\n"
                + "povoB += (povoB/100) * taxaB;\n"
                + "ano++;\n"
                + "}\n"
                + "System.out.println(\"Povo A: \" + povoA);\n"
                + "System.out.println(\"Povo B: \" + povoB);\n"
                + "System.out.println(\"Anos passados: \" + ano);\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "População e taxas de crescimento",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingCINCO.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioSeis() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.\n Depois modifique o programa para que ele mostre os números um ao lado do outro.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Em baixo e do lado", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "int numeros = 0;\n"
                + "for(int i=0; i<20; i++){\n"
                + "numeros++;\n"
                + "//números um ao lado do outro;\n"
                + "System.out.print(numeros + \" \");\n"
                + "}\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Em baixo e do lado",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingSEIS.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioSete() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que leia 5 números e informe o maior número.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Maior número", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "Scanner sc = new Scanner(System.in);\n"
                + "int numeros = 0;\n"
                + "int maior = 0;\n"
                + "for(int i=0; i<5; i++){\n"
                + "System.out.println(\"Entre com um número: \");\n"
                + "numeros = sc.nextInt();\n"
                + "if(numeros>maior){\n"
                + "maior = numeros;\n"
                + "}\n"
                + "}\n"
                + "System.out.println(\"o maior número é: \" + maior);\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Maior número",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingSETE.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioOito() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que leia 5 números e informe a soma e a média dos números.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Soma e média", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "Scanner sc = new Scanner(System.in);\n"
                + "int numeros = 0;\n"
                + "double soma = 0;\n"
                + "double media = 0;\n"
                + "for(int i=0; i<5; i++){\n"
                + "System.out.println(\"Entre com um número: \");\n"
                + "numeros = sc.nextInt();\n"
                + "soma+= numeros;\n"
                + "}\n"
                + "System.out.println(\"A soma dos números é: \" + soma);\n"
                + "media = soma/5;\n"
                + "System.out.println(\"A media dos números é: \" + media);\n"
                + "}\n"
                + "}\n";
        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Soma e média",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingOITO.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioNove() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Ímpares de 1 a 50", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "int numeros = 0;\n"
                + "for(int i=1; i<50; i++){\n"
                + "numeros++;\n"
                + "if(numeros%2 == 1){\n"
                + "System.out.println(numeros);\n"
                + "}\n"
                + "}\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Ímpares de 1 a 50",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingNOVE.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioDez() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Inteiros no intervalo", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "import java.util.Scanner;\n"
                + "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "Scanner sc = new Scanner(System.in);\n"
                + "int numeroInicial;\n"
                + "int numeroFinal;\n"
                + "System.out.print(\"Entre com um número: \");\n"
                + "numeroInicial = sc.nextInt();\n"
                + "System.out.print(\"Entre com outro número: \");\n"
                + "numeroFinal = sc.nextInt();\n"
                + "System.out.print(\"O intervalo entre os números escolhidos são: \");\n"
                + "for(int i = numeroInicial+1; i<numeroFinal; i++){\n"
                + "System.out.print(i + \" \");\n"
                + "}\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Inteiros no intervalo",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingDEZ.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }

    public void ExercicioOnze() throws IOException {
        MenuListas lista = new MenuListas();

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        String enunciado = "Altere o programa anterior para mostrar no final a soma dos números\n";

        int resposta = JOptionPane.showConfirmDialog(null, enunciado
                + "Você deseja ver a resolução do exercícios?", "Soma dos números", JOptionPane.YES_NO_OPTION);

        String resolucaoDoExercicio = "class Main {\n"
                + "public static void main(String[] args) {\n"
                + "Scanner sc = new Scanner(System.in);\n"
                + "int numeroInicial;\n"
                + "int numeroFinal;\n"
                + "int soma = 0;\n"
                + "int soma2 = 0;\n"
                + "System.out.print(\"Entre com um número: \");\n"
                + "numeroInicial = sc.nextInt();\n"
                + "System.out.print(\"Entre com outro número: \");\n"
                + "numeroFinal = sc.nextInt();\n"
                + "soma2 = numeroInicial+numeroFinal;\n"
                + "System.out.print(\"O intervalo entre os números escolhidos são: \");\n"
                + "for(int i = numeroInicial+1; i<numeroFinal; i++){\n"
                + "System.out.print(i + \" \");\n"
                + "soma +=i;\n"
                + "}\n"
                + "System.out.println(\"\nA soma do intervalo entre os números: \" + soma);\n"
                + "System.out.println(\"A soma dos números escolhidos é: \" + soma2);\n"
                + "}\n"
                + "}\n";

        if (resposta == 0) {
            UIManager.put("OptionPane.noButtonText", "Voltar");
            UIManager.put("OptionPane.yesButtonText", "Imprimir");
            int novaReposta = JOptionPane.showConfirmDialog(null, resolucaoDoExercicio, "Soma dos números",
                    JOptionPane.YES_NO_OPTION);
            if (novaReposta == 0) {
                UIManager.put("OptionPane.okButtonText", "Ok");
                ImprimirArquivo.escreverTexto(pasta+"exercicioLoopingONZE.txt",enunciado + "\n resolução \n" + resolucaoDoExercicio);
            } else {
                lista.ListaLooping();
            }
        } else {
            lista.ListaLooping();
        }
    }
}
