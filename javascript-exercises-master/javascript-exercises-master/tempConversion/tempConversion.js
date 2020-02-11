const ftoc = function(fahr) {
  let toCelsius = (fahr - 32) * (5/9);
  if (toCelsius === 0) {
    return 0;
  } else {
    return Number(toCelsius.toFixed(1));
  }
}

const ctof = function(celc) {
  let toFahrenheit = (celc * (9/5)) + 32;
  if (toFahrenheit === 0) {
    return 0;
  } else {
    return Number(toFahrenheit.toFixed(1));
  }
}

module.exports = {
  ftoc,
  ctof
}
