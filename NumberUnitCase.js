const args = process.argv.slice(2);

if(args.length !== 1){
    console.log("Usage: node numberUnit.js <number>");
    process.exit(1);
}
const num = parseInt(args[0], 10);

let unit;
switch (num){
    case 1: unit = "Unit"; break;
    case 10: unit = "Ten"; break;
    case 100: unit = "Hundred"; break;
    case 1000: unit = "Thousand"; break;
    case 10000: unit = "Ten Thousand"; break;
    case 100000: unit = "Lakh"; break;
    case 1000000: unit = "Ten Lakh"; break;
    case 10000000: unit = "Crore"; break;
    case 100000000: unit = "Ten Crore"; break;
    default: 
        console.log("Please enter a valid number (1, 10, 100, 1000, etc.).");
        process.exit(1);
}

console.log("Unit Name:", unit);
