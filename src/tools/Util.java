/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author u70874542189
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            JComponent componente = componentes[i];

            if (componente instanceof JTextComponent) {
                ((JTextComponent) componente).setText("");

            } else if (componente instanceof JComboBox) {
                ((JComboBox<?>) componente).setSelectedIndex(-1);

            } else if (componente instanceof JCheckBox) {
                ((JCheckBox) componente).setSelected(false);
            }

        }
    }

    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

    public static void perguntar(String cad) {
        JOptionPane.showConfirmDialog(null, cad);
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double strToDouble(String cad) {
        return 0;
    }

    public static String doubleToStr(double num) {
        return "";
    }

    public static Date strToDte(String cad) {
        return null;
    }

    public static String dateToStr(Date data) {
        return "";
    }

};
