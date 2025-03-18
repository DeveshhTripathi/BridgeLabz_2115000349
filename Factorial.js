const args = process.argv.slice(2);

if(args.length !== 1){
    console.error("Usage: node factorial.js <number>");
    process.exit(1);
}
const num = parseInt(args[0], 10);
if(isNaN(num) || num < 0){
    console.error("Please enter a valid non-negative integer.");
    process.exit(1);
}

function factorial(n){
    if(n === 0 || n === 1) return 1;
    let result = 1;
    for(let i = 2; i <= n; i++){
        result *= i;
    }
    return result;
}
console.log(`Factorial of ${num} is: ${factorial(num)}`);
