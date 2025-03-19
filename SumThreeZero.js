function findTriplets(arr){
    let triplets = [];
    let n = arr.length;

    arr.sort((a, b) => a - b);

    for(let i = 0; i < n - 2; i++){
        if(i > 0 && arr[i] === arr[i - 1]) continue;

        let left = i + 1, right = n - 1;
        
        while(left < right){
            let sum = arr[i] + arr[left] + arr[right];

            if(sum === 0){
                triplets.push([arr[i], arr[left], arr[right]]);
                
                while(left < right && arr[left] === arr[left + 1]) left++;
                while(left < right && arr[right] === arr[right - 1]) right--;
                
                left++;
                right--;
            }else if(sum < 0){
                left++;
            }else{
                right--;
      }
   }
 }
    return triplets;
}
let numbers = [-1, 0, 1, 2, -1, -4];
console.log("Triplets with sum zero:", findTriplets(numbers));
