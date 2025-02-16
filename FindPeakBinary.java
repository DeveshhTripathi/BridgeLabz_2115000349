public class FindPeakBinary{
    public static int findPeakElement(int[] arr){
        int left = 0, right = arr.length-1;
        while (left < right){
            int mid = left + (right-left)/2;
            if (arr[mid]>arr[mid+1]) {
                right=mid;
            }else{
                left = mid + 1;
          }
      }
        return left;
 }
   public static void main(String[] args){
        int[] arr = {1, 13, 8, 12, 14, 20};
        int index = findPeakElement(arr);
        System.out.println("Peak element index: " + index);
        System.out.println("Peak element: " + arr[index]);
    }
}
