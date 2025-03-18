const args = process.argv.slice(2);

if(args.length !== 2){
    console.error("Usage: node primeRange.js <start> <end>");
    process.exit(1);
}
const start = parseInt(args[0], 10);
const end = parseInt(args[1], 10);

if(isNaN(start) || isNaN(end) || start < 2 || end < 2 || start > end){
    console.error("Please enter valid integers (start >= 2 and start <= end).");
    process.exit(1);
}
function isPrime(n){
    if (n < 2) return false;
    if (n === 2) return true;
    if (n % 2 === 0) return false;
    for (let i = 3; i * i <= n; i += 2){
        if (n % i === 0) return false;
    }
    return true;
}

console.log(`Prime numbers between ${start} and ${end}:`);
for (let i = start; i <= end; i++){
    if (isPrime(i)) console.log(i);
}
