public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1,4,5,0,0,0};
        int m = 3;
        int[] nums2 = {2,3,7};
        int n = 3;

        merge(nums1, m, nums2, n);
        for(int i : nums1){
            System.out.println(i);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while(j < n-1){
            if(nums2[j] < nums1[i]){
                for(int k = nums1.length-1; k > i; k--){
                    nums1[k] = nums1[k-1];
                }
                nums1[i] = nums2[j];
                j++;
            }
            else{
                i++;
            }
        }
//        if(j<nums2.length){
//            nums1[i++]=nums2[j++];
//        }

    }
}