fun main(){
    //Uma micro calculadora.

    println("Informe um valor que deseja calcular: ")
    var n1 = readln().toDouble()

    println("Informe um outro valor que deseja calcular: ")
    var n2 = readln().toDouble()

    println("informe a operação que deseja, levando em consideração que o número informado representa uma operação como: (1)=soma, (2)=sub, (3)=div, (4)=mult: ")
    var op = readln().toDouble()

    var soma = n1 + n2
    var sub = n1 - n2
    var div = n1 / n2
    var mult = n1 * n2

    if (op == 1.toDouble()){
        println("A soma dos valores informados é: $soma")
    }
    if (op == 2.toDouble()){
        println("A subtração dos valores informados é: $sub")
    }
    if (op == 3.toDouble()){
        println("A divisão dos valores informados é: $div")
    }
    if (op == 4.toDouble()){
        println("A multiplicação dos valores informados é: $mult")
    }


}