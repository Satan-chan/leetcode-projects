class Solution  {
   
    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public boolean digit(int n){
        if(n<10)
            return true;
        else
            return false;
    }
    public boolean isHappy(int n) {
       if(digit(n*n)){
            if(n==1)
                return true;

            else
                return false;
       }
       
       else {
            if(n%4==0&&)
                return false;
            else {
                int x = getNext(n);
                return isHappy(x);
            }
       }
            
    }

   
}
