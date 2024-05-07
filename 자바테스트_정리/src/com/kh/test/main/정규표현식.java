package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Á¤±ÔÇ¥Çö½Ä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇÑ±ÛÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
		String put = sc.nextLine();
		
		// ¹İº¹ÇÏ´Â ÆĞÅÏÀÌ °¡-ÆR À¸·Î ÇÑ±ÛÀÌ¶ó¸é
		if(Pattern.matches("^[°¡-ÆR]*$", put)) {
			System.out.println("ÀÔ·ÂÇÑ ¹®ÀÚ¿­Àº ÇÑ±ÛÀÔ´Ï´Ù.");
		} else {
			System.out.println("ÇÑ±Û¸¸ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		}
		
		// ÀüÈ­¹øÈ£ 0-9 ÀÔ·ÂÇÏ´Â ½ºÄ³³Ê ¸¸µé¾îº¸±â
		System.out.print("ÀüÈ­¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		String pN = sc.nextLine(); // Pattern.matches(¹®ÀÚ¿­ Çü½ÄÀ¸·Î °ªÀ» ¹Ş±â ¶§¹®¿¡ String)
		
		if(Pattern.matches("^[0-9]*$", pN)) {
			System.out.println("ÀÔ·ÂÇÑ ¹®ÀÚ¿­Àº ÀüÈ­¹øÈ£ Çü½ÄÀÔ´Ï´Ù.");
			// Integer.parseInt(pN); ¢¸ String À» Integer ·Î °­Á¦ Çüº¯È¯ ÇØÁÙ ¼öµµ ÀÖ´Ù.
		} else {
			System.out.println("ÀÔ·ÂÇÑ ¹®ÀÚ¿­Àº ÀüÈ­¹øÈ£ Çü½ÄÀÌ ¾Æ´Õ´Ï´Ù.");
		}
	}
}
