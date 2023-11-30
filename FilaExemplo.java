/*13) implemente os métodos  enfileirar e desenfileirar explicando cada linha no codigo. */
import java.util.*;

public class FilaExemplo {
    private LinkedList<Integer> fila; // Declaração da estrutura de dados que representa a fila
    
    public FilaExemplo() {
        fila = new LinkedList<>(); // Inicialização da fila como uma LinkedList vazia
    }
    
    // Método para enfileirar um elemento na fila
    public void enfileirar(int elemento) {
        fila.add(elemento); // Adiciona o elemento ao final da lista, simulando a operação de enfileirar
    }
    
    // Método para desenfileirar um elemento da fila
    public int desenfileirar() {
        if (fila.isEmpty()) { // Verifica se a fila está vazia
            throw new NoSuchElementException(); // Lança uma exceção caso a fila esteja vazia
        }
        int elementoDesenfileirado = fila.removeFirst(); // Remove e retorna o primeiro elemento da lista (início da fila)
        return elementoDesenfileirado;
    }
    
    public static void main(String[] args) {
        FilaExemplo filaExemplo = new FilaExemplo(); // Criação de uma instância da classe FilaExemplo
        
        // Enfileirando alguns elementos na fila
        filaExemplo.enfileirar(10);
        filaExemplo.enfileirar(20);
        filaExemplo.enfileirar(30);
        
        // Desenfileirando e imprimindo os elementos
        System.out.println(filaExemplo.desenfileirar()); // Saída: 10
        System.out.println(filaExemplo.desenfileirar()); // Saída: 20
        System.out.println(filaExemplo.desenfileirar()); // Saída: 30
    }
}
