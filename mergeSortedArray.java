public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[]=new int[m+n];
        for(int i=0;i<m;i++){
            if(nums1[i]!=0){
                res[i]=nums1[i];
            }
                
        }
        int e=0;
        for(int i=m;i<(m+n);i++){
            res[i]=nums2[e];
            e++;
        }
        boolean swap;
        for(int i=0;i<(m+n)-1;i++){
            swap=false;
            for(int j=0;j<(m+n)-i-1;j++){
                if(res[j]>res[j+1]){
                    int temp=res[j];
                    res[j]=res[j+1];
                    res[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = res[i];
        }
        
    }
} 
    

