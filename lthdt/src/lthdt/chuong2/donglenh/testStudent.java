/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lthdt.chuong2.employeelogic.Student;

/**
 *
 * @author vuhuy
 */
public class testStudent {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "12-12-1999";
        Date ngaysinh = df.parse(input);
        Student obj = new Student("Dai hoc Hue", "Xuat Sac", "Nguyen Van A", 1, ngaysinh);
        
        switch(obj.getHocluc()){
            case "Xuat Sac":
                obj.setHocbong(1000);
                break;
            case "Gioi":
                obj.setHocbong(855.5);
                break;
            default:
                obj.setHocbong(0);
                    
        }
        System.out.println(obj);
    }
}
