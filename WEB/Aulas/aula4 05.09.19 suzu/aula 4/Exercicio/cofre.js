var m5 = parseInt(prompt("Quantas moedas de 5?"));
var m10 = parseInt(prompt("Quantas moedas de 10?"));
var m25 = parseInt(prompt("Quantas moedas de 25?"));

var rs = (m5*5 + m10*10 + m25*25)/100;

document.write("o total é: R$" + rs);