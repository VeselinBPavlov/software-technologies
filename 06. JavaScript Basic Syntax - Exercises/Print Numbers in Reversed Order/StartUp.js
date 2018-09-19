function reverseNumbers(nums) {
    let numbers = nums.map(Number);
    let revNums = numbers.reverse();

    for (let i = 0; i < revNums.length; i++) {
       console.log(revNums[i]);        
    }
}