const args = process.argv.slice(2);

if(args.length !== 3){
    console.log("Usage: node arithmeticOperations.js <a> <b> <c>");
    process.exit(1);
}
// Parse input values
const a = parseFloat(args[0]);
const b = parseFloat(args[1]);
const c = parseFloat(args[2]);

// Perform arithmetic operations
const op1 = a + b * c;
const op2 = a % b + c;
const op3 = c + a / b;
const op4 = a * b + c;

// Store results in an array
const results = [op1, op2, op3, op4];

// Find maximum and minimum values
const maxValue = Math.max(...results);
const minValue = Math.min(...results);

// Print results
console.log(`Results of operations:`);
console.log(`1. a + b * c = ${op1}`);
console.log(`2. a % b + c = ${op2}`);
console.log(`3. c + a / b = ${op3}`);
console.log(`4. a * b + c = ${op4}`);

console.log(`Maximum value: ${maxValue}`);
console.log(`Minimum value: ${minValue}`);
