const readline = require("readline");

// Create an interface for user input
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Function to perform unit conversions
function convertUnits(choice, value) {
    let result;
    switch (choice) {
        case 1: 
            result = value * 12; 
            console.log(`${value} Feet = ${result} Inches`);
            break;
        case 2:
            result = value * 0.3048;
            console.log(`${value} Feet = ${result.toFixed(4)} Meters`);
            break;
        case 3:
            result = value / 12; 
            console.log(`${value} Inches = ${result.toFixed(4)} Feet`);
            break;
        case 4:
            result = value / 0.3048;
            console.log(`${value} Meters = ${result.toFixed(4)} Feet`);
            break;
        default:
            console.log("Invalid choice! Please enter a valid option (1-4).");
    }
}

// Ask the user for input
rl.question("Choose a conversion option:\n1. Feet to Inch\n2. Feet to Meter\n3. Inch to Feet\n4. Meter to Feet\nEnter your choice (1-4): ", (choice) => {
    choice = parseInt(choice, 10);

    // Ask for the value to convert
    rl.question("Enter the value to convert: ", (value) => {
        value = parseFloat(value);
        if (isNaN(value)) {
            console.log("Invalid input! Please enter a valid number.");
        } else {
            convertUnits(choice, value);
        }
        rl.close();
    });
});
