import java.util.Scanner;
public class Main {

	//case 4:
	//	break;
	public static void menuUI(){
        System.out.println("TAD SEQUENCIA\n====================="
                + "\nEscolha uma opçãoo:\n----------------------\n"
                + "1 - Ver número de elementos na sequencia(size)\n"
                + "2 - Ver se a sequencia está vazia(isEmpty)\n"
                + "3 - Inserir elemento em um rank(insertAtRank)\n"
                + "4 - Ver elemento em um rank(elemAtRank)\n"
                + "5 - Trocar elemento por outro em rank selecionado(replaceAtRank)\n"
                + "6 - Remove elemento de um rank(removeAtRank)\n"
                + "7 - (isFirst)\n"
                + "8 - (isLast)\n"
                + "9 - (first)\n"
                + "10 - (last)\n"
                + "11 - (before)\n"
                + "12 - (after)\n"
                + "13 - (replaceElem)\n"
                + "14 - (swapElem)\n"
                + "15 - (insertBefore)\n"
                + "16 - (insertAfter)\n"
                + "17 - (insertFirst)\n"
                + "18 - (insertLast)\n"
                + "19 - (remove)\n"
                + "20 - (atRank)\n"
                + "21 - (rankOff)\n"
                + "0 - SAIR\n\n>>> ");
        
    }
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		TSequencia seq = new TSequencia();
		
		int resposta = -1;
		while(resposta!=0) {
			menuUI();
			Scanner zoy = new Scanner (System.in);
			resposta = zoy.nextInt();
			switch(resposta) {
				case 1:
					System.out.println("Você tem "+seq.size()+" elementos na sequencia!");
					break;
				case 2:
					if(seq.isEmpty() == true) {
						System.out.println("Sim, sequencia vazia.");
					}else {
						System.out.println("Não, a sequencia contém "+seq.size()+" elementos");
					}
					break;
				case 3:
					System.out.println("Digite o rank em que você quer enserir o elemento:");
					int r = ler.nextInt();
					System.out.println("Digite o elemento:");
					Object o = ler.next();
					seq.insertAtRank(r, o);
					
					break;
				case 4:
					System.out.println("Digite o rank que contém o elemento que você quer ver");
					int r4 = ler.nextInt();
					seq.elemAtRank(r4);
					
					break;
				case 5:
					System.out.println("Digite o rank em que você quer trocar o elemento por outro:");
					int r5 = ler.nextInt();
					System.out.println("Digite o elemento:");
					Object o5 = ler.next();
					seq.replaceAtRank(r5, o5);
					break;
				case 6: 
					System.out.println("Digite o rank em que você quer remover o elemento:");
					int r6 = ler.nextInt();
					System.out.println("Digite o elemento que assumirá sua posição:");
					Object o6 = ler.next();
					seq.removeAtRank(r6, o6);
					
					break;
				case 7: 
					System.out.println("Digite o isFirst:");
					No no7 = new No();
					if(seq.isFirst(no7) == true) {
						System.out.println("É isFirst");
					}else {
						System.out.println("Não é isFirst");
					}
				
					break;
				case 8: 
					System.out.println("Digite o isLast:");
					No no8 = new No();
					if(seq.isLast(no8) == true) {
						System.out.println("É isLast");
					}else {
						System.out.println("Não é isLast");
					}
					break;
				case 9: 
					System.out.println("First: " + seq.first());
					break;
				case 10: 
					System.out.println("Last: " + seq.last());
					break;
				case 11: 
					System.out.println("Digite o No para receber o anterior");
					No no11 = new No();
					System.out.println("Before: " + seq.before(no11));
					break;
				case 12: 
					System.out.println("Digite o No para receber o proximo");
					No no12 = new No();
					System.out.println("Before: " + seq.after(no12));
					break;
				case 13: 
					System.out.println("Digite o No para realizar replaceElem");
					No no13 = new No();
					System.out.println("Digite o elemento:");
					Object o13 = ler.next();
					seq.replaceElem(no13, o13);
					break;
				case 14: 
					System.out.println("Digite o No para realizar swapElem");
					No no14 = new No();
					System.out.println("Digite o No q:");
					No nq14 = new No();
					seq.swapElem(no14, nq14);
					break;
				case 15: 
					System.out.println("Digite o No para realizar insertBefore:");
					No no15 = new No();
					System.out.println("Digite o elemento:");
					Object o15 = ler.next();
					seq.insertBefore(no15, o15);
					break;
				case 16: 
					System.out.println("Digite o No para realizar o insertAfter:");
					No no16 = new No();
					System.out.println("Digite o elemento:");
					Object o16 = ler.next();
					seq.insertAfter(no16, o16);
					break;
				case 17: 
					System.out.println("Digite o No para realizar o insertFisrt:");
					No no17 = new No();
					seq.insertFirst(no17);
					break;
				case 18: 
					System.out.println("Digite o No para realizar o insertLast:");
					No no18 = new No();
					seq.insertLast(no18);
					break;
				case 19: 
					System.out.println("Digite o No para realizar o remove:");
					No no19 = new No();
					seq.remove(no19);
					break;
				case 20: 
					System.out.println("Digite o rank para realizar o atRank:");
					int r20 = ler.nextInt();
					seq.atRank(r20);
					break;
				case 21: 
					System.out.println("Digite o No para realizar o rankOf:");
					No no21 = new No();
					seq.rankOf(no21);
					break;
					
				
				
				case 0:
					System.out.println("FIM DA SEQUENCIA\n=======================================");
					break;
				default:
					System.out.println("Escolha uma opção válida!");
			}
		}

	}

}
