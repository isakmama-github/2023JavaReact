package practice.ex06;

import java.util.HashMap;

public class HashMapAnimal {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("호랑이", "tiger");
		map.put("표범", "leopard");
		map.put("사자", "lion");
		
		System.out.println("변경 전 : " + map);
		
		
//		Set<String> ms = map.keySet();
//		for (String str : ms) {
//			map.replace(str, map.get(str).toUpperCase());
//		}
		
		
		
//		map.replaceAll(new BiFunction<String, String, String>() {
//            @Override
//            public String apply(String key, String value) {
//                return value.toUpperCase();
//            }
//        });
		
		
		
		map.replaceAll((s1, s2) -> s2.toUpperCase());
		
		System.out.println("변경 후 : " + map);
		
	}
}
