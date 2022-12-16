package projeto;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MenuInicial {
    public void Menu() throws IOException{
        MenuListas lista = new MenuListas();
        UIManager.put("OptionPane.cancelButtonText", "Sair");
        UIManager.put("OptionPane.okButtonText", "Avançar");
        String[] opcoes = {"1 - Condicional e condicional relacional", "2 - For", "3 - Looping", "4 - Operadores aritméticos", "5 - String", "6 - While"};
        String selecao = (String) JOptionPane.showInputDialog(null, "-------------------------------------------------BEM VINDO!!!-------------------------------------------------\n"
                + "Aqui você encontrará diversas soluções de diversas listas de exercícios.\n"
                + "  Os exercícios estão separados por temas, conforme a lista abaixo:",
                "Projeto - Gerenciador de atividades", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if(selecao != null){
            char resposta = selecao.charAt(0);
                
            switch (resposta) {
                case '1':
                    lista.ListaCondicional();
                    break;
                case '2':
                    lista.ListaFor();
                    break;
                case '3':
                    lista.ListaLooping();
                    break;
                case '4':
                    lista.ListaOperadores();
                    break;
                case '5':
                    lista.ListaString();
                    break;
                case '6':
                    lista.ListaWhile();
                    break;
            }
        }
            
    }
    
}
