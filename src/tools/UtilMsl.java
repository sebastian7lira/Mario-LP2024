/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Sebas ;0
 */
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class UtilMsl {

    public static void habilitar(boolean valor, JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            vetComp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (JComponent jComponent : vetComp) {
            if (jComponent instanceof JTextField) {
                ((JTextField) jComponent).setText("");
            }
            if (jComponent instanceof JComboBox) {
                ((JComboBox) jComponent).setSelectedIndex(-1);
            }
            if (jComponent instanceof JCheckBox) {
                ((JCheckBox) jComponent).setSelected(false);
            }
        }
    }

    public static void mensagem(String cadeia) {
        JOptionPane.showMessageDialog(null, cadeia);
    }

    public static boolean perguntar(String cadeia) {
        //JOptionPane.showConfirmDialog(null, cadeia, "Perguntar", JOptionPane.YES_NO_OPTION);
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro",
                "confirmar", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static int strInt(String cad) { // Converte uma string para um inteiro.
        return Integer.parseInt(cad); // Usa o método 'parseInt' para realizar a conversão.
    }

    public static String intStr(int num) { // Converte um inteiro para uma string.
        return String.valueOf(num); // Usa o método 'valueOf' para realizar a conversão.
    }

    public static double strDouble(String cad) { // Converte uma string para um número de ponto flutuante (double).
        return Double.parseDouble(cad); // Usa o método 'parseDouble' para realizar a conversão.
    }

    public static String doubleStr(double num) { // Converte um número de ponto flutuante (double) para uma string.
        return String.valueOf(num); // Usa o método 'valueOf' para realizar a conversão.
    }

    public static Date strDate(String cad) { // Converte uma string para um objeto Date.
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato de data esperado como dia/mês/ano.
        Date data = null; // Inicializa a variável 'data' como nula.
        try {
            data = formato.parse(cad); // Tenta converter a string para uma data usando o formato definido.
        } catch (ParseException ex) { // Captura qualquer exceção que possa ocorrer durante a conversão.
            Logger.getLogger(UtilMsl.class.getName()).log(Level.SEVERE, null, ex); // Registra o erro no logger.
            System.out.println("Erro: " + ex.getMessage()); // Exibe uma mensagem de erro no console.
        }
        return data; // Retorna o objeto Date convertido.
    }

    public static String dateStr(Date data) { // Converte um objeto Date para uma string.
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato de data como dia/mês/ano.
        String cad = formato.format(data); // Converte a data para uma string usando o formato definido.

        return cad; // Retorna a string resultante.
    }

}
