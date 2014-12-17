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
class SequentialSearch {
    
    public void search(Comparable[] list , Object key){
        
        for(int k=0 ; k<list.length ; k++){
            
            if(list[k] == key){
                System.out.println("The Key has been found at element number " + k);
                return;
            }
        }
        System.out.println("Not found");
    }
}
