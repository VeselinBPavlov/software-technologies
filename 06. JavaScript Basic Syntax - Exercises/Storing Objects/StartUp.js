function storingObjects(input) {
    let result = [];
    for (let i = 0; i < input.length; i++) {
        let props = input[i].split(' -> ');  
        let name = props[0];
        let age = Number(props[1]);
        let grade =  Number(props[2]);

        let student = {};
        student.name = name;
        student.age = age;
        student.grade = grade;
        result.push(student);
    }

    for (let student of result) {
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade.toFixed(2)}`);
    }
}