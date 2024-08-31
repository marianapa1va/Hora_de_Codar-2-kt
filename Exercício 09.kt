fun main(){
    //O programa irá ler o ano de nascimento de uma pessoa e irformará se ela pode sim ou não votar esse ano.

    print("Informe o seu ano de nascimento: ")
    var ano_de_nascimento = readln().toDouble()

    if(ano_de_nascimento <= 2009){
        println("Você já pode votar!")
    }
    if(ano_de_nascimento > 2009){
        println("você ainda não possui idade suficiente para poder votar!")}
}