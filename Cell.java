/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conway;
import javax.swing.JPanel;
/**
 *
 * @author Shaun
 */
public class Cell extends JPanel {
    private Boolean state,nextState;
    private int x_pos;
    private int y_pos;
    private int neighborCount;
    
    public Cell(){
        super();
        state = false;
        nextState=false;
        neighborCount = 0;
        
    }
    public void addNeighbor(){
        neighborCount++;
    }
    
    public void killNeighbor(){
        neighborCount--;
    }
    public void resetNeighbor(){
        neighborCount=0;
    }
    
    public int getNeighbor(){
        return neighborCount;
    }
    
    
    public void setState(boolean x){
        state = x;
    }
    
    public void setNextState(boolean x){
        nextState = x;
    }
    
    public void setCoords(int x, int y){
        x_pos=x;
        y_pos=y;
    }
    
    public boolean getState(){
        return state;
    }
    
    public boolean getNextState(){
        return nextState;
    }
    
    public int getXPos(){
        return x_pos;
    }
    public int getYPos(){
        return y_pos;
    }
   
    
}
