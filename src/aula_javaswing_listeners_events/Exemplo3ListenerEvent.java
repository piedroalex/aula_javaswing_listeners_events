package aula_javaswing_listeners_events;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Exemplo3ListenerEvent {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo 3 Event e Listener");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel("Digite:");
        JTextField textField1 = new JTextField(5);

        DefaultListModel<String> listaModel = new DefaultListModel<>();
        JList<String> listaTextos = new JList<>(listaModel);

        // Adicionar KeyListener para eventos de teclado
        textField1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Este método é chamado quando uma tecla é digitada (pressionada e solta)
                listaModel.addElement("Tecla digitada: " + e.getKeyChar());
                textField1.setText("");
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        JScrollPane scrollPane = new JScrollPane(listaTextos);
        
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(label1);
        frame.getContentPane().add(textField1);
        frame.getContentPane().add(scrollPane);

        frame.setVisible(true);
    }
}
