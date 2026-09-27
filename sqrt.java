class Sqrt {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int start=1;
        int end=x;
        int answer=0;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(mid<=x/mid){
                answer=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return answer;
    }
} 
    

