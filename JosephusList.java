
public class JosephusList extends CirLinkedList {
	int countOff;
	int startPosition;
	public JosephusList(int numOfPP,int cf,int startPosition)
	{	this.countOff =cf;
		this.startPosition = startPosition;
		nElemens = 0;
		for (int i=1;i<=numOfPP;i++)
		{
			this.insertion(i);
		}
	}
	
	public void solveProblem()
	{
		this.search(startPosition); //to start counting at the startPosition
		System.out.print("The eliminated order: ");
		while(this.nElemens!=1)
		{
			for (int i=1;i<=countOff;i++)
			{
				this.step();
			}
			System.out.print(current.data+", ");
			this.delete();
		}
		System.out.printf("The position will live is: %d\n",current.data);
		
	}
	

}
