/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import lthdt.chuong3.coffeelogic.Product;
import lthdt.chuong3.coffeelogic.ProductCompByName;
import lthdt.chuong3.coffeelogic.ProductCompByPrice;

/**
 *
 * @author vuhuy
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tao mang cac san pham
        Product[] sp = new Product[]{new Product("Sunsilk", 12),  
                                  new Product("Lifeboy" ,5),
                                  new Product("Sunsilk", 8),
                                  new Product("Esprsso", 2),
                                  new Product("Thien Long" ,1)};
        System.out.println("Mang ban dau la ");
        System.out.println(Arrays.toString(sp));
//        Product temp;
//          for (int i = 0; i< sp.length; i++)
//              for (int j = i + 1; j< sp.length; j++)
//          if(sp[i].getPrice()>sp[j].getPrice()){
//              temp = sp[i];
//              sp[i]=sp[j];
//              sp[j]=temp;
//          }
//        Arrays.sort(sp, new ProductCompByPrice());
//        System.out.println("Mang sap xep tang dan theo gia ca ");
//        System.out.println(Arrays.toString(sp));
        System.out.println("Mang sap xep ten san pham ");
        Arrays.sort(sp , new ProductCompByName());
        System.out.println(Arrays.toString(sp));
        
        int index = Arrays.binarySearch(sp, new Product("Sunsilk", 12),
                new ProductCompByName());
        if (index < 0){
           System.out.println("Khong tim thay");
        }else{
           System.out.println("Phan th thu " + index + " chua gia tri can tim");
            System.out.println(sp[index]);
        }
    }   
}
