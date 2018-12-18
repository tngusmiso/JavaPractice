package java2.finalExam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam12 {
	public static String solution(List<String> list) {
		Map<String, Integer> map = new HashMap<>();
        for (String key : list) {
            Integer count = map.get(key);
            if (count == null) count = 0;
            ++count;
            map.put(key, count);
        }
        
        String maxKey = list.get(0);
        for(String key: list) {
        	if(map.get(key)>map.get(maxKey)) {
        		maxKey=key;
        	}
        }
        return maxKey;
	}

	public static void main(String[] args) {
		List<String> a1 = Arrays.asList("a", "a", "b", "a", "c", "d", "e", "b", "e");
		List<String> a2 = Arrays.asList("b", "a", "d", "a", "a", "b", "i", "b", "b");
		System.out.println(solution(a1));
		System.out.println(solution(a2));
	}
}