const args = process.argv.slice(2);

if(args.length !== 1){
    console.error("Usage: node harmonicNumber.js <n>");
    process.exit(1);
}

const n = parseInt(args[0], 10);

if (isNaN(n) || n <= 0){
    console.error("Please enter a positive integer for n.");
    process.exit(1);
}

let harmonic = 0;
for (let i = 1; i <= n; i++) {
    harmonic += 1 / i;
}

console.log(`The ${n}th Harmonic Number (H_${n}) is: ${harmonic.toFixed(6)}`);
