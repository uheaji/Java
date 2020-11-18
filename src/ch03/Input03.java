package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String data = br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
