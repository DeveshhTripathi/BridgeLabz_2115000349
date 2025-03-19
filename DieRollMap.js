function rollDieGame(){
    let rollMap = new Map();
    let maxCount = 10;
    for(let i = 1; i <= 6; i++){
        rollMap.set(i, 0);
    }
    while(![...rollMap.values()].includes(maxCount)){
        let roll = Math.floor(Math.random() * 6) + 1;
        rollMap.set(roll, rollMap.get(roll) + 1);
    }
    console.log("Final roll counts:", rollMap);
    let maxRoll = [...rollMap.entries()].reduce((a, b) => (a[1] > b[1] ? a : b));
    let minRoll = [...rollMap.entries()].reduce((a, b) => (a[1] < b[1] ? a : b));

    console.log(`Number that reached 10 times first: ${maxRoll[0]}`);
    console.log(`Number with the least occurrences: ${minRoll[0]}`);
}
rollDieGame();
