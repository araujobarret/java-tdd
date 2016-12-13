
public class Pilha {

	private Object[] elementos;
	private int quantidade = 0;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}

	public boolean estaVazia(){
		return (quantidade == 0) ? true : false;
	}

	public int tamanho() {
		return this.quantidade;
	}

	public void empilha(Object elemento) {
		if(quantidade == elementos.length)
			throw new PilhaCheiaException("Não é possível empilhar mais elementos, pilha cheia!");
		this.elementos[quantidade] = elemento;
		quantidade++;
	}

	public Object topo() {		
		return this.elementos[quantidade-1];
	}

	public Object desempilha() {
		if(estaVazia())
			throw new PilhaVaziaException("Não é possível desempilhar, pilha vazia!");
		Object topo = topo();
		quantidade--;
		return topo;
	}
	
}
