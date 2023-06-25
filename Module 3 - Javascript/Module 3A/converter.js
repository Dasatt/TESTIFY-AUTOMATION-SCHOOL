// convert naira to dollar, return equivalent dollar value

function converter(dollar){
    //conversion rate is N790 to 1 usd
    const conversion_rate = 790
    const naira = dollar * conversion_rate

    return naira    
}

console.log(converter(100))