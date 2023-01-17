class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
             if(isFound(matrix,matrix[i].length-1,target,i))
             {
                 return true;
             }
            
        }
        return false;
        
    }
    public boolean isFound(int [][] arr,  int end, int target,int row)
    {
        int start = 0;
        int mid;
        while(start<=end)
        {
             mid = (start+end)/2;
            if(arr[row][mid]> target)
            {
                end = mid-1;
            }else  if(arr[row][mid]< target)
            {
                start = mid+1;
            }
            else{
                return true;
            }
            
        }
        return false;

        
    }
}