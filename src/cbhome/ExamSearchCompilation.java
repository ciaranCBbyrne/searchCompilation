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
public class ExamSearchCompilation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NanoTimer timer = new NanoTimer();
        
        int key = 67;
        
        timer.reset();
        timer.start();
        Integer[] array = new Integer[]{3,23,12,2,96,46,34,62,67,66,89,80,34,23,1};
        SequentialSearch line = new SequentialSearch();
        line.search(array , key); 
        timer.stop();
        timer.print();
        
        int indexOf = -1;
        
        Integer[] sortedList = new Integer[]{2,4,5,6,13,16,18,33,36,41,49,55,56,67,69,82,88};
        timer.reset();
        timer.start();
        SequentialOrdered seqord = new SequentialOrdered();
        seqord.search(sortedList, key);
        timer.stop();
        timer.print();
        
        timer.reset();
        timer.start();
        BinaryNonRecursive nonrec = new BinaryNonRecursive();
        indexOf = nonrec.search(sortedList, key ,0, sortedList.length);
        if(indexOf > 0) System.out.println("Key: " + key + ", found at position " + indexOf);
        timer.stop();
        timer.print();
        
        timer.reset();
        timer.start();
        BinaryRecursive rec = new BinaryRecursive();
        indexOf = rec.search(sortedList, key, 0, sortedList.length);
        if(indexOf > 0) System.out.println("Key: " + key + ", found at position " + indexOf);
        timer.stop();
        timer.print();
    }
    
}
