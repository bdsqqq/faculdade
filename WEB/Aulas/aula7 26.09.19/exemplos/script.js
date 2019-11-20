console.log("to sendo referenciado pelo menos")

function validaDados(){
    if($("num1").val() == ""){
        $("resultado").text("Escreva algo no primeiro");
        return false
    }else{
        if($("num2").val() == ""){
            $("resultado").text("Escreva algo no segundo");
            return false
        }else{
            if($("input[name=opera:checked]").val() != 1){
                $("resultado").text("Escreva algo no segundo");
                return false
            }else{
                return true
            }
        }
    }
};

$(function(){

    $("#btnCalcular").click(function){
        validaDados();
    }



});