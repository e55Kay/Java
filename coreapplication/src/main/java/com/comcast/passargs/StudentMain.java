package com.comcast.passargs;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNo("CS1502");
		student.setMark1(70);
		student.setMark2(70);
		student.setMark3(50);

		ResultCalculator rCalculate = new ResultCalculator();
		Result response = rCalculate.calculateResult(student);
		System.out.println(response.getRollNo() + " ---> " + response.getGrade());
	}

}
