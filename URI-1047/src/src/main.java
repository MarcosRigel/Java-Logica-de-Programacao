package src;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tempo, horaInicial, minutoInicial, horaFinal, minutoFinal, momentoInicial, momentoFinal;
        int tempoHoras, tempoMinutos; 
        
        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();
        
        momentoInicial = horaInicial * 60 + minutoInicial;
        momentoFinal = horaFinal * 60 + minutoInicial;
        
        if(momentoInicial < momentoFinal) {
            tempo = momentoFinal - momentoInicial;
        } else {
            tempo = (24 * 60 - momentoInicial) + momentoFinal;
        }
        
        tempoHoras = tempo / 60;
        tempoMinutos = tempo % 60;
        
        System.out.println("O JOGO DUROU " + tempoHoras + " HORA(S) E " + tempoMinutos + " MINUTO(S)");
        
        sc.close();
    }
    
}
