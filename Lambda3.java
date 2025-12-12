System.out.println("вызов лямда-функции для перемеой var1:" + var1.MyMeth());
System.out.println("вызов лямда-функции для перемеой var2:" +var2.MyMeth());
System.out.println("вызов метода funcInterface  с одним параметром (обратное значение параметра) " + reciprocal.MyMeth(10));
System.out.println("Отношение 10/5 = " + var3.MyMeth(10, 5));
System.out.println("Отношение 7/2 = " + var3.MyMeth(7, 2));
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
var3.MyMeth(a, b)
MyFuncInterface3 del = (n, m)-> Math.random()*n /( Math.random()*m);

double x;
del = (n,m) ->{ if ((n+m)%2 == 0) x = 0.0;return x;}
if (del.MyMeth(4,2)==0/0) System.out.println("сумма n и m - четное число");
if (del.MyMeth(4,2)==0.0) System.out.println("сумма n и m - четное число");
if (del.MyMeth(4,3)==0.0) System.out.println("сумма n и m - четное число");

del = (n,m) ->{ if ((n+m)%2 == 0) x = 1.0;return x;}
if (del.MyMeth(4,3)==1.0) System.out.println("сумма n и m - четное число"); else System.out.println("сумма нечетная");
if (del.MyMeth(4,2)==1.0) System.out.println("сумма n и m - четное число"); else System.out.println("сумма нечетная");
if (del.MyMeth(9,2)==1.0) System.out.println("сумма n и m - четное число"); else System.out.println("сумма нечетная");
del = (n,m) ->{ if ((n+m)%2 == 0) x = 1.0; else x=0.0; return x;}

if (del.MyMeth(9,2)==1.0) System.out.println("сумма n и m - четное число"); else System.out.println("сумма нечетная");
if (del.MyMeth(4,2)==1.0) System.out.println("сумма n и m - четное число"); else System.out.println("сумма нечетная");
if (del.MyMeth(9,2)==1.0) System.out.println("сумма n и m - четное число"); else System.out.println("сумма нечетная");
interface FuncInterface4{
    boolean MyMeth(int m, int n);
}

FuncInterface4 del3 = (n, m) ->  (n+m)%2 == 0;
del3.MyMeth(5,2)
del3.MyMeth(2,2)

if (del3.MyMeth(6,2)) System.out.println("сумма n и m - четное число");
if (del3.MyMeth(6,2)) System.out.println("сумма n и m - четное число"); else System.out.println("сумма нечетная");
if (del3.MyMeth(3,2)) System.out.println("сумма n и m - четное число"); else System.out.println("сумма нечетная");

interface MyValue{
    double getValue();
}

interface MyParamValue{
    double getValue(double v);

}
MyValue myVal;
myVal = () -> 35.5
MyParamValue myPval = (n) -> n*n / 1000;
myPval.getValue(50)
myPval.getValue(10000)
FuncInterface4 isFactor = (n, v) -> (n%v)== 0;
isFactor.MyMeth(10, 3)
isFactor.MyMeth(10, 2)
FuncInterface4 lessThan = (n, m) -> (n<m);
lessThan.MyMeth(3,5)
lessThan.MyMeth(13,5)
FuncInterface4 absEqual = (n,m) -> (n < 0 ? -n : n) == (m<0 ? -m :m);
absEqual.MyMeth(100, -100)
absEqual.MyMeth(100, -110)

interface StringTest {
    boolean test (String aStr, String bStr);

}

String a = "Строка 1";
String b = "Строка 2";
a.compareToIgnoreCase(b)

interface FuncInterface5 {
    int MyMeth2 (String a, String b);

}
a.compareToIgnoreCase(b)
FuncInterface5 comTICase = (a,b) -> a.compareToIgnoreCase(b);
comTICase.MyMeth2(a,b)

a = "1"
b = "3"

comTICase.MyMeth2(a,b)
interface NumericFunc {
    int func(int n);

}
smallestF.func(12)
smallestF.func(17)
smallestF.func(19)
NumericFunc smallestF = (n) -> {
    int result = 1;
    n = n < 0 ? -n: n;
    for (int i=2; i<= (n/i + n); i++) {
    if ((n/i)==1){ System.out.println("параметр - простое число ");
    break;}

    if ((n%i) == 0) {
        result = i;
        break;
}
    if ((n/i)==1) System.out.println("параметр - простое число ");
}
    return result;
};

smallestF.func(19)
smallestF.func(20)
