import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JTextArea textArea;
    JMenuItem blueItem;
    JMenuItem greenItem;
    JMenuItem redItem;
    JMenuItem timesNewRomanItem;
    JMenuItem arialItem;
    JMenuItem calibriItem;

    Frame() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fontMenu = new JMenu("Font");
        JMenu colorMenu = new JMenu("Color");

        timesNewRomanItem = new JMenuItem("Times New Roman");
        arialItem = new JMenuItem("Arial");
        calibriItem = new JMenuItem("Calibri");

        blueItem = new JMenuItem("Blue");
        redItem = new JMenuItem("Red");
        greenItem = new JMenuItem("Green");

        timesNewRomanItem.addActionListener(this);
        arialItem.addActionListener(this);
        calibriItem.addActionListener(this);

        blueItem.addActionListener(this);
        greenItem.addActionListener(this);
        redItem.addActionListener(this);
        fontMenu.add(timesNewRomanItem);
        fontMenu.add(arialItem);
        fontMenu.add(calibriItem);

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(greenItem);

        menuBar.add(fontMenu);
        menuBar.add(colorMenu);


        this.setJMenuBar(menuBar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(500,500);

        // TextArea
        textArea = new JTextArea(8,10);
//        textArea.setBackground(Color.black);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(textArea);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Font font = textArea.getFont();
        if (e.getSource()==blueItem) {
            textArea.setForeground(Color.blue);
        }
        if (e.getSource()==redItem) {
            textArea.setForeground(Color.red);
        }
        if (e.getSource()==greenItem) {
            textArea.setForeground(Color.green);
        }
        if (e.getSource()==timesNewRomanItem) {
            font = new Font("TimesRoman", Font.PLAIN, 16);
        }
        if (e.getSource()==arialItem) {
            font = new Font("Arial", Font.PLAIN, 16);
        }
        if (e.getSource()==calibriItem) {
            font = new Font("Calibri", Font.PLAIN, 16);
        }
        textArea.setFont(font);
    }
    public static void main(String[]args)
    {
        new Frame();
    }
}
