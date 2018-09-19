function manipulateArray(input) {
    let array = new Array;

    for (let i = 0; i < input.length; i++) {
        let commandLine = input[i].split(' ');
        let command = commandLine[0];
        let argument = Number(commandLine[1]);

        if (command == 'add') {
            array.push(argument);
        }
        else {
            array.splice(argument, 1);
        }
    }

    console.log(array.join('\r\n'));
}