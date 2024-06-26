# Implementando uma LinkedList na Unha

## Descrição do Projeto
Este projeto implementa uma estrutura de dados do tipo **Lista Ligada** (**LinkedList**) em Java. A implementação inclui funcionalidades essenciais para manipulação de listas ligadas, permitindo adição, remoção, acesso e modificação de elementos, além de outras operações úteis.

## Sumário
1. [Estrutura do Código](#estrutura-do-codigo)
   - [Classe LinkedList](#classe-linkedlist) 
   - [Atributos](#atributos)
   - [Classe Interna Node](#classe-interna-node) 
   - [Construtor](#construtor) 
   - [Métodos](#metodos)
2. [Funcionalidades](#funcionalidades)
   - [Adicionar Elementos](#adicionar-elementos)
   - [Remover Elementos](#remover-elementos)
   - [Acessar e Modificar Elementos](#acessar-e-modificar-elementos)
   - [Outras Operações](#outras-operacoes)
3. [Exemplo de Uso](#exemplo-de-uso)
4. [Contribuindo com o Projeto](#contribuindo-com-o-projeto)
5. [Considerações Finais](#consideracoes-finais)

## <a id="estrutura-do-codigo">Estrutura do Código</a>
### <a id="classe-linkedlist">Classe LinkedList</a>
A classe LinkedList é a estrutura principal que contém todos os métodos e atributos necessários para gerenciar a lista ligada.

### <a id="atributos">Atributos</a>
- `private Node head`: Referência para o primeiro nó da lista.
- `private Node tail`: Referência para o último nó da lista.
- `private int size`: Mantém o tamanho atual da lista.

### <a id="classe-interna-node">Classe Interna `Node`</a>
A classe Node representa um nó da lista e contém:
- `String data`: O dado armazenado no nó.
- `Node next`: Referência para o próximo nó na lista.

### <a id="construtor">Construtor</a>
- `public LinkedList(String data)`: Inicializa a lista com um único elemento.

### <a id="metodos">Métodos</a>
* `public void getFirst()`: Exibe o primeiro elemento da lista.
* `public void getLast()`: Exibe o último elemento da lista.
* `public void getSize()`: Exibe o tamanho atual da lista.
* `public void clear()`: Limpa a lista.
* `public void printList()`: Imprime todos os elementos da lista.
* `public void addFirst(String data)`: Adiciona um elemento no início da lista.
* `public void addLast(String data)`: Adiciona um elemento no final da lista.
* `public Node removeFirst()`: Remove o primeiro elemento da lista.
* `public Node removeLast()`: Remove o último elemento da lista.
* `public Node get(int index)`: Retorna o nó na posição especificada.
* `public boolean insert(int index, String data)`: Insere um elemento em uma posição específica.
* `public boolean set(int index, String data)`: Altera o valor de um elemento em uma posição específica.
* `public Node remove(int index)`: Remove o elemento em uma posição específica.

## <a id="funcionalidades">Funcionalidades</a>
### <a id="adicionar-elementos">Adicionar Elementos</a>
* No início da lista: `addFirst(String data)`
* No final da lista: `addLast(String data)`
* Em uma posição específica: `insert(int index, String data)`

### <a id="remover-elementos">Remover Elementos</a>
* Do início da lista: `removeFirst()`
* Do final da lista: `removeLast()`
* De uma posição específica: `remove(int index)`
   
### <a id="acessar-e-modificar-elementos">Acessar e Modificar Elementos</a>
* Obter elemento por índice: `get(int index)`
* Modificar elemento por índice: `set(int index, String data)`

### <a id="outras-operacoes">Outras Operações</a>

* Imprimir todos os elementos: `printList()`
* Obter o primeiro elemento: `getFirst()`
* Obter o último elemento: `getLast()`
* Obter o tamanho da lista: `getSize()`
* Limpar a lista: `clear()`

## <a id="exemplo-de-uso">Exemplo de Uso</a>
```
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("Primeiro");

        list.addFirst("Novo Primeiro");
        list.addLast("Último");

        list.printList();  // Imprime todos os elementos da lista

        list.getFirst();   // Imprime o primeiro elemento
        list.getLast();    // Imprime o último elemento
        list.getSize();    // Imprime o tamanho da lista

        list.removeFirst(); // Remove o primeiro elemento
        list.removeLast();  // Remove o último elemento

        list.insert(1, "Segundo"); // Insere um elemento na posição 1
        list.set(0, "Alterado");   // Altera o primeiro elemento
        list.remove(1);            // Remove o elemento na posição 1

        list.clear(); // Limpa a lista
    }
}
```

## <a id="contribuindo-com-o-projeto">Contribuindo com o Projeto Finais</a>
Para contribuir com o projeto, siga os passos abaixo:
1. **Fork este repositório**: Clique no botão de fork no GitHub para criar uma cópia do repositório na sua conta.
2. **Clone o repositório**: Clone o repositório forkado para a sua máquina local.
   ```
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
3. **Crie uma nova branch**: Crie uma branch para trabalhar nas suas mudanças.
   ```
   git checkout -b minha-nova-funcionalidade
   ```
4. **Faça as suas mudanças**: Implemente as suas melhorias ou correções.
5. **Commit as suas mudanças**: Faça commit das suas mudanças com uma mensagem descritiva.
   ```
   git commit -m "Adiciona nova funcionalidade X"
   ```
6. **Envie as mudanças para o seu fork**: Envie as suas mudanças para o repositório forkado.
   ```
   git push origin minha-nova-funcionalidade
   ```
7. **Abra um Pull Request: No GitHub**, abra um Pull Request do seu fork para o repositório original.

## <a id="consideracoes-finais">Considerações Finais</a>
Esta implementação da LinkedList em Java é um exemplo didático que demonstra os conceitos básicos de listas ligadas. Pode ser estendida e melhorada para incluir mais funcionalidades e otimizações conforme necessário. Contribuições são bem-vindas para tornar este projeto ainda mais robusto e completo.