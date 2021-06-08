

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.util.NumberToTextConverter;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	public class maniDriven {

		public ArrayList<String> getData(List<String> testcase) throws IOException {

			ArrayList<String> a = new ArrayList<String>();

			FileInputStream fis = new FileInputStream("K://JAVA SEL//1_2_semster_result.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			int sheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < sheets; i++) {
				if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
					XSSFSheet sheet = workbook.getSheetAt(i);

					Iterator<Row> rows = sheet.iterator();
					Row firstrow = rows.next();
					Iterator<Cell> ce = firstrow.cellIterator();
					int k = 0;
					int coloumn = 0;
					while (ce.hasNext()) {
						Cell value = ce.next();

						if (value.getStringCellValue().equalsIgnoreCase("Name")) {
							coloumn = k;

						}

						k++;
					}

					while (rows.hasNext()) {

						Row r = rows.next();
						
							for(int y=0;y<testcase.size();y++)
							{
								
							if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcase.get(y)))
									{
								
								
								Iterator<Cell> cv = r.cellIterator();
								while (cv.hasNext()) {
									Cell c = cv.next();
									if (c.getCellType() == CellType.STRING) {
										
										a.add(c.getStringCellValue());
										

									} else {
										
										a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

									}
								}
							break;
							}

							}

					}
				}

			}
			return a;

		}
	}

		