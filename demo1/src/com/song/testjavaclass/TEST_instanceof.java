package com.song.testjavaclass;

public class TEST_instanceof {
	interface C {}
	class A implements C{
		int a;
	}
	class B extends A {
		int a;
	}

	public static void main(String[] args) {
		/**
		 * 成员内部类的创建方式
		 * 成员内部类存在的前提是外部类的存在
 		 */
		A a = new TEST_instanceof().new A();
		B b = new TEST_instanceof().new B();
		A a1 = new TEST_instanceof().new B();


		// true
		System.out.println(a instanceof A);
		// false,B 继承 A
		System.out.println(a instanceof B);
		// true
		System.out.println(b instanceof B);
		// true，B 继承A
		System.out.println(b instanceof A);
		// true
		System.out.println(a instanceof C);
		// true
		System.out.println(b instanceof C);
		// true
		System.out.println(a1 instanceof A);
		// true，说明对象的创建不取决于前面的引用，而取决于后面的new的对象
		System.out.println(a1 instanceof B);

		/**
		 * 也就是说，instance 英语意为例子，instanceof 表示 XXX的例子
		 * instanceof 为 true, 则说明 该对象是该类及其子类，或者包含该接口
		 */
		if (a instanceof B) {
			// 如果a是B的子类，false
			// 向下转型，父类转换为子类，范围又大到小。属于强制转型，向下转型的前提是，其本身就是子类。
			B b1 = (TEST_instanceof.B)a;
			System.out.println("a转换为B成功");
		}
		if (b instanceof A) {
			// 如果b是A的子类true
			// 向上转型，子类转换为父类，范围由小变大。属于自动转型,是多态的一种体现。
			A a2 = (TEST_instanceof.A)b;
			System.out.println("b转换为A成功");
		}

	}
}
