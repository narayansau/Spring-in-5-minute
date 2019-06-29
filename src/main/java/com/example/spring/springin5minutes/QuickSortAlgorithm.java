package com.example.spring.springin5minutes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements  SortAlgorithm{

    public int [] sorts(int[] numbers) {
        return numbers;
    }
}
