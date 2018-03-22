
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
		return tamanho == 0;
	}

	@Override
	public Object elemAtRank(int r) {
		No no = atRank(r);
		return no;
	}

	@Override
	public Object replaceAtRank(int r, Object o) {
		No no = atRank(r);
		Object antigoElemento = no.getElemento();
		no.setElemento(o);
		return antigoElemento;
	}

	@Override
	public void insertAtRank(int r, Object o) {
		No antigo = atRank(r);
		No novo = null;
		novo.setProximo(antigo.getProximo());
		novo.setAnterior(antigo);
		novo.setElemento(o);
		tamanho ++;
	}

	@Override
	public Object removeAtRank(int r, Object o) {
		No no = atRank(r);
		Object NoRemovido = no.getElemento();
		remove(no);
		return NoRemovido;
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
		Object novo = new Object();
		novo = n.getElemento();
		n.setElemento(o);	
	}

	@Override
	public void swapElem(No n, No q) {
		Object novo = new Object();
		novo = n.getElemento();
		n.setElemento(q.getElemento());
		q.setElemento(novo);
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
		return v;
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
		No novo = null;
		No proximo = inicio.getProximo();
		novo.setElemento(o);
		novo.setAnterior(inicio);
		novo.setProximo(proximo);
	}

	@Override
	public void insertLast(No o) {
		No novo = null;
		No anterior = fim.getAnterior();
		novo.setElemento(o);
		novo.setProximo(fim);
		novo.setAnterior(anterior);
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
