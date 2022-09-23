public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while(i < m || j < n){
            if(nums2[j] < nums1[i]){
                for(int k = i+1; k < nums1.length-1; k++){
                    nums1[k] = nums1[k+1];
                }
                nums1[i] = nums2[j];
                j++;
            }
            else{
                i++;
            }
        }

    }
}