function sumsByTown() {
    let arr = "{\"town\":\"Sofia\",\"income\":200}"
    let townData = arr.map(JSON.parse);

    let sums = {};

    for (let town of townData) {
        if (town.town in sums) {
            sums[town.town] += town.income;
        }
        else {
            sums[town.town] = town.income;
        }
    }

    let towns = Object.keys(sums).sort();

    for (let town of towns) {
        console.log(`${town} -> ${sums[town]}`);
    }
}

