package exercicio3;

import java.util.*;
/**
 *
 * @author JOSIANEMAGALHAES
 */

public class Exercicio3 {
    private HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();

    public void adicionarIngrediente(String ingrediente, Integer qtde)
    {
            
            ingredientes.put(ingrediente, qtde);
    }

        
    public int getQtdeIngredientes() {
            return ingredientes.size(); 
    }

        // retorna os ingredientes para que possa fazer a soma dos ingredientes
        public HashMap<String, Integer> getIngredientes()
        {
            return ingredientes;
        }
}

