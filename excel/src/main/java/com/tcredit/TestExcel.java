package com.tcredit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;

/**
 * Hello world!
 */
public class TestExcel<main> {


    public static void main1(String[] args) {
        //定义标题
        String[] title = {"订单号","订单ID","订单状态"};
        //创建excel工作簿
        HSSFWorkbook book = new HSSFWorkbook();
        //创建工作表sheet
        HSSFSheet sheet = book.createSheet();
        //创建第一行
        HSSFRow row = sheet.createRow(0);
        //插入第一行数据的表头
        HSSFCell cell = null;
        for (int i =0;i<title.length;i++){
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
        }

        for (int i =1 ; i<10 ; i++){
            //创建第i行
            HSSFRow hrow = sheet.createRow(i);
            HSSFCell hcell = hrow.createCell(0);
            hcell.setCellValue("订单号："+i);
            hcell = hrow.createCell(1);
            hcell.setCellValue("订单ID："+"；；；；");
            hcell = hrow.createCell(2);
            hcell.setCellValue("订单状态："+"6");
        }

        File file  = new File("excel.xls");
        try {
            file.createNewFile();
            FileOutputStream fos = FileUtils.openOutputStream(file);
            book.write(fos);
//            byte[] bytes =book.getBytes();
//            fos.write(bytes);

            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main2(String[] args) {

        File  file  = new File("aaa/bbb/p2p.txt");
        FileInputStream fis =null;
        byte[] bytes = new byte[1024];
        try {
            fis = FileUtils.openInputStream(file);

            while(fis.read(bytes) !=-1){
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis !=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        File file  = new File("aaa/bbb/bbb.txt");

        String str = "aaaaaaaaaa ";
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream(file,true);
            fos.write(bytes);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
