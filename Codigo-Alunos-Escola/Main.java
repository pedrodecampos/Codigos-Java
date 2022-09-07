import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        
        double nota1,nota2,nota3;
        double media;
        	System.out.println("Digite sua nota");
        	nota1=sc.nextDouble();
        	System.out.println("Digite sua nota");
        	nota2=sc.nextDouble();
        	System.out.println("Digite sua nota");
        	nota3=sc.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        if(media <4)
        {System.out.println("Auno reprovado com a media = "+media);}
        else if(media == 4 && media < 6)
        {System.out.println("Aluno ira fazer exame especial com a media = "+media);}
        else 
        {System.out.println("Aluno aprovado com ="+media);}
		
      
        
        sc.close();
        
    }
}