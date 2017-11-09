/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Diego
 */
public enum EnumValueBox {
    B1(200), B2(400), B3(600), B4(800), B5(1000);
    
    private final int value;

    private EnumValueBox(int value) {
        this.value = value;
    }
}
