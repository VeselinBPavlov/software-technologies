function jsonObjects(input) {
    let student = {};

    for (let line of input){
        let studentList = line.split(' -> ');
        let prop = studentList[0];
        let value = isNaN (studentList[1]) ? studentList[1] : Number(studentList[1]);

        student[prop] = value;
    }
    
    console.log(JSON.stringify(student));
}