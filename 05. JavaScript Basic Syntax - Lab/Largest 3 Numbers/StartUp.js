function largest3Nums(arrNums) {
    let numbers = arrNums.map(Number);
    let numsSorted = numbers.sort((a, b) => b - a);
    let count = Math.min(3, arrNums.length)
    
    for (let i = 0; i < count; i++) {        
        console.log(numsSorted[i]);
    }
}
