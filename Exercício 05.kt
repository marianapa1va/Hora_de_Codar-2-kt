fun main(){
   //O programa irá ler seis valores informados pelo usuário e fará o cáculo para mostrar a média aritmética desses valores.

    print("Informe o primeiro número que deseja calcular á média aritmética: ")
    var v1 = readln().toDouble()

    print("Informe o segundo número que deseja calcular á média aritmética: ")
    var v2 = readln().toDouble()

    print("Informe o terceiro número que deseja calcular á média aritmética: ")
    var v3 = readln().toDouble()

    print("Informe o quarto número que deseja calcular á média aritmética: ")
    var v4 = readln().toDouble()

    print("Informe o quinto número que deseja calcular á média aritmética: ")
    var v5 = readln().toDouble()

    print("Informe o sexto número que deseja calcular á média aritmética: ")
    var v6 = readln().toDouble()

    var soma = (v1 + v2 + v3 + v4 + v5 + v6)/2

    println("Os valores informados são: $v1 - $v2 - $v3 - $v4 - $v5 - $v6 ")

    println("A média aritmética desses valores é: $soma")

}