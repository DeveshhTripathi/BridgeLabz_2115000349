function generateRandomNumbers(){
    let numbers = [];
    
    for(let i = 0; i < 10; i++){
        numbers.push(Math.floor(Math.random() * 900) + 100);
    }
    console.log("Generated numbers:", numbers);

    let firstMax = -Infinity, secondMax = -Infinity;
    let firstMin = Infinity, secondMin = Infinity;

    for(let num of numbers){
        if(num > firstMax){
            secondMax = firstMax;
            firstMax = num;
        }else if (num > secondMax && num !== firstMax){
            secondMax = num;
        }
        if(num < firstMin){
            secondMin = firstMin;
            firstMin = num;
        }else if (num < secondMin && num !== firstMin){
            secondMin = num;
     }
  }
    console.log("Second Largest:", secondMax);
    console.log("Second Smallest:", secondMin);
}
generateRandomNumbers();
