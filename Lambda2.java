class MyClass {
	static int myMeth(){
		return 100;
	}

}

interface MyInterface {
	int MyMeth();
	String MyMeth2();

}

class MyClass1 implements MyInterface {
	public int MyMeth(){
		return 100;

	}

	public String MyMeth2(){
		return "строка";
	}
}

MyInterface var2 = new MyClass1();
interface MyFuncInterface {
	int MyMeth();
}

MyFuncInterface var1 = () -> 100;
System.out.println("вызов лямда-функции для перемеой var1:" + var1.MyMeth());
System.out.println("вызов лямда-функции для перемеой var2:" +var2.MyMeth());

interface FuncInterface2{
	double MyMeth(int n);


}

FuncInterface2 reciprocal = (n) ->(double) 1/n;
System.out.println("вызов метода funcInterface  с одним параметром (обратное значение параметра) " + reciprocal.MyMeth(10));

interface MyFuncInterface3 {
    double MyMeth(int n, int m);
}

MyFuncInterface3 var3 = (n, m) -> (double) n / m;
System.out.println("Отношение 10/5 = " + var3.MyMeth(10, 5));
System.out.println("Отношение 7/2 = " + var3.MyMeth(7, 2));
int a = 1500;
int b = 2000;
var3.MyMeth(a, b)
MyFuncInterface3 del = (n, m)-> Math.random()*n /( Math.random()*m)
