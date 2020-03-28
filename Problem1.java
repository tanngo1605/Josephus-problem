
public class Problem1 {

	public static void demo() {
		// TODO Auto-generated method stub
		CirLinkedList list = new CirLinkedList();
		list.insertion(1);
		list.insertion(14);
		list.insertion(3);
		list.insertion(4);
		list.insertion(85);
		list.step(); // go back the the node that holds value 1

		list.showList();

		list.delete(); //the current node holds value 1, so 1 with will be eliminated

		System.out.println("After deleting: ");
		list.showList();

		// search a key

		list.search(4);
		list.search(7);

		// create an empty list and show
		CirLinkedList list2 = new CirLinkedList();
		list2.showList();

	}

}
