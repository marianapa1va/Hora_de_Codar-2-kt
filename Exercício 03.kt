fun main(){
    //O programa irá ler três valores informados pelo usuário, e indentificará qual é o maior entre eles

    print("Informe o primeiro valor: ")
    var v1 = readln().toDouble()

    print("Informe o segundo valor: ")
    var v2 = readln().toDouble()

    print("Informe o terceiro valor: ")
    var v3 = readln().toDouble()

    if (v1 >  v2 + v3){
        println("O primeiro valor informado, é o maior.")
    }else if (v2 > v1 + v3){
        println("O segundo valor informado, é o maior.")
    }else (println("O terceiro valor informado, é o maior."))

}