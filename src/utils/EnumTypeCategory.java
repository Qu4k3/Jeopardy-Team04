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
public enum EnumTypeCategory {
    DEPORTES(0), PROGRAMACION(1), 
    CULTURA(2), TECNOLOGIA(3),
    MUNDO_LABORAL(4);
    private final int value;

    private EnumTypeCategory(int value) {
        this.value = value;
    }
    
    
}
