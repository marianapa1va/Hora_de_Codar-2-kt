fun main(){
    //O programa irá calcular a média de quatro valores, mas somente se eses valores forem maiores que 0 e menores que 10.

    print("Informe o primeiro valor: ")
    var v1 = readln().toDouble()

    print("Informe o segundo valor: ")
    var v2 = readln().toDouble()

    print("Informe o terceiro valor: ")
    var v3 = readln().toDouble()

    print("Informe o quarto valor: ")
    var v4 = readln().toDouble()

    var media = (v1 + v2 + v3 + v4) /4

    if (v1 > 10) {
        println("Erro!")

     if (v1 < 0)
        println("Erro!")

    }
    if (v2 > 10 ){
        println("Erro!")

        if (v2 < 0)
            println("Erro!")

    }
    if (v3 > 10 ){
        println("Erro!")

        if (v3 < 0)
            println("Erro!")

    }
    if (v4 > 10 ){
        println("Erro!")

        if (v4 < 0)
            println("Erro!")
    }

    else if (media >= 6 == media <= 10){
        println("Sua média é: $media, você passou no teste!")
    }
    else(media >= 10)
        println("Sua média é: $media. Tente novamente!")


}