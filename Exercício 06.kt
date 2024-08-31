fun main(){
    //O programa irá informar o primeiro, o maior, e o ultimo dos quatros valores informados pelo usuário

    println("A seguir, leve em consideração de não informar valores iguais.")

    print("Informe o primeiro valor: ")
    var v1 = readln().toDouble()

    print("Informe o segundo valor: ")
    var v2 = readln().toDouble()

    print("Informe o terceiro valor: ")
    var v3 = readln().toDouble()

    print("Informe o quarto valor: ")
    var v4 = readln().toDouble()

    if (v1 > v2 + v3 + v4){
        println("Primeiro valor: $v1")
        println("Ultimo valor: $v4")
        println("Maior número informado: $v1")
    }

    else if (v2 > v2 + v3 + v4){
        println("Primeiro valor: $v1")
        println("Ultimo valor: $v4")
        println("Maior número informado: $v2")
    }

     else if (v3 > v1 + v2 + v4){
         println("Primeiro valor: $v1")
         println("Ultimo valor: $v4")
         println("Maior número informado: $v3")
     }

    else (v4 > v1 + v2 + v3)
        println("Primeiro valor: $v1")
        println("Ultimo valor: $v4")
        println("Maior número informado: $v4")


}