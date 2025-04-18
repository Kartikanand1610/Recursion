package org.recursion.subsquences;

import java.util.ArrayList;
import java.util.List;

public class Subsquences {
    public void Printsubsquences(int a[]){
        List<Integer>current=new ArrayList<>();
        generateSubsequences(0,a,current);
    }
    public void generateSubsequences(int i,int arr[],List<Integer> current){
        if (i==arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[i]);
        generateSubsequences(i + 1, arr, current);

        // Backtrack and exclude the current element
        current.remove(current.size() - 1);
        generateSubsequences(i + 1, arr, current);
    }
}
