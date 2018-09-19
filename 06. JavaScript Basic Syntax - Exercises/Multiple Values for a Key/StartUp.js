function makeDictionary(input) {
    let keyWord = input[input.length - 1];
    let dictionary = {};

    for (let i = 0; i < input.length - 1; i++) {
       let commandLine = input[i].split(' ');
       let kp = commandLine[0];
       let value = commandLine[1];

       if (kp in dictionary === false) {
           dictionary[kp] = [];
       }   
       
       dictionary[kp].push(value);
    }

    if (keyWord in dictionary){
        console.log(dictionary[keyWord].join('\r\n'));
    } 
    else {
        console.log('None');
    }  
}