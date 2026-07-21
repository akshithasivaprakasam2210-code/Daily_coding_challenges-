class FindNumberWithEvenNumberOfTheDigit{
    public int findNumbers(int[] nums) {
        int count =0;
        for (int b:nums){
            int c = 0 ;
            int n =b;
            while (n>0){
                int r = n%2;
                c +=1;
                n /=10;
            }
            if (c%2==0){
                count+=1;
            }
        }
        return count;
    }
}