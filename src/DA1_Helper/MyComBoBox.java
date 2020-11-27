/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_Helper;

/**
 *
 * @author Administrator
 */
public class MyComBoBox {

    Object value;
    Object text;

    public MyComBoBox(Object value, Object text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String toString() {
        return text.toString();
    }

    //lay ma kieu int
    public int MaInt() {
        return Integer.parseInt(value.toString());
    }

    //ham lay value kieu string
    public String MaString() {
        return value.toString();
    }
}
