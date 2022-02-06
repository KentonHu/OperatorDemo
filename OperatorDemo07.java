/*
	逻辑运算符
 */
public class OperatorDemo07 {
	public static void main(String[] args) {
		//定义变量
		int i = 10;
		int j = 20;
		int k = 30;

		//& 逻辑与 有false则false
		System.out.println((i > j) & (i > k));// false & false
		System.out.println((i < j) & (i > k));// true & false
		System.out.println((i > j) & (i < k));// false & true
		System.out.println((i < j) & (i < k));// true & true
		System.out.println("----------------");
		//| 逻辑或 有true则true
		System.out.println((i > j) | (i > k));// false | false
		System.out.println((i < j) | (i > k));// true | false
		System.out.println((i > j) | (i < k));// false | true
		System.out.println((i < j) | (i < k));// true | true
		System.out.println("----------------");
		//^ 逻辑异或 相同为false，不同为true
		System.out.println((i > j) ^ (i > k));// false ^ false
		System.out.println((i < j) ^ (i > k));// true ^ false
		System.out.println((i > j) ^ (i < k));// false ^ true
		System.out.println((i < j) ^ (i < k));// true ^ true
		System.out.println("----------------");
		//! 逻辑非，false则为true，true则为false
		System.out.println((i > j));// false
		System.out.println(!(i > j));// !true
		System.out.println(!!(i > j));// !!false
		System.out.println(!!!(i > j));// !!!true
	}
}