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
class BinaryRecursive {
    
    public int search(Integer[] list, int key, int start, int end){
        
        int mid = (start+end)/2;
        int result;
        
        if(start > end){
            result = -1;
        }
        else if(list[mid] == key){
            result = mid;
        }
        else if(list[mid] > key){
            result = search(list, key , start, mid-1);
        }
        else
            result = search(list, key, mid+1, end);
        
        return result;
    }
}
