const args = process.argv.slice(2);

if(args.length !== 1){
    console.log("Usage: node numberUnit.js <number>");
    process.exit(1);
}
const num = parseInt(args[0], 10);

// Check if the number is valid (power of 10)
let unit;
if (num === 1) unit = "One";
else if (num === 10) unit = "Ten";
else if (num === 100) unit = "Hundred";
else if (num === 1000) unit = "Thousand";
else if (num === 10000) unit = "Ten Thousand";
else if (num === 100000) unit = "Lakh";
else if (num === 1000000) unit = "Ten Lakh";
else if (num === 10000000) unit = "Crore";
else if (num === 100000000) unit = "Ten Crore";
else {
    console.log("Please enter a valid number (1, 10, 100, 1000, etc.)");
    process.exit(1);
}
console.log("Unit:", unit);
