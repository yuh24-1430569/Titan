package test;

public class Solution {
	public int minJump(int[] array) {
	    array[array.length - 1] = 0;
	    for (int i = array.length - 2; i >= 0; --i) {
	      int min = array.length;
	      for (int j = 1; j <= array[i]; ++i) {
	        if (i + j > array.length - 1) {
	          break;
	        }
	        if (array[i + j] + 1 < min) {
	          min = array[i + j] + 1;
	        }
	      }
	      array[i] = min;
	    }
	    if (array[0] == array.length) {
	      return -1;
	    }
	    return array[0];
	  }
	  public static void main(String[] args) {
		  Solution s = new Solution();
		  s.minJump(new int[] {4,3,1,3,2,1,0,4});
	  }
	}
