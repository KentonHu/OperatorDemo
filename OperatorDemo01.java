/*
	算术运算符
 */
public class OperatorDemo01{
	public static void main(String[] args) {
		//定义两个变量
		int a = 6;
		int b = 4;
		//加法运算
		System.out.println(a+b);
		//减法运算
		System.out.println(a-b);
		//乘法运算
		System.out.println(a*b);
		//除法运算
		System.out.println(a/b);
		//取余运算
		System.out.println(a%b);
		//除法得到的是商，取余得到的是余数
		
		//整数相除只能得到整数，想要得到小数，必须有浮点数参与。
		System.out.println(a%4.0);
	}
}