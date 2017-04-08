import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SliderTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea text = new JTextArea();
		text.setText("HELLO WORLD");
		JSlider slider = new JSlider(0,200,100);
		CarShape spr_car = new CarShape(10,10,40);
		JLabel car = new JLabel();
		ShapeIcon obj_car = new ShapeIcon(spr_car,ICON_WIDTH,ICON_HEIGHT);
		car.setIcon(obj_car);
		car.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(),"Slide the bar"));
		panel.add(slider);
		panel.add(car);
		frame.add(panel);
		frame.pack();
		Timer t = new Timer(100,new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{

						spr_car.setSize(slider.getValue());
						car.repaint();
						System.out.println(slider.getValue());
					}
				}
		);
		t.start();
	}

	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
}
