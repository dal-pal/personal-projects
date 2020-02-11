const sumAll = function(num1,num2) {
    let values = [];
    if (num1 < 0 || num2 < 0) {
        return 'ERROR';
    } else if (typeof(num1) != 'number' || typeof(num2) != 'number') {
        return 'ERROR';
    } else if (num2 > num1) {
        while(num1 <= num2) {
            values.push(num1++);
        }
    } else if (num1 > num2) {
        while(num2 <= num1) {
            values.push(num2++);
        }
    }
    let reducer = values.reduce(function (a,b) { return a + b; }, 0)
    return reducer
}

module.exports = sumAll
