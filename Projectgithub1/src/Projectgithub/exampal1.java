package Projectgithub;

public class exampal1 {
	public static void main(String[] args) {
		String string = "INDIA";
		int[] frequency = new int[26];
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			frequency[c - 'A']++;
		}
		for (int i = 0; i < 26; i++) {
			if (frequency[i] > 0) {
				char c = (char) (i + 'A');
				System.out.println(c + " occurs " + frequency[i] + " times.");
			}
		}
	}

}
