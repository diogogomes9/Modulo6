package BlocoNotas;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Queue;
import java.util.LinkedList;
public class BlocoNotas {

	private Queue<String> fila;
	public BlocoNotas() {
		fila = new LinkedList<String>();
	}
	public void inserirRecado (String recado) {
		fila.add(recado);
	}
	public void visualizarRecado() {
		System.out.println(fila.element());
		fila.remove();
	}
	public int getTotalRecados() {
		return fila.size();
	}

	
	public static void main(String[] args) {
		
		BlocoNotas blocoNotas = new BlocoNotas();
		Scanner scanner = new Scanner (System.in);
		int opcao = 0;
		String recado;
		do {
			System.out.println("1 - Inserir Recado");
			System.out.println("2 - Visualizar Recado");
			System.out.println("Existem atualmente " + blocoNotas.getTotalRecados() + " recados!");
			System.out.println("Insira a sua opção:" );
			opcao = scanner.nextInt();
			System.out.println("");
			switch (opcao) {
			case 1: recado = JOptionPane.showInputDialog("Insira o seu recado: ");
			blocoNotas.inserirRecado(recado);
			break;
			case 2: System.out.println("Primeiro recado");
			blocoNotas.visualizarRecado();
			System.out.println("");
			}
		} while ((opcao>0) && (opcao<3));

	}

}
