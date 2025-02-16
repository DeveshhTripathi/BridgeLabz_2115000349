public class RotationPointBinary{
    public static int findRotationPoint(int[] arr){
        int left = 0, right = arr.length - 1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]>arr[right]){
             left = mid + 1;
          }else{
              right = mid;
         }
      }
      return left;
    }
    public static void main(String[] args){
        int[] arr = {7, 8, 9, 11 ,2 ,3 , 4, 6};
        int index = findRotationPoint(arr);
        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }
}
