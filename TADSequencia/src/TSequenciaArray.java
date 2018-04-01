
public class TSequenciaArray implements Sequencia {

	private No v[];
	private No fim;
	private No inicio = v[0];
	private int tamanho;
	int tam = v.length;
	
	
	public TSequenciaArray(No inicio, No fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	@Override
	public int size() {
		
		//return tamanho;
		return tam;
	}

	@Override
	public boolean isEmpty() {
		
		//return tamanho == 0;
		return tam == 0;
	}

	@Override
	public Object elemAtRank(int r) {
		
		return v[r];
	}

	@Override
	public Object replaceAtRank(int r, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertAtRank(int r, Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object removeAtRank(int r, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFirst(No n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLast(No n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public No first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public No last() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public No before(No n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public No after(No n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void replaceElem(No n, Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swapElem(No n, No q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object insertBefore(No n, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object insertAfter(No n, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertFirst(No o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertLast(No o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(No n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public No atRank(int r) {
		No node = null;
		if(r <= (v.length / 2)){
			node = inicio.getProximo();
			for(int i = 0; i < r; i++) {
				node = node.getProximo();
			}
		}else {
			node = fim.getAnterior(); 
		}
		return node;
	}

	@Override
	public Object rankOf(No n) {
		// TODO Auto-generated method stub
		return null;
	}

}
