const args = process.argv.slice(2);

if (args.length !== 1){
    console.error("Usage: node primeCheck.js <number>");
    process.exit(1);
}
const num = parseInt(args[0], 10);

if(isNaN(num) || num < 2){
    console.error("Please enter a valid integer greater than or equal to 2.");
    process.exit(1);
}

function isPrime(n){
    if(n < 2) return false;
    if(n === 2) return true; // 2 is the smallest prime number
    if(n % 2 === 0) return false; // Even numbers >2 are not prime
    for(let i = 3; i * i <= n; i += 2){
        if (n % i === 0) return false;
    }
    return true;
}

if(isPrime(num)){
    console.log(`${num} is a Prime Number.`);
}else{
    console.log(`${num} is NOT a Prime Number.`);
}
