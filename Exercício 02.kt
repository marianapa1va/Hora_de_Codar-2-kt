fun main(){
    //Usuário irá informar um valor, e a máquina falará se é negativo, positivo ou nulo.

    print("Informe o valor que deseja saber se é positivo, negativo ou nulo: ")
    var valor = readln().toDouble()

    if (valor > 0 ){
        println("O valor informado, é positivo!")
    } else if (valor < 0){
        println("O valor informado, é negativo!")
    } else (println("O valor informado, é nulo"))

}