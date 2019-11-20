function geth(){
    return parseFloat(document.getElementById('h').value);
}

function getb1() {
    return parseFloat(document.getElementById('b1').value);
}

function getb2() {
    return parseFloat(document.getElementById('b2').value);
}


function areaTrapezio(x, y, z){
    return (y+z)*x/2
}

function trapezio(){
    h = geth();
    b1 = getb1();
    b2 = getb2();

    document.getElementById('resultadoTrapezio').innerHTML = areaTrapezio(h, b1, b2);
}

function gethPessoa(){
    return parseFloat(document.getElementById('hPessoa').value);
}

function getpPessoa(){
    return parseFloat(document.getElementById('pPessoa').value);
}

function calcularImc(x, y){
    return (x/(y*y));
}

function imc(){
    pPessoa = geth();
    hPessoa = gethPessoa();

    document.getElementById('resultadoImc').innerHTML = calcularImc(pPessoa, hPessoa);
}