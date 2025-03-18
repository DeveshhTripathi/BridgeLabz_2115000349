const args = process.argv.slice(2);
if(args.length !== 1){
    console.log("Usage: node numberToWord.js <single-digit number>");
    process.exit(1);
}
// Parse input
const num = parseInt(args[0], 10);

// Check if input is a single digit
if(isNaN(num) || num < 0 || num > 9){
    console.log("Please enter a valid single-digit number (0-9).");
    process.exit(1);
}
// Convert number to word using switch-case
let word;
switch (num){
    case 0: word = "Zero"; break;
    case 1: word = "One"; break;
    case 2: word = "Two"; break;
    case 3: word = "Three"; break;
    case 4: word = "Four"; break;
    case 5: word = "Five"; break;
    case 6: word = "Six"; break;
    case 7: word = "Seven"; break;
    case 8: word = "Eight"; break;
    case 9: word = "Nine"; break;
    default: word = "Invalid Input"; // This case is redundant due to earlier validation
}
console.log("Number in words:", word);
