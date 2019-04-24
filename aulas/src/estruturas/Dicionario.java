package estruturas;

import java.util.*;

public class Dicionario {

   public static void main(String args[]) {
   
      // Criação do Hashmap
      HashMap<String, Double> hm = new HashMap<String, Double>();
      
      // Put elements to the map
      hm.put("Zara", new Double(3434.34));
      hm.put("Mahnaz", new Double(123.22));
      hm.put("Ayan", new Double(1378.00));
      hm.put("Daisy", new Double(99.22));
      hm.put("Qadir", new Double(-19.08));
      
      // Pega o conjunto de entradas
      Set set = hm.entrySet();
      //System.out.println(set);
      
      
      // Recupera o iterator
      Iterator i = set.iterator();
      
      // Mostra os elementos
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      
      // Deposita 1000 na conta de Zara
      double balance = hm.get("Zara");
      hm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " + hm.get("Zara"));
     
   }
}