/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

/**
 *
 * @author vuhuy
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Long lanh day nuoc in troi \n Thanh xay khoi biec non phoi bong vang";
        System.out.println(content);
        
        System.out.println("Vi tri cua ki tu a trong chuoi la: " + content.indexOf("a"));
        System.out.println("Vi tri cua tu nuoc trong chuoi la: " + content.indexOf("nuoc"));
        
        System.out.println("Chuoi mo dau bang cum tu Long: " + content.startsWith("Long"));
        System.out.println("Chuoi ket thuc bang cum tu troi: " + content.startsWith("troi"));
        
        String temp = content.substring(20, 26);
        System.out.println("Chuoi con la:  " + temp );
        
        String[] result = content.split("\n");
        for( int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
        
        for( int i = 0; i< result.length; i++){
            System.out.println(result[i].trim());
        }
        
        temp = content.replace('a', 'z');
        System.out.println(temp);
        
        temp = content.toUpperCase();
        System.out.println(temp);
        temp = content.toLowerCase();
        System.out.println(temp);
        
        temp = "Nguyen";
        if(temp.compareToIgnoreCase("nguyen") == 0){
            System.out.println("2 chuoi bang nhau");
        }else{
            System.out.println("2 chuoi ko bang nhau");
        }
        
        temp = temp.concat(" Van A");
        System.out.println(temp);
        
        for( int i = 0; i< temp.length(); i++){
            System.out.println(temp.charAt(i));
        }
        System.out.println();
        
        temp = "155";
        int n = Integer.parseInt(temp);
        System.out.println("n = " + n);
        
        StringBuilder sb = new StringBuilder();
        sb.append("Long lanh day nuoc in troi\n");
        sb.append("Thanh xay khoi biec non phoi bong vang");
        temp = sb.toString();
        System.out.println(sb);
    }
    
}
