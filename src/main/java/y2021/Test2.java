package y2021;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<String,String> premiumPhone = new HashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        
        System.out.println("Hiiii");
        Iterator<String> iterator = premiumPhone.keySet().iterator();
        System.out.println("got Iterator No error : ");
        premiumPhone.put("Sony", "Xperia Z");
        System.out.println("Still No error even after structural change: ");
        while (iterator.hasNext())
        {
        	System.out.println("no error but when we pull out the next item, gives error");
          //  System.out.println(premiumPhone.get(iterator.next()));
        	System.out.println(iterator.next());
            
        }

	}

}
