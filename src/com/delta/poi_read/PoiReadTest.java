package com.delta.poi_read;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PoiReadTest {
    static List<String> lineList = new ArrayList<>();
    static List<String> qiziList = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File("H:\\Users\\wushufeng\\Desktop\\test_poi_read\\chart_setting.xls");
        if (file.exists()) {
            System.out.println("文件存在");
            Workbook workbook = getWorkBook(file);
            System.out.println(workbook.getNumberOfSheets());
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                switch (workbook.getSheetAt(i).getSheetName()) {
                    case "model":
                        break;
                    case "line":
                        addLine(workbook.getSheetAt(i));
                        System.out.println("------------------------------------------");
                        for (String s : lineList) {
                            System.out.println(s);
                        }
                        break;
                    case "qizi":
                        addQizi(workbook.getSheetAt(i));
                        System.out.println("------------------------------------------");
                        for (String s : qiziList) {
                            System.out.println(s);
                        }
                        break;
                    default:
                        break;
                }
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    private static void addQizi(Sheet sheet) {
        //获得当前sheet的开始行
        int firstRowNum = sheet.getFirstRowNum();
        //System.out.println(firstRowNum + "");
        //获得当前sheet的结束行
        int lastRowNum = sheet.getLastRowNum();
        //System.out.println(lastRowNum + "");'


        Row rowTitle = sheet.getRow(firstRowNum);
        int firstCellNum = rowTitle.getFirstCellNum();
        //int lastCellNum = rowTitle.getPhysicalNumberOfCells();
        Cell cell = rowTitle.getCell(firstCellNum);
        if (cell.getStringCellValue().equals("qizi")) {
            System.out.println("qizi");
            for (int i = firstRowNum + 1; i <= lastRowNum; i++) {
                Row row = sheet.getRow(i);
                int firstCellNumContent = row.getFirstCellNum();
                //int lastCellNumContent = row.getPhysicalNumberOfCells();
                Cell cellContent = row.getCell(firstCellNum);
                qiziList.add(cellContent.getStringCellValue());
            }
        }
    }

    private static void addLine(Sheet sheet) {
        //获得当前sheet的开始行
        int firstRowNum = sheet.getFirstRowNum();
        //System.out.println(firstRowNum + "");
        //获得当前sheet的结束行
        int lastRowNum = sheet.getLastRowNum();
        //System.out.println(lastRowNum + "");'


        Row rowTitle = sheet.getRow(firstRowNum);
        int firstCellNum = rowTitle.getFirstCellNum();
        //int lastCellNum = rowTitle.getPhysicalNumberOfCells();
        Cell cell = rowTitle.getCell(firstCellNum);
        if (cell.getStringCellValue().equals("line")) {
            System.out.println("line");
            for (int i = firstRowNum + 1; i <= lastRowNum; i++) {
                Row row = sheet.getRow(i);
                int firstCellNumContent = row.getFirstCellNum();
                //int lastCellNumContent = row.getPhysicalNumberOfCells();
                Cell cellContent = row.getCell(firstCellNumContent);
                lineList.add(cellContent.getStringCellValue());
            }
        }
    }

    public static Workbook getWorkBook(File file) {
        //获得文件名
        String fileName = file.getName();
        //创建Workbook工作薄对象，表示整个excel
        Workbook workbook = null;
        try {
            //获取excel文件的io流
            FileInputStream is = new FileInputStream(file);
            //根据文件后缀名不同(xls和xlsx)获得不同的Workbook实现类对象
            if (fileName.endsWith("xls")) {
                //2003
                workbook = new HSSFWorkbook(is);
                System.out.println("xls");
            } else if (fileName.endsWith("xlsx")) {
                //2007
                workbook = new XSSFWorkbook(is);
                System.out.println("xlsx");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return workbook;
    }

}
