package com.yubraj.algorithm.sorting;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class QuickSort {
  public static void quicksort(int[] arr){
    quicksort(arr, 0, arr.length-1);
  }

  public static void quicksort(int[] arr, int left, int right){
    if(left >= right){
      return;
    }
    int pivot = arr[(left + right) / 2];
    int index = partition(arr, left, right, pivot);
    quicksort(arr, left, index-1);
    quicksort(arr, index, right);
  }

  public static int partition(int[] arr, int left, int right, int pivot){
    System.out.println("Partition Starts *********************************************");
    System.out.println("Input Array : " + Arrays.toString(arr));
    System.out.format("Partition called left : %s, right : %s and pivot: %s", left, right, pivot);
    System.out.println();
    while (left <= right){
      while(arr[left] < pivot){
        left++;
      }
      while (arr[right] > pivot){
        right--;
      }

      if(left <= right){
        swap(arr, left, right);
        left++;
        right--;
      }
    }
    System.out.println("returning partition : " + left);
    System.out.println("Partition Ends *********************************************\n");
    return left;
  }

  public static void swap(int[] arr, int left, int right){
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{9,2,6,4,3,5,1};
    quicksort(arr);
    Arrays.stream(arr).forEach(System.out::println);
  }

}
