/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Amilton
 */
public class Util {

    public static String formataData(String data) {
        String dataFormatada;
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(date);
        } catch (Exception e) {
            dataFormatada = "";
        }
        return dataFormatada;
    }

    public static String formataDataInvertida(String data) {
        String dataFormatada;
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            dataFormatada = new SimpleDateFormat("yyyy-MM-dd").format(date);
        } catch (Exception e) {
            dataFormatada = "";
        }
        return dataFormatada;
    }
}
