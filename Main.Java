
  

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Bingo Program!

//Main is finished.. don't touch!  :)

//You need to add the Bingo.java file and 
// code the Bingo class info & methods

class Main {
  public static void main(String[] args)
    {
        Bingo board1 = new Bingo();
        //this prints the board ArrayList in the console
        System.out.print(board1.getBoard());
        JTextArea area = new JTextArea();
        area.setEditable(false);
        //this prints the board toString visual in the Gui window
        area.append(board1.toString());
        area.setBackground(new Color(255,250,205));
        area.setForeground(new Color(0,0,0));
        area.setFont(new Font("Simhei", Font.PLAIN, 15));
        // how many rows will show at one time
        area.setRows(35);
        // how many columns (1 char) will show at one time
        area.setColumns(35);
        JScrollPane pane = new JScrollPane(area);
        JOptionPane.showMessageDialog(null,pane);	
        

    }
}
