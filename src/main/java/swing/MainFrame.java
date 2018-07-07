package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private DetailsPanel detailsPanel;
	public MainFrame(String title) {
		super(title);
		
		// Set layout manager
		setLayout(new BorderLayout());
		
		final JTextArea textArea = new JTextArea();
		JButton button = new JButton("Click me!");
		
		detailsPanel = new DetailsPanel();
		
		detailsPanel.addDetailsListener(new DetailListener() {
			public void detailEventOccured(DetailEvent event) {
				textArea.append(event.getText());
			}
		});
		
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);
		c.add(detailsPanel, BorderLayout.WEST);
		
		
//		button.addActionListener(new ActionListener() {
//
//			public void actionPerformed(ActionEvent e) {
//				textArea.append("niggaaaa");
//			}
//			
//		});
	}
}
