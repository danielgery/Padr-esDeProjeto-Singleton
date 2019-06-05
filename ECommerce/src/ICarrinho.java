import java.util.ArrayList;

public interface ICarrinho {

	public void setCliente(Cliente cliente);
	public void setListaDeProduto(ArrayList<Produto> listaDeProduto);
	public void addProduto(Produto prod);
	public Cliente getCliente();
	public ArrayList<Produto> getListaDeProduto();
}
