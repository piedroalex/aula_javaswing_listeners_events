package aula_javaswing_listeners_events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Exemplo2ListenerEvent {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo 2 Event e Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        DefaultListModel<String> listaModel = new DefaultListModel<>();
        JList<String> listaTextos = new JList<>(listaModel);

        JButton btnCadastrar = new JButton("Adicionar");
        JTextField jTextField = new JTextField(20);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = jTextField.getText();
                if (!texto.isEmpty()) {
                    listaModel.addElement(texto);
                } else {
                    JOptionPane.showMessageDialog(frame, "Insira um texto!");
                }
            }
        });
        
        jTextField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {}
			
			@Override
			public void focusGained(FocusEvent e) {
                jTextField.setText("");
            }
		});
        
        JScrollPane scrollPane = new JScrollPane(listaTextos);
        	
        JPanel panel = new JPanel();
        panel.add(new JLabel("Texto:"));
        panel.add(jTextField);
        panel.add(btnCadastrar);

        frame.getContentPane().add(panel, "North");
        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }

}
