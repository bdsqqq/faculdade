function validaDados() {
        if ($("#inputNome").val() == "") {
                $("#resultado").text("O nome não pode estar vazio");
                return false
        } else {
            if ($("#inputRgm").val() == "") {
                $("#resultado").text("O RGM não pode estar vazio");
                return false
            } else {
                if ($("#inputParcial").val() == "") {
                    $("#resultado").text("A avaliação parcial não pode estar vazia");
                    return false
                } else {
                    if ($("#inputExercicios").val() == "") {
                            $("#resultado").text("A avaliação dos exercicios não pode estar vazia");
                            return false
                } else{
                    if ($("#inputProjeto").val() == "") {
                            $("#resultado").text("A avaliação do projeto não pode estar vazia");
                            return false
                } else{
                    if ($("#inputRegimental").val() == "") {
                        $("#resultado").text("A avaliação regimental não pode estar vazia");
                        return false
                    } else{
                        $("#resultado").text("Sucesso!");
                        return true
                    }
                }
            }
        }}
    };
}

function calcMedia(x, y, z, a) {
    var media = (x + y + z + a) / 4;

    return media;
};

function calcular(){
    vMedia = calcMedia(vParcial, vExercicios, vProjeto, vRegimental);

    $("#rNome").text($("#inputNome").val());
    $("#rRgm").text($("#inputRgm").val());
    $("#rParcial").text(vParcial);
    $("#rExercicios").text(vExercicios);
    $("#rProjeto").text(vProjeto);
    $("#rRegimental").text(vRegimental);
    $("#rMedia").text(vMedia);


    $("#inputNome").val("");
    $("#inputRgm").val("");
    $("#inputParcial").val("");
    $("#inputExercicios").val("");
    $("#inputProjeto").val("");
    $("#inputRegimental").val("");
}

function aprovar(m){
    if(m >= 6){
        $("#rSituacao").text("Aprovado");
    }else{
        if(m < 6 && m >= 3){
            $("#rSituacao").text("Exame");
        }
        else{
            $("#rSituacao").text("Reprovado");
        }
    };
}