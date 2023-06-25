// convert naira to dollar, return equivalent dollar value

// function converter(dollar){
//     //conversion rate is N790 to 1 usd
//     const conversion_rate = 790
//     const naira = dollar * conversion_rate

//     return naira    
// }

// console.log(converter(100))

function celsiusToFahrenheitConverter(celsius){
    // function converts temperature in celsius to Fahrenheit
    const fahrenheit = (celsius * 9/5) + 32;
    return fahrenheit;
}
let celsius = 30
let fahrenheit = celsiusToFahrenheitConverter(celsius)
console.log(celsius+'degC is equivalent to '+ fahrenheit +'degF')