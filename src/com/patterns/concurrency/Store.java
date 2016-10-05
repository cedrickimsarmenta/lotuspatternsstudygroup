package com.patterns.concurrency;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Store {
	
	private List<String> storeContents =new ArrayList<String>();
	private static File file = new File("store.txt");
	private static Store instance = null;
	
	private Store(){
		
	}
	
	public static Store getInstance(){
		if(instance == null){
			instance = new Store();
		}
		return instance;
	}
	static{
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	public  void getDataFromFile() throws IOException, InterruptedException{
		System.out.println("Getting content from File by " +Thread.currentThread().getName());
		
		synchronized (file) {
		
			FileReader fr = new FileReader(file.getAbsoluteFile());
			BufferedReader bw = new BufferedReader(fr);
			String l;
			int count = 0;
			while( (l = bw.readLine())!= null){
				storeContents.add(l +" " + Thread.currentThread().getName());
				count++;
			}
			System.out.println("Found "+ count +" new text in file "  +Thread.currentThread().getName());
			bw.close();
			Thread.sleep(15000);
			clearFile();
		}
	}
	
	public  void writeDataToFile(String value) throws IOException, InterruptedException{
		
		synchronized (file) {
			System.out.println("writting:" + value);
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			fw.write(value);
			bw.close();
			fw.close();
			System.out.println("Finish writing " + value);
			Thread.sleep(2000);			
		}
		
	}
	
	private void clearFile() throws IOException{
		System.out.println("Deleting text in file " +Thread.currentThread().getName());
		FileOutputStream writer = new FileOutputStream(file);
		writer.write(("").getBytes());
		writer.close();
	}

	public List<String> getStoreContents() {
		return storeContents;
	}

	public void setStoreContents(List<String> storeContents) {
		this.storeContents = storeContents;
	}
}
