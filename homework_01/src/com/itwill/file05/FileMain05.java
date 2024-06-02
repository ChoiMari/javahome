package com.itwill.file05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.file04.Product;

public class FileMain05 {

	public static void main(String[] args) {
		//파일에 쓸(write) 더미 데이터
		ArrayList<Product> list = new ArrayList<>();
		for(int i = 0 ;i < 1_000_000; i++) {
			list.add(new Product(i,"name_" + i,i));
		}
		System.out.println("size = " + list.size()); 
		
		// ArrayList를 저장하는 파일 이름
		String fileName = "data/product_list.dat";
		
		//1. product 타입 1,000,000개를 저장하는 ArrayList를 파일 쓰기(내보내서 저장)
		//FOS, BOS, OOS을 이용하기
		try( //자동으로 close(); 해줌 - close();시 flush(); 자동으로 됨. 
				FileOutputStream fos = new FileOutputStream(fileName);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
		) {
			oos.writeObject(list);
			System.out.println("1,000,000개 list 파일 저장 성공");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//2. 파일에서 객체를 읽어서 ArrayList<Product>로 변환하기
		//FIS, BIS, OIS를 이용하기
		try(
				FileInputStream fis = new FileInputStream(fileName);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);
		){
			 ArrayList<Product> p =  (ArrayList<Product>) ois.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
