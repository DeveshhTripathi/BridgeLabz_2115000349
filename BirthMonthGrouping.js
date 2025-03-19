function generateBirthdays(){
    let birthdayMap = new Map();

    for(let i = 1; i <= 12; i++){
        birthdayMap.set(i, []);
    }
    for(let i = 1; i <= 50; i++){
        let birthMonth = Math.floor(Math.random() * 12) + 1;
        birthdayMap.get(birthMonth).push(`Person${i}`);
    }
    console.log("Individuals grouped by birth month:");
    for(let [month, people] of birthdayMap.entries()) {
        if(people.length > 0){
            console.log(`Month ${month}: ${people.join(", ")}`);
    }
  }
}
generateBirthdays();
