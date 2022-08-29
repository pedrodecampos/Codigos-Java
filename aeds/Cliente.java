package javinha;

public class Cliente {

private int codigo;
private String nome;
Cliente(int cod, String name){codigo = cod; nome = name;}
public void imprimirCliente() {
System.out.println("Dados Do Cliente:");	
System.out.println("Codigo: "+ codigo);
System.out.println("Nome do cliente: "+ nome);
}
public int getCodigo() {return codigo;}
public void setCodigo(int cod) {codigo = cod;}
public String getNome() {return nome;}
public void setNome(String name) {nome = name;}
	
}
	




