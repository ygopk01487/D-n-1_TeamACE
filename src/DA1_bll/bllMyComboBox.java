/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_bll;

import DA1_Helper.MyComBoBox;
import DA1_Helper.ThongBao;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Administrator
 */
public class bllMyComboBox {
        public static void LoadCBB(JComboBox cbb, ResultSet rs, boolean chon){
       
        try {
            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
            cbbModel.removeAllElements();
            
            if(chon){
                MyComBoBox mcbb = new MyComBoBox(-1, "Chọn");
                cbbModel.addElement(mcbb);
            }
            
            while(rs.next()){
                MyComBoBox myCbb = new MyComBoBox(rs.getInt(1), rs.getString(2));
                cbbModel.addElement(myCbb);
            }
        } catch (SQLException ex) {
            ThongBao.ThpngBaoDonGian("Thông báo", "Lỗi load dữ liệu cho Combobox");
        }        
    }
    
    //Hàm lấy item được chọn
    public static String GetItemValue(JComboBox cbb){
        MyComBoBox myCbb = (MyComBoBox)cbb.getSelectedItem();
        if(myCbb == null){
            return "";
        }
        return myCbb.MaString();
    }
}
