import java.util.Scanner;
public class Aula1 {
	public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*//exercicio 1 - Frutas
        double abacaxi = 7.30;
        double maca = 2.0; 
        double pera = 3.0;

        //Apresentando valores
        System.out.println("Valor abacaxi:  " + abacaxi); 
        System.out.println("Valor maça:  " + maca); 
        System.out.println("Valor pera:  " + pera); 
        
        //Pedindo quantidades 
        System.out.println("Digite a quatidade de abacaxis comprados:  "); 
		abacaxi *= entrada.nextInt(); 

        //Calculo + apresentação
        System.out.println("Digite a quatidade de maças compradas:  "); 
		maca *= entrada.nextInt(); 

        System.out.println("Digite a quatidade de peras compradas:  "); 
		pera *= entrada.nextInt(); 

        entrada.close();

        //calculando total gasto
        double total = abacaxi + maca + pera;

        //apresentando total
        System.out.println("Total gasto:  " + total);*/


        /*//Exercicio 2 - Comparação valores iguais

        int num1, num2; 

        //Recebendo os valores
        System.out.println("Digite o primeiro valor:  "); 
		num1 = entrada.nextInt(); 

        System.out.println("Digite o segundo valor:  "); 
		num2 = entrada.nextInt(); 

        //comparação valores iguais
        if (num1 == num2){
            System.out.println("São valores iguais !"); 
        }else{
            System.out.println("São valores diferentes !"); 
        }*/

        /*//exercicio3 - Maior de idade
        int idade;

        //Recebendo idades
        System.out.println("Digite sua idade:  "); 
		idade = entrada.nextInt(); 

        //comparação maior de idade
        if (idade >=18){
            System.out.println("Maior de idade!"); 
        }else{
            System.out.println("Menor de idade!"); 
        }*/


        /*//exercicio 4 - Comparação de idades

        int idade1, idade2; 
        //Recebendo idades
        System.out.println("Digite idade1:  "); 
		idade1 = entrada.nextInt(); 

        System.out.println("Digite idade2:  "); 
		idade1 = entrada.nextInt(); 

         //comparação de idades
         if (idade1 == idade2 ){
            System.out.println("Idades Iguais!"); 

         }else if (idade1 > idade2){
            System.out.println("A primeira idade é maior!"); 

        }else{
            System.out.println("A primeira idade é menor!"); 
        }*/


        /*//exercicio 5 - Previsão
        Boolean chuva, nublado, sol; 

        System.out.println("Está chovendo?  "); 
		chuva = entrada.nextBoolean();

        System.out.println("Está nublado?  "); 
		nublado = entrada.nextBoolean();

        System.out.println("Está sol?  "); 
		sol = entrada.nextBoolean();

        if (chuva == true | nublado == true){
            System.out.println("Está chovendo ou nublado.  "); 
        }else{
            System.out.println("Está ensolarado."); 
        }*/
        
        /*// exemplo: comparando char 
        String tempo; 
        System.out.println("Está sol?  "); 
		tempo = entrada.nextLine();

        if (tempo.equals("chuva") ==0){
            System.out.println("Está chovendo. ");
    
        }else {
            System.out.println("Não está chovendo");           
        }*/


        /*//exercicio 06 - Guarda Chuva
        Boolean chuva, guardaChuva;

        System.out.println("Está chovendo?"); 
		chuva = entrada.nextBoolean();

        System.out.println("Trouxe seu guarda chuva? "); 
		guardaChuva = entrada.nextBoolean();

        if (chuva == true && guardaChuva ==true){
            System.out.println("Está tranquilo"); 
        }else {
            System.out.println("Você vai levar chuva. "); 
        }*/


        /*//exercicio 07 - Opção caixa 
        char opcao; 

        //solicitando opção
        System.out.println("||| A - depésito || B - Saque || C - Impréstimo");
        System.out.println("Qual operação deseja fazer? ");
        opcao = entrada.next().charAt(0);
       
        //verificações com switch
        switch(opcao){

            case 'a':
            System.out.println("Você deseseja executar um Depósito;"); 
            break;

            case 'b':
            System.out.println("Você deseseja executar um Saque;"); 
            break; 

            case 'c':
            System.out.println("Você deseseja executar um Impréstimo;"); 
            
            default:
            System.out.println("Você digitou uma opção inválida !"); 
		
        }*/

        /*//Exercicio8 - Número multiplo de 3 ou 5

        int num; 

        //solicitando valor
        System.out.println("Digite seu número: ");
        num = entrada.nextInt();

        //comparaçâo 
        if (num%3 == 0 || num%5 == 0){
            System.out.println("Verdadeiro, seu número é multiplo de 3 ou 5"); 
        }else {
            System.out.println("Falso, seu número é multiplo de 3 ou 5"); 
        }*/

        entrada.close();
    }
}