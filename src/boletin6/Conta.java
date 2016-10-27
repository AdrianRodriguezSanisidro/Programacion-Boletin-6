package boletin6;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Conta {
    private String nome;
    private String nConta;
    private double saldo;
    public Conta(){
   
    }
    public Conta(String nome,String nConta,double saldo){
        this.nome=nome;
        this.nConta=nConta;
        this.saldo=saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean ingreso(){
       double aumento= Double.parseDouble(JOptionPane.showInputDialog("Dinero a ingresar "));
       if (aumento>=0){
           JOptionPane.showMessageDialog(null,"A cantidade e de "+(saldo+aumento));
       return true;}
       else
       return false;
    }
    public boolean reintegro(){
        double diminuir =Double.parseDouble(JOptionPane.showInputDialog("Dinero a retirar"));
        if (diminuir<saldo&&diminuir>=0){
             JOptionPane.showMessageDialog(null,"A cantidade e de "+(saldo-diminuir));
             return true;}
        else 
            return false;
    }
    public void visualizar(){
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nnConta: "+nConta+"\nsaldo: "+saldo);
    }
    public void transferencia(Conta contaDestino){
        double aumento=Double.parseDouble(JOptionPane.showInputDialog("Dinero a transferir"));
               if(this.saldo>=aumento){
            contaDestino.setSaldo(contaDestino.saldo+aumento);
            this.saldo=(this.saldo-aumento);
        }
                 
    }
}
