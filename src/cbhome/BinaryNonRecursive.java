/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cbhome;

/**
 *
 * @author Administrator
 */
class BinaryNonRecursive {
    
    
    public int search(Integer[] list , Integer key , Integer start , Integer end){
       
               
        boolean found = false;
        int mid = -1;
        
        while((start<end) && (found==false)){
            
            mid = (start+end)/2;
            if(list[mid] == key){
                
                found = true;
            }
            else if(list[mid] < key){
                
                start = mid +1;
            }
            else{
                end = mid -1;
            }            
        }
        if(found==true){
            return mid;
        }
        else return -1;        
    }
}
