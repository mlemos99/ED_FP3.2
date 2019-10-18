/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author Utilizador
 */
public class LinkedStack<T> implements Exercicio2.StackADT<T> {
    private LinearNode<T> head;//referencia para a primeira
   
    private int count;//contador de elementos da lista

/**
 * Metodo construtor para uma lista vazia
 */
    public LinkedStack() {
        head = null;
        count = 0;
    }

    public int getCount() {
        return count;
    }
/**
 * Metodo para verificar se a lista esta vazia
 * retorna true se estiver vazia , false se estiver cheia
 * @return bollean que indica se a lista esta cheia ou vazia
 */
    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    /**
     * Metodo que adiciona um novo nó a lista
     * @param element valor a acrescentar
     */
     @Override
    public void push(T element) {
       LinearNode<T> nova = new LinearNode<>(element);
       LinearNode<T> aux=head;
        if (this.head == null) {
            head = nova;
           
        } else {


            nova.setNext(head);
            head=nova;

           
        }

        this.count++;
    }
 

    /**
     * Metodo que remove o elemento armazenado no primeiro nó da lista
     */
    @Override
    public T pop() throws EmptyCollectionException {
        
        
        if (isEmpty()) {
             throw new EmptyCollectionException("Stack");
        } else {
         
            
            this.head=head.getNext();

           
            
            this.count--;
            return this.head.getElemento();
        }
         

    }
    @Override
     public T peek() throws EmptyCollectionException{
        if(this.isEmpty()){
             throw new EmptyCollectionException("Stack");
        }
        return this.head.getElemento();
    }
 
   
   

      
    public int size() {
        return count;
    }
    
    
    
    
    
    @Override
     public String toString() {
        int i=0;
         String str="[";
        LinearNode<T> lista=head;
        while(i!=count){
          str=str+lista.getElemento()+" ";
            lista=lista.getNext();
            i++;
     }
        
        
        return str+"]";
        
    }
}
