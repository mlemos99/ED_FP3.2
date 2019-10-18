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
public class Calculadorapostfix {
    private ArrayStack<Double> a;

    public Calculadorapostfix() {
        this.a = new ArrayStack<>();
    }

    public Calculadorapostfix(int capacidade) {
        this.a = new ArrayStack<>(capacidade);
    }
    
    public Double calculate(String n) throws EmptyCollectionException{
        
        String[] parts=n.split(" ");
        
        for(int i=0;i<parts.length;i++){
            
            switch(parts[i]){
            case "+":
                if(a.size()<2){
                    System.out.println("Nao tem 2 elementos");
                    return null;
                }
                else{
                double oper2=a.pop();
                double oper1=a.pop();
                a.push(oper2+oper1);
                }
                break;
            case "-":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return null;
                }
                else{
                double oper2=a.pop();
                double oper1=a.pop();
                a.push(oper1-oper2);
                }
                break;
            case "/":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return null;
                }
                else{
                double oper2=a.pop();
                double oper1=a.pop();
                a.push(oper1/oper2);
                }
                break;
            case "*":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return null;
                }
                else{
                double oper2=a.pop();
                double oper1=a.pop();
                a.push(oper2*oper1);
                }
                break;
            default :
               if(isDouble(parts[i])){
                    a.push(Double.parseDouble(parts[i]));
                }else{
                return null;
                }
                
                break;
            
            }
        }
            
        return a.peek();
        
        
    }
      boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
