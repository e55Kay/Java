package com.comcast.strings;

public class window {

	public static void main(String[] args) {
		String str = "timetopractice";
		String p = "toc";
		int k = 0, s = -1, e = -1;
		for(int i = 0; i < str.length() - p.length() + k + 1; i++) {
			if (k == p.length()) {
				e = i;
				break;
			}
			if(str.charAt(i) == p.charAt(k)) {
				if (k == 0)
					s = i;
				++k;
			}
		}
		
		System.out.println(s + " " + e);
	}

}
