const repeatString = function(text,num) {
    if (num >= 0) {
    let repeated = text.repeat(num);
    return repeated}
    else {
        return 'ERROR'
    }
}

module.exports = repeatString
