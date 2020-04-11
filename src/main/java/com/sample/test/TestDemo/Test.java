package com.sample.test.TestDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String>  strsList= new ArrayList<String>();

        strsList.add("vasantha");
        strsList.add("vamsi");

       List<String>  vasaList = strsList.stream().filter(name -> name.equals("vasantha")).map(String::toUpperCase)
               .collect(Collectors.toList());
       vasaList.forEach(name -> System.out.println(name));

    }

}
