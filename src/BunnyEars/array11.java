/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BunnyEars;

/**
 *
 * @author ajdy5510
 */
public class array11 {
    
public int solve(int[] nums, int index) {

  if (index >= nums.length) return 0;

  if (nums[index] == 11) return 1 + solve(nums,index+1);

  else return solve(nums,index+1);

}
}
