package exercicio1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class inserir {


	public inserir(){
	int op = 0;
		 Scanner l = new Scanner(System.in);
		 ArrayList<produtos> registo = new ArrayList<produtos>();
		 
		 do{
			 
	        System.out.println(" Insira o produto: ");
	        String tipo = new Scanner(System.in).nextLine();
	        
	        System.out.println(" Insira a quantidade:  ");
	        int quantidade = l.nextInt();
	        
	        System.out.println(" Insira o preço por kg: ");
	        double preco = l.nextDouble();
	        
	       
	        produtos produto;
	        
	        produto = new produtos();
	        produto.setTipo(tipo);
	        produto.setQuantidade(quantidade);
	        produto.setPreco(preco);
	        System.out.println("\n Registado com sucesso!! \n");
	        
	      
			registo.add(produto);
			System.out.println(" Em Stock: ");
	        for (int i=0;i<registo.size();i++)
	        {
	        System.out.println(" Tipo de fruta: "+registo.get(i).getTipo()+ " Quantidade: "+ registo.get(i).getQuantidade()+ " Preço(kg): "+registo.get(i).getPreco()+"€");
	        }
	        System.out.println("\n Deseja fazer mais registos? (1-sim | 2-nao) "); 
	        op = l.nextInt();

		 }while(op==1);
		 }
}