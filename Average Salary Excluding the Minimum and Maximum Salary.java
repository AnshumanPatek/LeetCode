class Solution {
    public double average(int[] salary) {
           double res=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int a:salary){
            if(a>max){
                max = a;
            }
            if(a<min){
                min = a;
            }
        }
        int count=0;
        for(int a: salary){
            if(a!=max && a!=min){
                res+=a;
                count++;
            }
        }
        return res/count;
        
    }
}
