class Solution {
    public int subtractProductAndSum(int n) {
        
        int temp = n;
  int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            ++count;
        }
        int sum =0;
        int mul =1;
        int check = n;
        for(int i = 0;i<count;i++){
            sum = sum + (check%10);
            check = check /10;
            mul = mul * (n%10);
            n =n/10;

        }
        int result = mul-sum;
        return result;


    }
}
