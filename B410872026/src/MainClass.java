public class MainClass {
	public static void main(String[] args) {
		Product a1 = new Drink("BEER",90,350);
		Drink a2 = new Drink("SODA",80,200);
		String str1 = a1.getName()+","+a1.getPrice();
		String str2 = a2.getName()+","+a2.getVolumn();
		System.out.print(str1+";"+str2);
	}
}