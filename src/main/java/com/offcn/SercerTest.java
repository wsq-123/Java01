package com.offcn;

public class SercerTest {

	public static void main(String[] args) {
		//��ʼ������
		Server server= new ServerService().getServerPort();
		//���÷���
		String name = server.getValue("faker");
		System.out.println("name:"+name);
		
	}

}
