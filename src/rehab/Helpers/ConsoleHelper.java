/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab.Helpers;

/**
 *
 * @author manusb
 */
public class ConsoleHelper {

    private static String Delimiter = "***************************************************************************************************************";

    public static String AddBorder(String content) {
        return String.format("%s\n%s\n%s", Delimiter, content, Delimiter);
    }
    
    public static String AddTopBorder(){
        return Delimiter;
    }

}
