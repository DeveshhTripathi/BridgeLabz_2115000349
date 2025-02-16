public class FirstNegativeLinear{
	public int linearSearch(int[] num){
          int index=-1;
         for(int i=0;i<num.length;i++){
          if(num[i]<0){
             index=i;
         }
     }
	return index;
}
	public static void main(String args[]){
	int[] num = {4,5,7,1,-3,5,6};
	FirstNegativeLinear obj = new FirstNegativeLinear();
	int res = obj.linearSearch(num);
	if(res>0){
	System.out.println("The index of the first negative number is : " +res);
	}else{
		System.out.println("NO negative number found in array.");
	}
	}
}
