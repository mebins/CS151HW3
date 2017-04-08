import javax.swing.JFrame;

public class MVCTester {
	
	public JFrame frame;
	
	public static void main(String[] args)
	{
		DataModel dataModel = new DataModel();
		new MainView(dataModel);
	}
	
	
	
	

}
