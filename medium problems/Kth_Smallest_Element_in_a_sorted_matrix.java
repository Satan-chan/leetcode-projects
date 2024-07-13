class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] numbers = new int[matrix.length * matrix[0].length];
        int index=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                numbers[index++]=matrix[i][j];
            }
        }
         Arrays.sort(numbers);
         return numbers[k-1];
    }
}
