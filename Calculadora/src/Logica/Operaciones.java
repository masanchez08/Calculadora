/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author USUARIO
 */
public class Operaciones {
  
    private int a,b;
    private int resultado;
    Suma s=new Suma();
    Resta r=new Resta();
    Multiplicacion m=new Multiplicacion();
    Division d=new Division();
    

    public Operaciones(){
          
        
    }


    public void seta(String A) {
        this.a = Integer.parseInt(A);
    }

   
    public void setB(int b) {
        this.b = b;
    }



    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void Reset(){
        this.a = 0;
        this.b = 0;
        this.resultado = 0;
    }

    public int CambioSigno(String Valor){
        int ops=Integer.parseInt(Valor);
        ops=ops*-1;
        return ops;
    }
    
    
     public void Suma(String Valor){
    this.b= Integer.parseInt(Valor);
    this.resultado=s.sumar(this.a,this.b);
    
     }
    public void Resta(String Valor){
    
    this.b= Integer.parseInt(Valor);
    
    this.resultado=r.restar(this.a,this.b);
    
    }
    public void Multiplicacion(String Valor){
        
    
    this.b= Integer.parseInt(Valor);
         
    this.resultado=m.multiplicar(this.a,this.b);

    }
    public void Division(String Valor){
       
    
    this.b= Integer.parseInt(Valor);
    
    
    this.resultado=d.dividir(this.a,this.b);
        
    }

}

