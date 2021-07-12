/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
/**
 *
 * @author Administrator
 */
public class Bubble_sort {
 public static void main(String[] args) throws Exception
            
    {
     BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));   
    
        int a; 
        System.out.println("Jumlah Nama Yang Di Inputkan ;"); 
        a = Integer.parseInt(kata.readLine()); 

       String[] Array; 
       Array = new String[a]; 
       String temp;
       Scanner input = new Scanner (System.in); 
       
        for(int i=0;i<a;i++)
        {
            System.out.print("Nama " +(i+1)+" adalah: ");
            Array[i]=input.next(); 
        }
        
        for(int x=1;x<a;x++)
        { 
            for(int y=0;y<a-x;y++)
            { 
            if(Array[y].compareTo(Array[y+1])>0)
            { 
            temp=Array[y]; 
            Array[y]=Array[y+1];
            Array[y+1]=temp; 
            } 
            } 
        }
        
            System.out.println("");
            System.out.println("Urutannya ");

        for(int i=0;i<a;i++){
        System.out.println((i+1)+". "+ Array[i]);
        }
        
        System.out.println("Jumlah Nama : " + a);
        System.out.println("nama 2 terbawah : " + Array[a-2]);
        System.out.println("nama 2 teratas : " + Array[1]);
}
}
