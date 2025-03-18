function gamble() {
    let money = 100;
    let goal = 200;
    let bets = 0;
    let wins = 0;

    while (money > 0 && money < goal) {
        bets++;
        if (Math.random() < 0.5) {
            money++;  // Win ₹1
            wins++;
        } else {
            money--;  // Lose ₹1
        }
    }

    console.log(`\nGame Over! ${money === goal ? "You reached ₹200! 🎉" : "You're broke! 💸"}`);
    console.log(`Total Bets Made: ${bets}`);
    console.log(`Total Wins: ${wins}`);
}

gamble();
