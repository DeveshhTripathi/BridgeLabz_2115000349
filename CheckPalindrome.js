function isPalindrome(num){
    let original = num.toString();
    let reversed = original.split('').reverse().join('');
    return original === reversed;
}
function checkTwoPalindromes(num1, num2){
    let result1 = isPalindrome(num1);
    let result2 = isPalindrome(num2);

    console.log(`${num1} is ${result1 ? "a Palindrome" : "not a Palindrome"}`);
    console.log(`${num2} is ${result2 ? "a Palindrome" : "not a Palindrome"}`);
}
checkTwoPalindromes(121, 123);
checkTwoPalindromes(787, 898);
