class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false ;

        }
        int m = matrix.length ,
          n = matrix[0].length ;
        int start = 0,
          end = m*n-1;

          while(start<=end){
            int mid = start + (end-start) /2 ;
            int r = mid/n ,
             c = mid%n ;

             int val = matrix[r][c];

             if(val == target ){
                return true ;

             }else if(val<target){
                start = mid+1 ;
             }else{
                end = mid-1 ;
          }
          }
          return false ;

    }
}