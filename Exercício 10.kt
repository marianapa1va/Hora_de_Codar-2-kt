fun main(){
    //O progrma irá informar a peso ideal, com base na altura e o sexo do usuário.

    print("Digite a sua altura: ")
    var altura = readln().toDouble()

    print("Digite o seu sexo, leve em considera que se for feminino, digite (1), e se for masculino, digite (2): ")
    var sexo = readln().toDouble()

    var sx1 = (62.1 * altura) - 44.7

    var sx2 = (72.7 * altura) - 58

    if ( sexo == 1.toDouble()){
        println("Seu peso ideal é: $sx1")
    }
    if ( sexo == 2.toDouble()){
        println("Seu peso ideal é: $sx2")
    }
}