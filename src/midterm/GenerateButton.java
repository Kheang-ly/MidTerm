/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package midterm;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Kheang
 */
public class GenerateButton extends javax.swing.JPanel {

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * @return the btn
     */
    public SubJbutton[][] getBtn() {
        return btn;
    }

    /**
     * @param btn the btn to set
     */
    public void setBtn(SubJbutton[][] btn) {
        this.btn = btn;
    }

    /** Creates new form GenerateButton */
    public GenerateButton() {
        createButtons();
    }

    private int row=1,col=9;
    private SubJbutton [][]btn;
    
    
    private void createButtons()
    {
        this.removeAll(); //remove all component on panel
        setBtn(new SubJbutton[getRow()][getCol()]);
        String txt;
        int x=5,y=5;
        for(int i=0;i<getBtn().length;i++)
        {
            x=5;
            for(int j=0;j<getBtn()[i].length;j++)
            {
                txt=j+""; 
                getBtn()[i][j]=new SubJbutton(txt); 
                add(getBtn()[i][j],new AbsoluteConstraints(x, y, 60, 30));
                x+=65; 
            }
            y+=35;
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    }
}
