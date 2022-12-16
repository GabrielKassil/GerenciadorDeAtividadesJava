package projeto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ImprimirArquivo {

    public static void escreverTexto(String caminhoDoArquivo, String textoEscrever) throws IOException {
      FileWriter arq = new FileWriter(caminhoDoArquivo);
      PrintWriter gravarArq = new PrintWriter(arq);
      gravarArq.printf(textoEscrever);
      arq.close();
      UIManager.put("OptionPane.okButtonText", "Ok");
      JOptionPane.showMessageDialog(null, "Arquivo Impresso com sucesso!!!");
    }
}
