import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

class MyJFrame extends JFrame implements ListSelectionListener{

    private JLabel j2;
    private JList JL1;
    private JTextArea showText;

    String[] city={"台北","台中","嘉義","台南","高雄","屏東"};


    MyJFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("各地名山");
        setBounds(50,50,500,250);
        setLayout(null);

        j2 = new JLabel("找各地名山:");
        add(j2);
        j2.setBounds(100, 50, 100, 20);
        

        JL1 = new JList<String>(city);
        JL1.addListSelectionListener(this);
        JScrollPane JSP = new JScrollPane(JL1);
        add(JL1);
        JL1.setBounds(200, 20, 75, 75);

        JScrollPane jsp1 = new JScrollPane(JL1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp1.setBounds(230,10,50,100);
        add(jsp1);


        showText = new JTextArea("可選取地名..."+"\n");

        JScrollPane jsp2 = new JScrollPane(showText,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp2.setBounds(150,120,150,50);
        add(jsp2);

        setVisible(true);

    }
    

    public void valueChanged(ListSelectionEvent e){
        
        String[] mountain={"雪山","八仙山","阿里山","大凍山","柴山","八卦山"};
              
        String show = "";
        int i;
        for(i=0;i<city.length;i++){

            if(JL1.isSelectedIndex(i)){
                show =city[i] + " 名山："+ mountain[i];
            }
        }
        showText.setText(show);

    }
}

public class hw{
    public static void main(String[] args){
        MyJFrame f1 = new MyJFrame();
    }
}