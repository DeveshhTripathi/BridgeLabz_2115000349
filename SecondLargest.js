function generateRandomNumbers(){
    let numbers = [];

    for(let i = 0; i < 10; i++){
        numbers.push(Math.floor(Math.random() * 900) + 100);
    }
    console.log("Generated numbers:", numbers);

    numbers.sort((a, b) => a - b);

    console.log("Sorted numbers:", numbers);
    
    let secondSmallest = numbers[1];
    let secondLargest = numbers[numbers.length - 2];

    console.log("Second Smallest:", secondSmallest);
    console.log("Second Largest:", secondLargest);
}
generateRandomNumbers();
