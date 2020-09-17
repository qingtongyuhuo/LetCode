package zn.zyl.findMedianSortedArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 第四题 寻找两个正序数组的中位数
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int first = -1;
        int second = -1;
        if( (nums1.length + nums2.length)%2 == 1 ){
            first = (nums1.length + nums2.length)/2 + 1;
            second = first;
        }else{
            first = (nums1.length + nums2.length)/2;
            second = first + 1;
        }
        int flag1 = 0;
        int flag2 = 0;
        int mid = 0;
        for(int i = 0,length =  nums1.length + nums2.length; i<length ; i++){
            int now;
              if(nums1.length == flag1){
                  now = nums2[flag2++];
              }else if(nums2.length == flag2){
                  now = nums1[flag1 ++];
              }else{
                  if(nums1[flag1] > nums2[flag2]){
                      now = nums2[flag2++];
                  }else{
                      now = nums1[flag1++];
                  }
              }
              if(i+1 == first){
                  mid = now;
              }
              if( i+1 == second){
                  return ( (double)mid + (double) now )/2;
              }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Solution.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(Solution.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        System.out.println(Solution.findMedianSortedArrays(new int[]{1,3}, new int[]{}));
    }
}
