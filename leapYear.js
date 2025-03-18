// Get year input from command line arguments (for Node.js)
const args = process.argv.slice(2);

if (args.length !== 1) {
    console.log("Usage: node leapYear.js <year>");
    process.exit(1); // Exit if no argument is provided
}

const year = parseInt(args[0], 10);

// Check if the input is a valid 4-digit number
if (isNaN(year) || year < 1000 || year > 9999) {
    console.log("Please enter a valid 4-digit year.");
    process.exit(1);
}

// Leap year logic
const isLeapYear = (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);

if (isLeapYear) {
    console.log(year + " is a Leap Year");
} else {
    console.log(year + " is Not a Leap Year");
}
