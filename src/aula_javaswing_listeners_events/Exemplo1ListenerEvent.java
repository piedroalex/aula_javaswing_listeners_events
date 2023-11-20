package aula_javaswing_listeners_events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Pedro Alex
 */
public class Exemplo1ListenerEvent {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo 1 Event e Listener");
		JButton button = new JButton("Clique-me");

		// Adiciona um ActionListener ao botão
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicado!");
			}
		});

		frame.getContentPane().add(button);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
