package com.aks;
public class AppTest {
    public static void main(String[] ards) {
      String results = Test.m1();
      System.out.println(results);
      String[] res = results.split(" ");
      if (res[0].equals("Hello")) {
        System.out.println("Test Passed");
      } else {
        System.out.println("Test Failed");
      }
    }
