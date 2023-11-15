package org.Dan;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@EqualsAndHashCode
public class RestaurantManagementSystem {
    private static final int MAX_COMBO_NUM = 20;
    private int comboNum = 0;
    private Combo[] combos;

    public RestaurantManagementSystem() {
        this.combos = new Combo[MAX_COMBO_NUM];
    }

    public void addCombo(Combo combo){
        if(comboNum < MAX_COMBO_NUM){
            combos[comboNum] = combo;
        }else{
            System.out.printf("There are %d combos already, Chill hommie!", MAX_COMBO_NUM);
        }
    }

    @Override
    public String toString() {

        String comboStr = "[";

        for (Combo combo : combos) {
            if (combo != null) {
                comboStr += combo;
            }
        }
        comboStr += "]";
        return "RestaurantManagementSystem{" +
                "combos=" + comboStr +
                '}';
    }
}
