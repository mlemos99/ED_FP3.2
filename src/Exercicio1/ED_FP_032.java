/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Utilizador
 */
public class ED_FP_032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Calculadorapostfix c=new Calculadorapostfix();
    System.out.println(c.calculate("3 4 + 2 *"));
    System.out.println(c.calculate("3 + + 2 *"));
    System.out.println(c.calculate("7 4 -3 * 1 5 + / *"));
    
    System.out.println(c.calculate("1 2 -"));
        System.out.println(c.calculate("1 2 /"));
    }
    
}
