package com.yubraj.problems;

import java.util.Arrays;

public class AddOneAtEnd {
  public static void main(String[] args) {
    int[] arr = new int[]{1,9,9,9};
    System.out.println(Arrays.toString(addOneAtEnd(arr)));
  }

  public static int[] addOneAtEnd(int[] arr){
    int carry = 1;
    int result[] = new int[arr.length];

    for (int i = arr.length - 1; i>=0; i--){
      int sum = arr[i] + carry;
      if(sum == 10)
        carry = 1;
      else
        carry = 0;

      result[i] = sum %10;
    }

    if(carry == 1){
      int[] newResult = new int[arr.length + 1];
      for (int i = 0; i < result.length - 1; i++) {
        newResult[i+1] = result[i];
      }
      newResult[0] = 1;
      return newResult;
    }else
      return result;

  }

}
