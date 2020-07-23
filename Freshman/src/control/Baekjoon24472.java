package control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon24472 {
	
	static StringBuilder sb = new StringBuilder();
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void function(int i, int j, int number, int n) throws IOException {
		if(Math.pow(3, number) == n) {
			bw.write("*");
			return;
		}
		if((i / (int)Math.pow(3, number)) % 3 == 1 && (j / (int)Math.pow(3, number)) % 3 == 1) {
			bw.write(" ");
		}else {
			function(i, j, number + 1, n);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				function(i, j, 0, a);
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
