/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_ex8_1;

/**
 *
 * @author kelvd
 */
public class Item {
    char color;

    public boolean setColor(char colorCode) {
        if (colorCode == ' ') {
            return false;
        } else {
            color = colorCode;
            return true;
        }
    }
}
