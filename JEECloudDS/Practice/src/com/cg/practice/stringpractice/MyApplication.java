package com.cg.practice.stringpractice;

import java.util.StringTokenizer;

public class MyApplication {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Hellozthisziszme","z");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String a="abc";
		String b="abc";
		System.out.println(a.equals(b));
		System.out.println(a==b);
	}

}
