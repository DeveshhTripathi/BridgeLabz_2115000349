const args = process.argv.slice(2);

if(args.length !== 1){
    console.log("Usage: node weekDay.js <number (1-7)>");
    process.exit(1);
}
const num = parseInt(args[0], 10);

// Check if input is a valid number between 1 and 7
if (isNaN(num) || num < 1 || num > 7) {
    console.log("Please enter a number between 1 and 7.");
    process.exit(1);
}
let day;
if (num === 1) day = "Sunday";
else if (num === 2) day = "Monday";
else if (num === 3) day = "Tuesday";
else if (num === 4) day = "Wednesday";
else if (num === 5) day = "Thursday";
else if (num === 6) day = "Friday";
else if (num === 7) day = "Saturday";

console.log("Day of the week:", day);
