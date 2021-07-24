/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Laden
 */
public class Renderer extends DefaultListCellRenderer implements ListCellRenderer<Object>, ActionListener, Serializable{
    
    private boolean isKategori = true;
    public Renderer(boolean isKategori) {
        this.isKategori = isKategori;
    }
    
    
    
    @Override
    public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean bln, boolean bln1) {
        
        JlistCustom lst =(JlistCustom) o;
        setText(lst.getText());
        if(isKategori){
            setIcon(new ImageIcon("arrow-pointing-to-right.png"));
        } else {
            if(lst.getIscheck().equals("1")){
                setIcon(new ImageIcon("check-box.png"));
            } else {
                setIcon(new ImageIcon("blank-check-box.png"));
            }
        }
        
        if(bln){
            setBackground(jlist.getSelectionBackground());
            setForeground(jlist.getSelectionForeground());
        } else {
            setBackground(jlist.getBackground());
            setForeground(jlist.getForeground());
        }
        
        setEnabled(true);
        setFont(jlist.getFont());
        return this;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
