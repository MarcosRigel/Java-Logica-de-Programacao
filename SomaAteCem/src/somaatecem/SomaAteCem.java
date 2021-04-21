package somaatecem;

public class SomaAteCem {
    
    public static void main(String[] args) {
        int numero, contador;
        numero = 0;
        contador = 1;
        
        while(contador <= 100) {
            numero = numero + contador;
            contador++;
        }
        System.out.println("A resposta é: " + numero);
    }
    
}
