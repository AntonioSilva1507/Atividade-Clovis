/*12) Implemente os métodos empilhar e desempilhar explicando cada linha. */
import java.util.*;

public class PilhaExemplo {
    private ArrayList<Integer> pilha; // Declaração da estrutura de dados que representa a pilha
    
    public PilhaExemplo() {
        pilha = new ArrayList<>(); // Inicialização da pilha como um ArrayList vazio
    }
    
    // Método para empilhar um elemento na pilha
    public void empilhar(int elemento) {
        pilha.add(elemento); // Adiciona o elemento ao final da lista, simulando a operação de empilhar
    }
    
    // Método para desempilhar um elemento da pilha
    public int desempilhar() {
        if (pilha.isEmpty()) { // Verifica se a pilha está vazia
            throw new EmptyStackException(); // Lança uma exceção caso a pilha esteja vazia
        }
        int elementoDesempilhado = pilha.remove(pilha.size() - 1); // Remove e retorna o último elemento da lista (topo da pilha)
        return elementoDesempilhado;
    }
    
    public static void main(String[] args) {
        PilhaExemplo pilhaExemplo = new PilhaExemplo(); // Criação de uma instância da classe PilhaExemplo
        
        // Empilhando alguns elementos na pilha
        pilhaExemplo.empilhar(10);
        pilhaExemplo.empilhar(20);
        pilhaExemplo.empilhar(30);
        
        // Desempilhando e imprimindo os elementos
        System.out.println(pilhaExemplo.desempilhar()); // Saída: 30
        System.out.println(pilhaExemplo.desempilhar()); // Saída: 20
        System.out.println(pilhaExemplo.desempilhar()); // Saída: 10
    }
}
