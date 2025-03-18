const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
function isPrime(num){
    if(num < 2) return false;
    for(let i = 2; i * i <= num; i++){
        if(num % i === 0) return false;
    }
    return true;
}

function getPalindrome(num){
    return parseInt(num.toString().split('').reverse().join(''));
}
function checkPrimeAndPalindrome(num){
    if(isPrime(num)){
        console.log(`${num} is a Prime Number.`);
        let palindrome = getPalindrome(num);
        console.log(`Palindrome of ${num} is ${palindrome}.`);

        if(isPrime(palindrome)){
            console.log(`Palindrome ${palindrome} is also a Prime Number! 🎉`);
        }else{
            console.log(`Palindrome ${palindrome} is NOT a Prime Number.`);
        }
    }else{
        console.log(`${num} is NOT a Prime Number.`);
  }
}

rl.question("Enter a number: ", (num) => {
    num = parseInt(num);
    checkPrimeAndPalindrome(num);
    rl.close();
});
