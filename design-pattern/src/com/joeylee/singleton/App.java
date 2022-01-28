package com.joeylee.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Settings settings = Settings.getInstance();
		Settings settings1 = null;


		try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
			out.writeObject(settings);
		}

		try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
			settings1 = (Settings) in.readObject();
		}

		System.out.println(settings == settings1);
	}
}
