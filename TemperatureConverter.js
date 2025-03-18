const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function convertTemperature(choice, temperature) {
    switch (choice) {
        case 1:
            if (temperature < 0 || temperature > 100) {
                console.log("Error: Temperature should be between 0°C and 100°C.");
            } else {
                let fahrenheit = (temperature * 9/5) + 32;
                console.log(`${temperature}°C is ${fahrenheit.toFixed(2)}°F`);
            }
            break;

        case 2:
            if (temperature < 32 || temperature > 212) {
                console.log("Error: Temperature should be between 32°F and 212°F.");
            } else {
                let celsius = (temperature - 32) * 5/9;
                console.log(`${temperature}°F is ${celsius.toFixed(2)}°C`);
            }
            break;

        default:
            console.log("Invalid choice! Please enter 1 or 2.");
    }
    rl.close();
}

rl.question("Select Conversion:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\nEnter your choice (1/2): ", (choice) => {
    choice = parseInt(choice);
    rl.question("Enter temperature: ", (temp) => {
        temp = parseFloat(temp);
        convertTemperature(choice, temp);
    });
});
