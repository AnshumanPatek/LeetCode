class Solution {
    public boolean isSameAfterReversals(int num) {
          int n=num;
        int reverse=0;
        while(num!=0)
        {
            int l=num%10;
            num/=10;
            reverse*=10;
            reverse+=l;
        }
        int reverse1=0;
        while(reverse!=0)
        {
            int ll=reverse%10;
            reverse/=10;
            reverse1*=10;
             reverse1+=ll;
        }
        if(reverse1==n)
        {
            return true;
        }
        return false;
    }
}
