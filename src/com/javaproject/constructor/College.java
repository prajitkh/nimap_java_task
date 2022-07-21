package com.javaproject.constructor;

public class College {

	College(){
		System.out.println("");

	}
	College(String name,String collegeName){
		
		System.out.println(name+" Welcome to "+collegeName+" college");

	}
	College(String name,String collegeName,int year){
		System.out.println(name+" Welcome to "+collegeName+" college"+" Year "+year);
	}


	void getAdmission() {
		System.out.println("Admission done...");
	}
	public static void main(String[] args) {

		//College cc=new College("Prajit","SBAU");
		//cc.getAdmission();
		College clg=new College("PRAJ","RTMNU",2020);
		clg.getAdmission();

		System.out.println("***************");
		//College c1=new College("Radhe","P.R.PATIL");
		//c1.getAdmission();
		
	}

}
