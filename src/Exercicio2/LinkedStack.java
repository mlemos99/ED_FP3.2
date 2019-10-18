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
public class LinkedStack<T> implements StackADT<T> {

     private LinearNode<T> head;
    private int size;

    public LinkedStack() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void push(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head); //novoNode vai ser atribuido a referencia do head
            head = newNode; //o novoNode passa a primeiro elemento
        }
        size++;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public T pop() throws EmptyCollectionException {
        LinearNode<T> aux= head;
        if (isEmpty()) {
            throw  new EmptyCollectionException("stack");
        }
        
            head = head.getNext(); //remove o nó a cabeça
            this.size--;

        
        return aux.getElemento();
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (this.isEmpty()) {
             throw  new EmptyCollectionException("stack");
        }
        return head.getElemento();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String str = "";
        int i = 0;
        LinearNode<T> c = head;
        while(i != size) {
            str = str + c.getElemento() + " ";
            c = c.getNext();
            i++;
        }

        return str + "";

    }
}
