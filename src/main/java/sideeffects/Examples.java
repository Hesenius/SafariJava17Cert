package sideeffects;

import java.util.Arrays;

public class Examples {
  public static void main(String[] args) {
    int x = 0;
    System.out.println(x++);
    System.out.println(x);

    System.out.println(x += 10);

    int idx = 0;
    int []nums = {10, 11, 12};
//    nums[++idx] = nums[++idx] + 100;
    nums[++idx] += 100;
    System.out.println(Arrays.toString(nums));
  }
}
