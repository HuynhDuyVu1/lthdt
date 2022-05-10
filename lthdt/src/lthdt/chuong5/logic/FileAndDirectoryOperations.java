/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong5.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vuhuy
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    //Thao tac 1: Liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDiractoryContent(String folder){
    File directory = new File(folder);
    if(directory.isFile())
        return  null;
    File[] results = directory.listFiles();
    return  results;
    }
    public  String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i <content.length;i++){
        sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
        sb.append("\n");
        }
        return  sb.toString();
    }
    
    public File[] getSubDirectories(File[] content){
         ArrayList<File> result = new ArrayList<>();
         for(int i = 0;i <content.length;i++){
             if(content[i].isDirectory()){
            result.add(content[i]);
         }
    }
         File[]  ketqua = new File[result.size()];
         return result.toArray(ketqua);
    }
    
    public File[] getFiles(File[]content){
            ArrayList<File> result = new ArrayList<>();
         for(int i = 0;i <content.length;i++){
             if(content[i].isFile()){
            result.add(content[i]);
         }
    }
         File[]  ketqua = new File[result.size()];
         return result.toArray(ketqua);
    }
    
    public void getContentRecursively(String folder){
    File content = new File(folder);
    
    if (content.isFile()){
        System.out.println(content.getPath() + File.separator + content.getName());
        return;
    }
    
        System.out.println("Thu muc: " + folder);
        File[] sub = content.listFiles();
        for(int i = 0;i <sub.length;i++){
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
    }
    public String readTextFile(String filename){
       StringBuilder content = new StringBuilder();
       
        
        try {
            
            FileReader fr = new FileReader(filename);
            
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
            }
            
            br.close();
            fr.close();
            
        } catch (FileNotFoundException ex) {
            return "Khong tim thay file " + filename;
        } catch (IOException ex) {
            return "Khong the doc file " + filename;
        }
        
        return content.toString();
    }
    public boolean writeTextFile(String filename, String content){
    boolean flag = true;
    
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(content);
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        return flag;
    }
}
