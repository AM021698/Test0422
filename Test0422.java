public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422開發流程練習");
		int x=10, y=5;
		new A().minFunc(x, y);
		new B().maxFunc(x, y);
		new C().avgFunc(x, y);
	}
<<<<<<< HEAD

	class B
	{
		public static void maxFunc (String[] args)
		{
			if (x > y)
			{
				System.out printf("x is MAX!!");
			}
			else if (y > x)
			{
				System.out printf("y is MAX!!");
			}
		}
	}
]
=======
	public class C{
		public void avgFunc(int x, int y) {
			System.out.println("%f", (x + y) / 2);
		}
	}
}
>>>>>>> b2c3f86de9d839d363ab836fe8d3a7f2b96c0f94
