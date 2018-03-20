
public class TSequencia implements Sequencia {
	
	private No inicio;
	private No fim;
	private int tamanho;

	@Override
	public int size() {
		return tamanho;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object elemAtRank(int r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object replaceAtRank(int r, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object insertAtRank(int r, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAtRank(int r, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFirst(No n) {
		return n.getElemento() == inicio.getProximo();
	}

	@Override
	public boolean isLast(No n) {
		return n.getElemento() == fim.getAnterior();
	}

	@Override
	public No first() {
		return inicio.getProximo();
	}

	@Override
	public No last() {
		return fim.getAnterior();
	}

	@Override
	public No before(No n) {
		return n.getAnterior();
	}

	@Override
	public No after(No n) {
		return n.getProximo();
	}

	@Override
	public void replaceElem(No n, Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swapElem(No n, Object q) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("null")
	@Override
	public Object insertBefore(No n, Object o) {
		No v = null;
		v.setElemento(o);
		v.setAnterior(n);
		v.setAnterior(n.getAnterior());
		(n.getAnterior()).setAnterior(v);
		n.setAnterior(v);
		return null;
	}

	@SuppressWarnings("null")
	@Override
	public Object insertAfter(No n, Object o) {
		No v = null;
		v.setElemento(o);
		v.setAnterior(n);
		v.setProximo(n.getProximo());
		(n.getProximo()).setProximo(v);
		n.setProximo(v);
		return v;
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
		Object t = n.getElemento();
		(n.getAnterior()).setProximo(n.getProximo());
		(n.getProximo()).setAnterior(n.getAnterior());
		n.setAnterior(null);
		n.setProximo(null);
		tamanho --;
		return t;
	}

	@SuppressWarnings("null")
	@Override
	public No atRank(int r) {
		No node = null;
		if(r <= size()/2) {
			node = inicio.getProximo();
			for(int i = 0; i < r; i++) {
				node = node.getProximo();
			}
		}else {
			node = fim.getAnterior();
			for(int i = 0; i < size()-r-1; i++) {
				node = node.getAnterior();
			}
		}
		return node;
	}

	@SuppressWarnings("null")
	@Override
	public Object rankOf(No n) {
		No node = null;
		node = inicio.getProximo();
		int r = 0;
		while(node != n && n != fim) {
			n.getProximo();
			r++;
		}
		return r;
	}

}
