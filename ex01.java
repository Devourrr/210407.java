package week3_day3;


class Student{
private String name;
private int kor;
private int eng;
private int math;
private int tot;	
// ������ , ������� �� �ʱ�ȭ ���, ��ü�� ������ �� �� �� �� ȣ��� ,  ���Ƿ� ȣ���� �� ���� 
//���ϸ���ϸ� �ȵ� 
// �̸�=> Ŭ�����̸��� ���ƾ� �� 
//�⺻������ , �����ε�, �����̸����� ������ �����ϴ� ���(�ż���)
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
 * �����ڸ� �̿��� �ڵ�� ���� 
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

//1. ��ü�������α׷���   ĸ��ȭ (  class = ����Ÿ + ���(�ż���),  ���������ڷ� ������ȣ�� �� �� ���� )
//class ������  :  �������  , ����޼��� , ������ 
//������ :��������� �ʱ�ȭ��� , 
//������ (�ż��� ) , �� �ѹ� ������ ���� ȣ��� , 

public class Ex01 {
public static void main(String[] args) {

	   Student s= new Student("��浿" ,90,50,100);	
	   Student a= new Student();
	   Student k = new Student("���浿");
	
	   
	  // s.input("��浿", 90,50,100);	
	  
	   s.calcTot();
	   s.disp();
	   //s.input("���浿", 90,50,100);	
	   s.calcTot();
	   s.disp();
	   
	   System.out.print("String");
	   System.out.print(30);
	   System.out.print(30.2);
	   
	   
   
	
}






}