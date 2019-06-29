package com.example.spring.springin5minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sun.awt.windows.ThemeReader;

@SpringBootApplication
public class SpringIn5MinutesApplication{

    public static void main(String[] args) {


       // SomeSearchImpl searchImpl = context.getBean( SomeSearchImpl.class );
       // searchImpl.binarySearch( new int[] { 1,2, 5, 8, 9}, 7);
         boolean found;
       // BinarySearchImpl binarySearch = new BinarySearchImpl( new BubbleSortAlgorithm() );
      // found=  binarySearch.binarySearch( new int[] { 1,2, 5, 8, 9}, 7 );

        ApplicationContext context =
                SpringApplication.run( SpringIn5MinutesApplication.class, args );
        BinarySearchImpl binarySearchImp1 = context.getBean( BinarySearchImpl.class );
        found=  binarySearchImp1.binarySearch( new int[] { 1,2, 5, 8, 9}, 7 );
        System.out.println( "ThemeR eader Result is : " + found );
    }

}
