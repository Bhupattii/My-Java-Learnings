package TextField;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JTextField textField;

    MyFrame(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout()); 

       button = new JButton("Submit");
       button.addActionListener(this);


       textField = new JTextField();
       textField.setPreferredSize(new Dimension(250,40));
       textField.setFont(new Font("Consolas", Font.PLAIN,25));
       textField.setForeground(new Color(0x00ff00));
       textField.setBackground(Color.black);
       textField.setCaretColor(Color.white);
       textField.setText("Username");


       this.add(button);
       this.add(textField);
       this.pack();
       this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource() == button){

           System.out.println("Welcome " + textField.getText());
        
           button.setEnabled(false);
           textField.setEditable(false);

        
        
        
        
        }
    }

    
}
