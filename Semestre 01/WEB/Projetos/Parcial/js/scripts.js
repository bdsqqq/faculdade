$(function(){
    $('#calc').click(function(){
        var classe = $('#classe').val();
        var origem = $('input[name=origem]:checked').val();
        var destino = $('input[name=destino]:checked').val();
        var qtdPassageiros = $('#qtdPassageiros').val();
        var resultado = 0;
        var juros = 0;

        console.log('A classe é: '+classe);
        console.log('A origem é: '+origem);
        console.log('A destino é: '+destino);
        console.log('A qtdPassageiros é: '+qtdPassageiros);


        function validaDados(){
            if(classe == "0"){
                $("#erroClasse").addClass("alerta");
                $("#erroClasse").html("Escolha uma classe");
            }else{
                    $("#erroClasse").removeClass("alerta");
                    $("#erroClasse").html("");
                if(origem == undefined){
                    $("#erroOrigem").addClass("alerta");
                    $("#erroOrigem").html("Escolha uma origem");
                }else{
                    $("#erroOrigem").removeClass("alerta");
                    $("#erroOrigem").html("");
                    if(destino == undefined){
                        $("#erroDestino").addClass("alerta");
                        $("#erroDestino").html("Escolha um destino");
                    }else{
                        $("#erroDestino").removeClass("alerta");
                        $("#erroDestino").html("");
                        if(qtdPassageiros == ""){
                            $("#erroQtdPassageiros").addClass("alerta");
                            $("#erroQtdPassageiros").html("A quantidade de passageiros não pode estar vazia");
                        }else{
                            $("#erroQtdPassageiros").removeClass("alerta");
                            $("#erroQtdPassageiros").html("");
                            resultado = calculaConversao(classe, origem, destino, qtdPassageiros);
                            $('#resultado').html(resultado)
                        }
                    }
                }
            }
        }

        validaDados();

        function calculaConversao(classe, origem, destino, qtdPassageiros){
            if(classe == "1"){
                juros = 1;
            }else{
                if(classe == "2"){
                    juros = 1.1;
                }else{
                    juros = 1.15;
                }
            }
            
            if(origem == "SP"){
                if(destino == "BH"){
                    $("#erroDestino").removeClass("alerta");
                    return 419.43*qtdPassageiros*juros;
                }else{
                    if(destino == "RJ"){
                        $("#erroDestino").removeClass("alerta");
                        return 209.55*qtdPassageiros*juros;
                    }else{
                        $("#erroDestino").addClass("alerta");
                        $('#erroDestino').html('A origem e destino não podem ser iguais')
                    }
                }
            }else{
                if(origem == "BH"){
                    if(destino == "RJ"){
                        $("#erroDestino").removeClass("alerta");
                        return 648.99*qtdPassageiros*juros;
                    }else{
                        if(destino == "SP"){
                            $("#erroDestino").removeClass("alerta");
                            return 415.50*qtdPassageiros*juros;
                        }else{
                            $("#erroDestino").addClass("alerta");
                            $('#erroDestino').html('A origem e destino não podem ser iguais')
                        }
                    }
                }else{
                    if(origem == "RJ"){
                        if(destino == "BH"){
                            $("#erroDestino").removeClass("alerta");
                            return 331.75*qtdPassageiros*juros;
                        }else{
                            if(destino == "SP"){
                                $("#erroDestino").removeClass("alerta");
                                return 176.88*qtdPassageiros*juros;
                            }else{
                                $("#erroDestino").addClass("alerta");
                                $('#erroDestino').html('A origem e destino não podem ser iguais')
                            }
                        }
                }   }
            }
        }// Fim calcula conversão

        console.log(resultado)

    
    })//fim #calc.onclick
})//fim window.onload

