const args = process.argv.slice(2);

if(args.length !== 1){
    console.log("Usage: node powerOf2Table.js <n>");
    process.exit(1);
}
const n = parseInt(args[0], 10);

// Validate input (n should be a non-negative integer)
if(isNaN(n) || n < 0){
    console.log("Please enter a valid non-negative integer for n.");
    process.exit(1);
}
// Print the table of powers of 2
console.log(`Powers of 2 up to 2^${n}:`);
for(let i = 0; i <= n; i++){
    console.log(`2^${i} = ${Math.pow(2, i)}`);
}
