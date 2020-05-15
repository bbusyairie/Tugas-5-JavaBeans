/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

import java.awt.*;

/**
 *
 * @author FATUR-PC
 */
public class Counter extends Panel{
    
    private long count=0;
    public Label label;
    private long maxValue=100;
    
    
    public void setMaxValue(long max) {
        maxValue = max;
    }
    
    public long getMaxValue(){
        return maxValue;
    }
    
    public Counter(){
        setBackground(Color.blue);
        setBackground(Color.white);
        label = new Label(""+count);
        add(label);
    }
    
    public void increment(){
        if (count < maxValue){
            count++;
            label.setText(count + " ");
        } else {
            label.setText("||");
        }           
    }
    
}
