function printingLines(input) {
    let index = 0;

     while (true) {
        let line = input[index++];

        if (line === 'Stop') {
            break;
        } else {
            console.log(line);
        }       
     }
}
