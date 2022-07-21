package com.javaproject.abstraction;

public class Browser {
	public Browser() {
		// TODO Auto-generated constructor stub
	}

	public String navigate(String address) {
		String ip=findIpAddress(address);
		String html= sendHttpReuqest(ip);
		System.out.println(html);

		return address;

	}

	private String sendHttpReuqest(String ip) {
		// TODO Auto-generated method stub
		return "<html></html<";
	}

	private String findIpAddress(String address) {
		// TODO Auto-generated method stub
		return "12.33.44";
	}
}
