/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_Helper;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author y go
 */
public class ThongBao {
    public static void ThpngBaoDonGian(String Title, String Content) {
        JOptionPane.showMessageDialog(new JFrame(), Content, Title, 
                JOptionPane.INFORMATION_MESSAGE);
    }
}
