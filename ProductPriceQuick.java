import java.util.Arrays;
public class ProductPriceQuick{
    public static void quickSort(double[] prices, int low, int high){
        if(low < high){
            int partitionIndex = partition(prices, low, high);
            quickSort(prices, low, partitionIndex - 1);
            quickSort(prices, partitionIndex + 1, high);
    }
  }
    public static int partition(double[] prices, int low, int high){
        double pivot = prices[high];
        int i = low - 1;
        for (int j=low;j<high;j++){
            if(prices[j] <= pivot){
                i++;
                swap(prices, i, j);
        }
    }
        swap(prices, i + 1, high);
        return i + 1;
  }
    public static void swap(double[] prices, int i, int j){
        double temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
  }
    public static void main(String[] args){
        double[] productPrices = {799.99, 399.50, 1299.75, 649.99, 499.00};
        quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(productPrices));
    }
}
