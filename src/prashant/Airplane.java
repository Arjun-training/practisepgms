package prashant;

import java.io.IOException;

public class Airplane {
	public Airplane() throws IOException{
		System.out.println("Airplane");
		throw new IOException();
	}

}
