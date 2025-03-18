const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let low = 1, high = 100;

console.log("Think of a number between 1 and 100.");
console.log("I will guess it by asking questions.");

function findMagicNumber(){
    if(low > high) {
        console.log("Something went wrong! Please restart.");
        rl.close();
        return;
    }
    let mid = Math.floor((low + high) / 2);
    rl.question(`Is your number ${mid}? (yes/no) `, (answer) => {
        if (answer.toLowerCase() === "yes") {
            console.log(`Great! Your magic number is ${mid}.`);
            rl.close();
        } else {
            rl.question(`Is your number greater than ${mid}? (yes/no) `, (response) => {
                if (response.toLowerCase() === "yes") {
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
                findMagicNumber();
            });
        }
    });
}
findMagicNumber();
