const args = process.argv.slice(2);

if (args.length !== 1){
    console.error("Usage: node primeFactors.js <N>");
    process.exit(1);
}

let N = parseInt(args[0], 10);

if (isNaN(N) || N < 2){
    console.error("Please enter an integer greater than or equal to 2.");
    process.exit(1);
}
function primeFactors(N){
    let factors = [];

    while (N % 2 === 0){
        factors.push(2);
        N /= 2;
    }
    for(let i = 3; i * i <= N; i += 2){
        while(N % i === 0){
            factors.push(i);
            N /= i;
        }
    }
    if(N > 1){
        factors.push(N);
    }

    return factors;
}
console.log(`Prime factors of ${args[0]} are: ${primeFactors(N).join(", ")}`);
