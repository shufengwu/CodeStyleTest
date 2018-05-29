package com.delta.jxl;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        //writeExcel();
        try {
            writeToExcel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeToExcel() throws Exception {
        //创建工作簿
        XSSFWorkbook workbook = new XSSFWorkbook();
        //创建工作表
        XSSFSheet sheet = workbook.createSheet();

        //创建行
        XSSFRow row = sheet.createRow(2);
        //创建单元格,操作第三行第三列
        XSSFCell cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("hellword");
        //
        FileOutputStream outputStream = new FileOutputStream(new File("test.xlsx"));
        workbook.write(outputStream);
        //关闭工作簿
        workbook.close();
    }
}
