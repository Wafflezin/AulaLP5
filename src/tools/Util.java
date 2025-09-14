/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public static int perguntar(String cad) {
        return JOptionPane.showConfirmDialog(null, cad, cad, JOptionPane.YES_NO_OPTION);
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double strToDouble(String cad) {
        try {
            return Double.parseDouble(cad.replace(",", "."));
        } catch (NumberFormatException e) {
            mensagem("Erro");
            return 0.0;
        }
    }

    public static String doubleToStr(double num) {
        return String.valueOf(num);
    }

    public static Date strToDate(String cad) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            return sdf.parse(cad);
        } catch (ParseException e) {
            mensagem("Erro");
            return null;
        }
    }

    public static String dateToStr(Date data) {
        if (data == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }
};
