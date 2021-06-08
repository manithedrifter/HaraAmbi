import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		maniDriven d=new maniDriven();
		
		 String[] array = {"PRAVEEN.A", "RAMESH.G", "NARESH KUMAR.L", "DINESH KUMAR.L"};
		List<String> list1 = new ArrayList<String>();
	      Collections.addAll(list1, array);
		
		
	
		 
		ArrayList<String> data=d.getData(list1);
		for(int i=0;i<data.size();i++)
		{
		System.out.println(data.get(i));
		
		
		
		}

	}

}
