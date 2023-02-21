class Solution {
    public int reverse(int x) {

        int count = 0;
        int n =x;
        while (n != 0) {
            n = n / 10;
            ++count;
        }

        int store = Integer.MAX_VALUE/10;
        int store2 = Integer.MIN_VALUE/10;
        int num = x;
        int rev =0;
        int check = 0;
        for(int i = 0;i<count;i++ ){
            check = num%10;
            if(rev== store&&check>7 ){
                    return 0;
                }
            if(rev>store){
                return 0;
            }
            if(rev<store2 ||rev ==store2&&check<-8){
                return 0;
            }
            num = num/10;
            rev = (10*rev)+check;


        }
     
        return rev;
    }
}
