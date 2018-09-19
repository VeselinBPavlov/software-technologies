function jsonObjects(input) {
    let result = input.map(JSON.parse);
    
    for (let student of result) {
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Date: ${student.date}`);
    }
}