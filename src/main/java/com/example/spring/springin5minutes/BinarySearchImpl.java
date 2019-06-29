package com.example.spring.springin5minutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BinarySearchImpl{

    @Autowired
   private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm=sortAlgorithm;
    }

    // SOting an array
    // Searching an array
    // Return the result

    public boolean binarySearch ( int[] numbers , int noToSearch) {

       // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortenumbers = sortAlgorithm.sorts( numbers );
        System.out.println( sortAlgorithm );
        for( int i =0 ; i < sortenumbers.length ; i++)
        System.out.print(  sortenumbers[i]+" , " );

        return  true;
    }

}
