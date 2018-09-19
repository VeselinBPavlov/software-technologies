function multiplyNumbers(nums) {
    let numbers = nums.map(Number);
    let num1 = numbers[0];
    let num2 = numbers[1];

    let result = num1 * num2;

    console.log(result);
}

multiplyNumbers(['1', '2'])