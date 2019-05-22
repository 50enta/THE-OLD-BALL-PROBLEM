package others;

import java.util.ArrayList;

/**
 *
 * @author cinquenta
 * @author lucilia
 * @author samira
 */
public class Operacoes {
    
    

    /**
     * Verifica se o somatorio dos pesos da lista do grupo 1, equivale ao
     * somatorio dos pesos do grupo 2
     *
     * @param grupo1
     * @param grupo2
     * @return
     */
    public boolean isPesoMaior(ArrayList<Moeda> grupo1, ArrayList<Moeda> grupo2) {
        double somatorioPeso1 = 0;
        double somatorioPeso2 = 0;

        for (Moeda a : grupo1) {
            somatorioPeso1 += a.getPeso();
        }
        for (Moeda b : grupo2) {
            somatorioPeso2 += b.getPeso();
        }
        return somatorioPeso1 > somatorioPeso2;
    }

    /**
     * Verifica se o tamanho das duas listas passadas por parametro corresponde
     *
     * @param grupo1
     * @param grupo2
     * @return
     */
    public boolean isMesmoTamanho(ArrayList<Moeda> grupo1, ArrayList<Moeda> grupo2) {
        return grupo1.size() == grupo2.size();
    }
}
