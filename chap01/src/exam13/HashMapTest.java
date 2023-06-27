package exam13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김자바", 90);
		map.put("강자바", 80);
		map.put("박자바", 76);
		map.put("김자바", 95);
		map.put("홍자바", 85);
		
		System.out.println(map.size());
		System.out.println("김자바 : "+ map.get("김자바"));
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : "+ key + " value : " +  value);
		}
		
		map.remove("김자바");
		System.out.println(map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> etryIterator = 
				entrySet.iterator();
		
		while(etryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = etryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : "+ key + " value : " +  value);
		}
		
		System.out.println();
		
		map.clear();
		System.out.println(map.size());
		
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("호랑이","tiger");
		map2.put("표범","leopard");
		map2.put("사자","lion");
		
		map2.replaceAll(new BiFunction<String, String, String>() {
            @Override
            public String apply(String key, String value) {
                return value.toUpperCase();
            }});

	}

}
