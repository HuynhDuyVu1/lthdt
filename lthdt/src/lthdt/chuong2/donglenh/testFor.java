/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.donglenh;

import java.util.Random;

/**
 *
 * @author vuhuy
 */
public class testFor {
    public static void main(String[] args) {
        //tinh tong thu nhat
        int n = 100;
        double s = 0;
        for(int i = 1; i <= n ; i++){
        s = s + (double)1/i;
        }
        System.out.println("Tong thu nhat " + s);
        
        //tinh tong thu 2
         n= 99;
         int s2 = 0;
         for(int i = 1; i <= n ; i +=2 ){
            s2 = s2 + i;
         }
        System.out.println("Tong thu hai " + s2);
        
        //Sinh ngau nhien n so nguyen
        Random rnd = new Random();
        int x;
        for(int i = 0; i < 10; i++){      
         x = rnd.nextInt(101);
        System.out.println(x);
        }
    }
}
