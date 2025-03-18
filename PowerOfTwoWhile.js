const args = process.argv.slice(2);

if(args.length !== 1){
    console.error("Usage: node powersOf2.js <n>");
    process.exit(1);
}

const n = parseInt(args[0], 10);

if (isNaN(n) || n < 0){
    console.error("Please enter a valid non-negative integer.");
    process.exit(1);
}
let power = 0;
let value = 1;

console.log(`Powers of 2 up to 2^${n} or 256:`);

while (power <= n && value <= 256){
    console.log(`2^${power} = ${value}`);
    value *= 2;
    power++;
}
