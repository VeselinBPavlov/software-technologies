function product(nums) {
    let numbers = nums.map(Number);
    let counter = 0;

    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] < 0) {
            counter++;
        }        
    }

    if (counter % 2 == 0) {
        console.log(`Positive`);
    }
    else{
        console.log(`Negative`);
    }
}