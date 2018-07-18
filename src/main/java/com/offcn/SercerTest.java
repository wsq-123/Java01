package com.offcn;

public class SercerTest {

	public static void main(String[] args) {
		//初始化对象
		Server server= new ServerService().getServerPort();
		//调用方法
		String name = server.getValue("faker");
		System.out.println("name:"+name);
		
	}

}
