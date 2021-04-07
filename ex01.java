package week3_day3;


class Student{
private String name;
private int kor;
private int eng;
private int math;
private int tot;	
// 생성자 , 멤버변수 값 초기화 담당, 객체가 생성될 때 단 한 번 호출됨 ,  임의로 호출할 수 있음 
//리턴명시하면 안됨 
// 이름=> 클래스이름과 같아야 함 
//기본생성자 , 오버로딩, 같은이름으로 여러개 존재하는 기능(매세드)
public  Student() {
	
}
public  Student(String name, int kor, int eng, int math) {
	this.name = name;
	this.kor = kor;
	this.eng= eng;
	this.math= math;	
}
public Student(String name) {
	this.name = name;
}
/*
 * 생성자를 이용한 코드로 변경 
public  void input(String name, int kor, int eng, int math ) {
	this.name = name;
	this.kor = kor;
	this.eng= eng;
	this.math= math;	
}

*/
 
public  void calcTot() {			
		tot = kor+ eng+ math;
}

public void disp() {
	System.out.println( name + "  "  + kor + "  " + eng + "  " + tot + " " + math);		
}	
}

//1. 객체지향프로그래밍   캡슐화 (  class = 데이타 + 기능(매세드),  접근제어자로 정보보호를 할 수 있음 )
//class 구성원  :  멤버변수  , 멤버메서드 , 생성자 
//생성자 :멤버변수의 초기화담당 , 
//생성자 (매서드 ) , 단 한번 생성될 때만 호출됨 , 

public class Ex01 {
public static void main(String[] args) {

	   Student s= new Student("김길동" ,90,50,100);	
	   Student a= new Student();
	   Student k = new Student("나길동");
	
	   
	  // s.input("김길동", 90,50,100);	
	  
	   s.calcTot();
	   s.disp();
	   //s.input("나길동", 90,50,100);	
	   s.calcTot();
	   s.disp();
	   
	   System.out.print("String");
	   System.out.print(30);
	   System.out.print(30.2);
	   
	   
   
	
}






}