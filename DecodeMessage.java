public class DecodeMessage {
    
}
class Solution {
    

	public String decodeMessage(String key, String message) {
        int[] p = new int[26];

		StringBuilder c = new StringBuilder();

		for (int i = 0; i < key.length(); i++) {
			if (key.charAt(i) !=' ') {
				if (p[key.charAt(i) - 'a'] != 1)
					c.append(key.charAt(i));
				p[key.charAt(i) - 'a'] = 1;
			}
		}

		String a = "abcdefghijklmnopqrstuvwxyz";

		String c1 = c.toString();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			char cc = message.charAt(i);
			if (cc != ' ') {
				int id = c1.indexOf(cc);
				sb.append(a.charAt(id));
			} else {
				sb.append(cc);
			}
		}
		return sb.toString();
	}
}
