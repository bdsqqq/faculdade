
window.onload = ()=> {
    const elements = {
        "inputNumero": document.getElementById('inputNumero'),
        "buttonCalculaSoma": document.getElementById('buttonCalculaSoma'),
        "resultado": document.getElementById('resultado')
    };

    elements.buttonCalculaSoma.onclick = () => {
        elements.inputNumero = atualizarValorInputNumero();
        let temp = 0
        for(i=0; i <= elements.inputNumero.value; i++){
            temp += i;
        }
        elements.resultado.textContent = temp;
    }

    function atualizarValorInputNumero(){
        return document.getElementById('inputNumero');
    };
};