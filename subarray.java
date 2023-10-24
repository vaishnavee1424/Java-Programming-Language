import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int count=0;
        int[]array=new int [5];
          for(int i=0;i<array.length;i++){
              if(sc.hasNextInt()){
                  array[i]=sc.nextInt();
              }
          }
       
        for( int i=0; i<array.length;i++){
              if(array[i]<0){ 
                  count=count+1;
              }
          }
        
          
              for( int i=0; i<array.length;i++){
              sum=sum+array[i];
              if(sum<0){ 
                  count=count+1;
              }
              
              }
          
          for( int i=2; i<array.length;i++){
              sum=array[i-2]+array[i-1]+array[i];
              if(sum<0){ 
                  count=count+1;
              }
          }
          
          for( int i=3; i<array.length;i++){
              sum=array[i-3]+array[i-2]+array[i-1]+array[i];
              if(sum<0){ 
                  count=count+1;
              }
          }
           for( int i=4; i<array.length;i++){
              sum=array[i-4]+array[i-3]+array[i-2]+array[i-1]+array[i];
              if(sum<0){ 
                  count=count+1;
              }
          }
          
     System.out.println(count);
    }
    
}
