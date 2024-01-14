package siraNo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Queue<String> q=new LinkedList<>();
		int sira=1;
		while (sira<=3) {
			sira++;
			System.out.println("isim giriniz");
			String name=in.next();
			q.add(name);
		}
		int siraGoster=1;
		while(!q.isEmpty()) {
			
			System.out.println(siraGoster);
			System.out.println("işlem yap = 0");
			int islem=in.nextInt();
			if(islem==0) {
				System.out.println(q.poll());
			}
			siraGoster++;
		}

	}
}
