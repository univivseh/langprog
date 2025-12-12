//пример лямба выражения:
//() -> 100 возврат значения 100 при вызове лямда-функции при отсутствии параметров
//(n) -> 1/n возврат обратного значения параметра (передается один параметр)
//(n,m) -> n,m  возврат отношения параметра  n к параметру m 
//подобные действия в традиционной записи выгдятат так :
class MyClass {
	static int myMeth(){
		return 100;
	}
}

//пример интерфейса определяющего абстрактный мметод myMetch()
interface MyInterface {
	int MyMeth();
	String MyMeth2();
}
//реализация инетрефейса с помощью класса 
//
class MyClass1 implements MyInterface {
	public int MyMeth(){
		return 100;
	}
	public String MyMeth2(){
		return "строка";
	}
}
MyInterface var2 = new MyClass1();

//для вызова реализованного метода Mymeth необходимо создать новый объект класса myclass1 и вызвать метод для переменой указывающей на этот объект 
//альтернативное решение с использованием лябда функции и функционального интрефейса 
//функциональный интерфейс может определять только один абстарктный метод
interface MyFuncInterface {
	int MyMeth();
}
// лямда выражение может быть присвоенно переменой функциального интрефеса 
MyFuncInterface var1 = () -> 100;
System.out.println("вызов лямда-функции для перемеой var1:" + var1.MyMeth());
System.out.println("вызов лямда-функции для перемеой var2:" +var2.MyMeth());

//Начинаем реализацию любого лямбда-выражения с определения подходящего функционального интрефейса
//в функциональном интерфесе нужн оопределить метод с нужным типом возвращаемого значения и с нужными типами передоваемых параметров 

//
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
