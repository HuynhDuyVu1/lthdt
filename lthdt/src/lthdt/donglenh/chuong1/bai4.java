/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

import java.text.ParseException;

/**
 *
 * @author vuhuy
 */
public class bai4 {
     public static void main(String[] args) throws ParseException{
         Shape htron = new Cirde(5, 1, 2);
//         System.out.println("Chu vi cua hinh tron la " + htron.calcPerimeter());
//         System.out.println("Dien tich hinh tron la " + htron.calcArea());
         System.out.println(htron.toString());
         
         Shape hcn = new Rectangle(3, 15, 8, 5);
//         System.out.println("Chu vi cua hinh chu nhat la " + hcn.calcPerimeter());
//         System.out.println("Dien tich hinh chu nhat la " + hcn.calcArea());
         System.out.println(hcn);
     }
    
}
