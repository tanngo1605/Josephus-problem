
public class CirLinkedList {
	protected Node current;
	protected int nElemens;

	public CirLinkedList(int d) {
		this.current = new Node();
		current.next = current;
		nElemens = 1;

	}

	public CirLinkedList() {
		this.current = new Node();
		current.next = current;
		nElemens = 0;
	}

	public int getSize() {
		return this.nElemens;
	}

	public void insertion(int d) {
		if (nElemens == 0) {
			current.data = d;
			nElemens++;
		} else {
			Node temp = new Node();
			temp.data = d;
			temp.next = current.next;
			current.next = temp;
			current = temp;
			nElemens++;
		}
	}

	public void delete() // this will remove current node, and the current node will be the next
	{
		if (nElemens > 1) {
			Node temp = current.next;
			nElemens--;
			for (int i = 1; i <= nElemens; i++) {
				current = current.next;
			}
			current.next = temp;
			current = temp;

		} else if (nElemens == 1) {
			current = null;
			nElemens = 0;
		} else
			System.out.println("The list is empty");
	}

	public void step() // move current to the next node
	{
		current = current.next;
	}

	public Node search(int key) {
		int temp = nElemens;
		while (temp != 0) {
			if (current.data == key) {
				break; // found it
			} else {
				current = current.next;
				temp--;
			}
		} // if not found
		if (temp == 0) {
			System.out.printf("Not found %d in the list\n", key);
			return null;

		} else {
			System.out.printf("Found %d in the list\n", key);
			return current; // found it
		}
	}

	public void showList() {
		for (int i = 1; i <= nElemens; i++) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.print("\n");
		if (nElemens == 0)
			System.out.println("The list is empty");
	}

}
