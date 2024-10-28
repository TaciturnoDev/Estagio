package InterruptorLampada;

public class InterruptorLampada {
    public static void main(String[] args) {
        // Estados iniciais dos interruptores (todos desligados)
        boolean interruptor1 = false;
        boolean interruptor2 = false;
        boolean interruptor3 = false;
        
        // Estados iniciais das lâmpadas (todas desligadas e frias)
        boolean lampada1Ligada = false;
        boolean lampada1Quente = false;
        
        boolean lampada2Ligada = false;
        boolean lampada2Quente = false;
        
        boolean lampada3Ligada = false;
        boolean lampada3Quente = false;

        // Passo 1: Ligue o interruptor 1 e deixe-o ligado por um tempo
        interruptor1 = true;
        lampada1Ligada = true;
        lampada1Quente = true; // Simulando a lâmpada ficando quente após algum tempo

        // Passo 2: Desligue o interruptor 1 e ligue o interruptor 2
        interruptor1 = false;
        lampada1Ligada = false;
        
        interruptor2 = true;
        lampada2Ligada = true; // Lâmpada ligada corresponde ao interruptor 2

        // Simula o processo de ida à sala e observação das lâmpadas
        System.out.println("Observação na sala das lâmpadas:");
        
        if (lampada2Ligada) {
            System.out.println("A lâmpada que está acesa pertence ao interruptor 2.");
        }
        
        if (lampada1Quente && !lampada1Ligada) {
            System.out.println("A lâmpada que está apagada, mas quente, pertence ao interruptor 1.");
        }
        
        System.out.println("A lâmpada que está apagada e fria pertence ao interruptor 3.");
    }
}
