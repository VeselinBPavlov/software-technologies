function extractCapitalCaseWords(stringArray) {
 
    let result = [];
 
    for (let str of stringArray) {
 
        let capitalCaseWords = str.match(/\b[A-Z]+\b/g);
        result.push(capitalCaseWords.join(", "));
    }
 
    console.log(result.join(", "));
}

