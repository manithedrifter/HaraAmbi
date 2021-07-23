import java.io.IOException;
import java.util.ArrayList;


public class tesDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				ExcelDriven d=new ExcelDriven();
				
				String b="VIGNESH.R";
				
				ArrayList<String> data=d.getData(b);
				for(int i=0;i<data.size();i++)
				{
				System.out.println(data.get(i));
				
				
				}

	}

}
