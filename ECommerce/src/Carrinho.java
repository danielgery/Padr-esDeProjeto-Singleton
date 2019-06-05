import java.util.ArrayList;

public class Carrinho implements ICarrinho{

	private ArrayList<Produto> listaDeProduto;
	
	private Cliente cliente;
	
	public Carrinho(Cliente cli, ArrayList<Produto> produtos) {
		cliente = cli;
		listaDeProduto = produtos;

	}
	public Carrinho() {
		// TODO Auto-generated constructor stub
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setListaDeProduto(ArrayList<Produto> listaDeProduto) {
		this.listaDeProduto = listaDeProduto;
	}
	public void addProduto(Produto prod) {
		this.listaDeProduto.add(prod);
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public ArrayList<Produto> getListaDeProduto() {
		return listaDeProduto;
	}
	
	@Override
	public String toString() {
		return "Carrinho [listaDeProduto=" + listaDeProduto + ", Cliente=" + cliente + "]";
	}
	
	
	
}
