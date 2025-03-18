// Get command-line arguments
const args = process.argv.slice(2); // Skip first two default args

// Ensure two arguments (day and month) are provided
if (args.length !== 2) {
    console.log("Usage: node checkDate.js <day> <month>");
    process.exit(1); // Exit with error
}

// Parse input
const day = parseInt(args[0], 10);
const month = parseInt(args[1], 10);

// Check if date is between March 20 and June 20
const isValid =
    (month === 3 && day >= 20) ||  // March 20 onwards
    (month > 3 && month < 6) ||    // April & May (full months)
    (month === 6 && day <= 20);    // Up to June 20

console.log(isValid);
