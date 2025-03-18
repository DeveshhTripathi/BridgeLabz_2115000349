let numbers = Array.from({ length: 5 }, () => Math.floor(Math.random() * 900) + 100);

console.log("Generated numbers:", numbers);

// Find the minimum and maximum values
let minValue = Math.min(...numbers);
let maxValue = Math.max(...numbers);

console.log("Minimum value:", minValue);
console.log("Maximum value:", maxValue);
