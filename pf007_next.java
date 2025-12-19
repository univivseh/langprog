result = ip.test(3);
IntPredicate ip = myNum2::isFactor;
result = ip.test(3);

//Link to a generalized method
//
interface SomeTest<T> {
	boolean test(T n, T m);

}

class MyClass {
	static <T> boolean myGenMeth(T x, T y){
		boolean result = false;
		//...
		return result;
}

SomeTest<Integer> mRef = MyClass::<Integer>myGenMeth;
