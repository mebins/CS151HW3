import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainView extends JFrame implements ChangeListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DataModel dataModel;
	private JButton addButton;
	private JTextArea texts;
	private ArrayList<String> lines;
	private JTextField field;
	
	public MainView(DataModel dataModel) 
	{
		this.setLayout(new BorderLayout());
		this.dataModel = dataModel;
		texts = new JTextArea();
		lines = dataModel.getData();
		field = new JTextField();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						dataModel.add(field.getText());
						update();
						
					}
		
				});
		String line = new String();
		for(String s: lines)
		{
			line+= s +"\n";
		}
		texts.setText(line);
		
		this.add(addButton,BorderLayout.NORTH);
		this.add(texts,BorderLayout.CENTER);
		this.add(field,BorderLayout.SOUTH);
		this.pack();
	}
	public void update()
	{
		lines = dataModel.getData();
		String line = new String();
		for(String s: lines)
		{
			line+= s +"\n";
		}
		texts.setText(line);
		this.pack();
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		update();	
	}

}
