package com.itwill.ver01;

import java.util.Scanner;

public class ContactMain {
    private static final int MAX_LENGTH = 3; // 연락처 배열의 최대 길이(원소 개수)
    
    private Scanner scanner = new Scanner(System.in);
    private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장하기 위한 배열
    private static int count = 0; // 현재까지 연락처 배열에 저장된 개수.
    // 배열에 새로운 연락처 저장될 때마다 count++을 실행.

    public static void main(String[] args) {
        System.out.println("*** 연락처 프로그램 v0.1");
        
        ContactMain app = new ContactMain();
        
        // 프로그램 계속 실행(run=true) 또는 종료(run=false) 여부를 저장하기 위한 변수.
        boolean run = true;
        while (run) {
            int menu = app.showMainMenu();
            switch (menu) {
            case 0:
                run = false;
                break;
            case 1:
            	if(count < MAX_LENGTH) {
                app.saveNewContact();
            	} else {
            		System.out.println("연락처가 가득차서 더이상 저장이 되지 않습니다.");
            		}
            	break;
            case 2:
                app.readAllContacts();
                break;
            case 3:
                app.readContactByIndex();
                break;
            case 4:
                app.updateContactByIndex();
                break;
            default:
                System.out.println("메뉴 번호(0 ~ 4)를 확인하세요.");
            }
        }
        
        System.out.println("*** 프로그램 종료 ***");
    }
    
    private void updateContactByIndex() {
        System.out.println("\n--- 연락처 수정 ---");
        
        System.out.print("인덱스 입력>> ");
        int index = Integer.parseInt(scanner.nextLine());
        
        if(index >= 0 && index < contacts.length) {
	        if(contacts[index] != null) {
	      System.out.println("수정전: " + contacts[index].toString());
        System.out.print("이름 수정>> ");
        String name = scanner.nextLine();
        
        System.out.print("전화번호 수정>> ");
        String phone = scanner.nextLine();
        
        System.out.print("이메일 수정>> ");
        String email = scanner.nextLine();
        
     // TODO: 입력한 내용으로 배열의 내용을 업데이트.
        Contact contact = new Contact(name, phone, email);
        contacts[index] = contact;
        
        System.out.println("수정후: " + contacts[index].toString());
        
        
	        } else{
		      System.out.printf("현재 %d번의 연락처가 저장되어 있지 않습니다.\n",index);
	    	  System.out.printf("%d번에 연락처를 저장하고 다시 시도하십시오",index);
	        }
        } else {
        System.out.printf("0 ~ %d번까지의 연락처만 조회가능합니다.\n", contacts.length-1);
        } 
    }    
	        
        
  
    private void readContactByIndex() {
        System.out.println("\n--- 인덱스 검색 ---");
        System.out.print("인덱스 입력>> ");
        int index = Integer.parseInt(scanner.nextLine());
        
        // 해당 인덱스의 연락처를 출력
        if(index >= 0 && index < contacts.length) {
        	if(contacts[index] != null) {
        System.out.println(contacts[index].toString());
        	} else {
        		System.out.printf("현재 %d번에 저장된 연락처가 없습니다.\n",index);
        	}
        } else {
        	System.out.printf("0~ %d번까지의 숫자만 입력해주십시오.\n" , contacts.length-1);
        }
    }
    
    private void readAllContacts() {
        System.out.println("\n--- 연락처 목록 ---");
        for (int i = 0; i < count; i++) {
            System.out.println(contacts[i].toString());
        }
    }
    
    private void saveNewContact() {
    	
        System.out.println("\n--- 새 연락처 저장 ---");
        
        System.out.print("이름 입력>> ");
        String name = scanner.nextLine();
        
        System.out.print("전화번호 입력>> ");
        String phone = scanner.nextLine();
        
        System.out.print("이메일 입력>> ");
        String email = scanner.nextLine();
        
        Contact contact = new Contact(name, phone, email);
    	
        // Contact 타입 객체를 연락처 배열 인덱스 count에 저장
        contacts[count] = contact;
        // 배열에 저장 후에는 연락처 저장 개수(인덱스)를 증가
        count++;
    	
    }
    
    private int showMainMenu() {
        System.out.println("\n----------------------------------------------");
        System.out.println("[0]종료 [1]저장 [2]목록 [3]인덱스검색 [4]수정");
        System.out.println("----------------------------------------------");
        System.out.print("선택> ");
        
        int menu = Integer.parseInt(scanner.nextLine());
        
        return menu;
    }

}