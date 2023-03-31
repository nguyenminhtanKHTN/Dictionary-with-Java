import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.regex.PatternSyntaxException;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class main extends JPanel
                    implements ActionListener{

    public main() throws IOException{
        //Main Jpanel layout
        setLayout(new BorderLayout());
        // ----------------------------------------------- 
        


        //JPanel in top BorderLayout include 2 Jpanels
        JPanel headerJPanel = new JPanel();
        headerJPanel.setLayout(new BoxLayout(headerJPanel, BoxLayout.Y_AXIS));;
        //

        //Child 1 of headerJPanel include JLabel "Tu dien Anh Viet"
        JPanel headerJPanel_Child1 = new JPanel();
        //Set layout
        headerJPanel_Child1.setLayout(new BoxLayout(headerJPanel_Child1, BoxLayout.X_AXIS));

        //JLabel "Tu dien Anh Viet"
        JLabel label_headerJPanel_Child1 = new JLabel("Tu dien Anh Viet");
        //Add to headerJPanel_Child1
        headerJPanel_Child1.add(label_headerJPanel_Child1);
        //end child 1
        //...............................

        //Child 2 of headerJPanel include ComboBox, TextField, Button
        JPanel headerJPanel_Child2 = new JPanel();
        //Set layout
        headerJPanel_Child2.setLayout(new BoxLayout(headerJPanel_Child2, BoxLayout.X_AXIS));

        //Childs
        JComboBox comboBox_headerJPanel_Child2 = new JComboBox(new String[]{"En-Vi", "Vi-En"});
        JTextField textField_headerJPanel_Child2 = new JTextField();
        JButton button_headerJPanel_Child2 = new JButton("Find");

        //Add childs to headerJPanel_Child2
        headerJPanel_Child2.add(Box.createRigidArea(new Dimension(50,0)));
        headerJPanel_Child2.add(comboBox_headerJPanel_Child2);
        headerJPanel_Child2.add(Box.createRigidArea(new Dimension(10, 0))); //Empty space
        headerJPanel_Child2.add(textField_headerJPanel_Child2);
        headerJPanel_Child2.add(Box.createRigidArea(new Dimension(10, 0))); //Empty space
        headerJPanel_Child2.add(button_headerJPanel_Child2);
        headerJPanel_Child2.add(Box.createRigidArea(new Dimension(50,0)));
        //end child 2
        //................................................................

        //Add to headerJPanel
        headerJPanel.add(headerJPanel_Child1);
        headerJPanel.add(headerJPanel_Child2);
        //end
        // -----------------------------------------------
        // -----------------------------------------------
        // -----------------------------------------------



        


        //Add to mainPanel
        add(headerJPanel, BorderLayout.PAGE_START);
        //end
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    

    private void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Student Management");
        // frame.addWindowListener(new WindowAdapter() {
        //     @Override
        //     public void windowClosing(WindowEvent e) {
        //         try {
        //             Class.save();
        //         } catch (IOException ex) {
        //             throw new RuntimeException(ex);
        //         }
        //     }
        // });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500,50);
        frame.setContentPane(this);

        frame.setSize(700,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new main().createAndShowGUI();
    }
}
