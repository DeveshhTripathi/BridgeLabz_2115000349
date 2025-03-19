function PrimeFactorization(n){
    let factors = [];
    let num = n;

    while (num % 2 === 0){
        factors.push(2);
        num /= 2;
    }
    for(let i = 3; i * i <= num; i += 2){
        while(num % i === 0){
            factors.push(i);
            num /= i;
     }
  }
    if(num > 2){
        factors.push(num);
    }
    console.log(`Prime factors of ${n}:`, factors);
}
let number = 120;
primeFactorization(number);
