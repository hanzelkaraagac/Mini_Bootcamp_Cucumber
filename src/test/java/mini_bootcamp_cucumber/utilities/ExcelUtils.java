package mini_bootcamp_cucumber.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {
    private Workbook workbook;
    private Sheet sheet;
    private String path;

    /**Excel path'ine ve Excel'deki sayfaya ulaşmak için 2 parametreli cons. oluşturduk
     *
     * @param path okunacak excell dosyasinin yolu
     * @param sheetName excell icindeki sayfanin adi
     */
    public ExcelUtils(String path, String sheetName){
        this.path = path;
        try {
            FileInputStream fis = new FileInputStream(path);  //bir dosyayi okumak icin fis objesi olusturur
            workbook = WorkbookFactory.create(fis); //Apache POI kütüphanesini kullanarak bir Excel çalışma kitabı (Workbook) oluşturur
            sheet = workbook.getSheet(sheetName); //Apache POI kütüphanesini kullanarak Excel dosyasındaki belirli bir sayfayı (sheet) alir
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**Excell dosyasinda satir ve sutun numarasi verilen hucredeki veriyi return eder
     * @param rowNum satir numarasi
     * @param colNum sutun numarasi
     * @return
     */
    public String getCellData(int rowNum,int colNum){
        Cell cell = sheet.getRow(rowNum).getCell(colNum);
        return cell.toString();
    }


    /**Exceldeki satir sayisini return eder
     * @return
     */
    public int rowCount(){
        return  sheet.getLastRowNum();
    }

    /** Exceldeki sütun sayisini return eder
     * @return
     */
    public int columnCount(){
        return sheet.getRow(0).getLastCellNum();
    }
    //

    /**Exceldeki dataları başlık olmadan alabilmek için 2 boyutlu bir array yapar
     * @return
     */
    public String[][] getDataArray() {
        String[][] data = new String[rowCount()][columnCount()];
        for (int i = 1; i <=rowCount() ; i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i,j);
                data[i-1][j]=value;
            }
        }
        return data;
    }

    /**Excell dosyasinda sutun ismini verir
     * @return
     */
    public List<String> getColumnsNames() {
        List<String> columns = new ArrayList<>();
        for (Cell cell : sheet.getRow(0)) {
            columns.add(cell.toString());
        }
        return columns;
    }


    /**Deger, Satir, Sutun girindiginde, verilen satır ve sutuna girilen degeri ekler
     * @param value girilmesi gereken deger
     * @param rowNum satir numarasi
     * @param colNum sutun numarasi
     */
    public void setCellData(String value, int rowNum, int colNum) {
        try {
            sheet.getRow(rowNum).createCell(colNum).setCellValue(value);
            FileOutputStream fos = new FileOutputStream(path);
            workbook.write(fos);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**Deger, Satir, Sutun girindiginde, verilen satır ve sutuna girilen degeri ekler
     * @param value girilmesi gereken deger
     * @param row satir numarasi
     * @param columnName sutun ismini
     */
    public void setCellData(String value, String columnName, int row) {
        int column = getColumnsNames().indexOf(columnName);
        setCellData(value, row, column);
    }
}