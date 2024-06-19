/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Kheang
 */
public class SubJbutton extends JButton {

    /**
     * @return the sub
     */
    public List<SubJbutton> getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(List<SubJbutton> sub) {
        this.sub = sub;
    }
    public SubJbutton()
    {
         this.addActionListener((e)->{ 
            thisActionperformed(e);
        });
    }
    public SubJbutton(String txt)
    {
        this(); //call constructor above;
        this.setText(txt);
    }
    private List<SubJbutton> sub=new ArrayList<>();
    private void thisActionperformed(ActionEvent evt)
    {
         
    }
    
}
