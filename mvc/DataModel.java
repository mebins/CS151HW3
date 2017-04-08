import java.util.ArrayList;

public class DataModel {

	public ArrayList<String> lines = new ArrayList<>();
	
	@SuppressWarnings("unchecked")
	public ArrayList<String> getData()
	{
		return (ArrayList<String>)(lines.clone());
	}
	public void add(String s)
	{
		if(!s.isEmpty()) lines.add(s);
	}
}
