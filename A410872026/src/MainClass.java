
public class MainClass {
	
	public static void main(String[] args) {
		Book w1 = new Book("BOOK1","ISBN1",85);
		Book w2 = new Book("BOOK2","ISBN2",135);
		String str1 = w1.get_bname()+","+w1.get_isbn();
		str1 += ","+(w1.get_price()+w1.get_shipping());
		String str2 = w2.get_bname()+","+w2.get_isbn();
		str2 += ","+(w2.get_price()+w2.get_shipping());
		System.out.println(str1+","+str2);
		}

}
