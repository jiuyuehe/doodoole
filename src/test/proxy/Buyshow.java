package test.proxy;

public class Buyshow implements Buy {

	public void buyCar(int money) {
		System.out.println("spend "+ money +"RMB buy Car");

	}

	public void buyHouse(int money) {
		System.out.println("spend "+ money +"RMB buy House");

	}

	public void buyNoteBook(int money) {
		System.out.println("spend "+ money +"RMB buy NoteBook");

	}

}
