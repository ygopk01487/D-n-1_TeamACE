/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_Helper;

/**
 *
 * @author y go
 */
public class myComboBox {
    Object value; //Chứa mã loại
    Object text; //Chứa ten loại
    public myComboBox(Object value, Object text) {
        this.value = value;
        this.text = text;
    }    
    @Override
    public String toString() {
        return text.toString();
    }
    //hàm lấy value kiển int
    public int MaInt() {
        return Integer.parseInt(value.toString());
    }
    //hàm lấy value kiểu String
    public String MaString() {
        return value.toString();
    }
}
