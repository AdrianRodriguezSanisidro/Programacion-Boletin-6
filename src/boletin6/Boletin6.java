package boletin6;
/**
 *
 * @author Adry
 */
public class Boletin6 {

    public static void main(String[] args) {
        Conta c1=new Conta();
        c1.setNome("Adrian");
        c1.setSaldo(10000);
        c1.setnConta("1234567890A");
        c1.visualizar();
        Conta c2=new Conta();
        c2.setNome("Sandra");
        c2.setSaldo(12000);
        c2.setnConta("1234567890S");
        c2.visualizar();
        c1.transferencia(c2);
        c1.visualizar();
        c2.visualizar();
    }
    
}