
public class Problem2 {
	public static void demo()
	{
		JosephusList case1 = new JosephusList(7,3,1); //numberOfPeople,countingOff,startPosition
		System.out.println("Initial list: ");
		case1.step();// counting start  =1
		case1.showList();
		case1.solveProblem();
		
		System.out.println("Try the sample case");
		JosephusList case2 = new JosephusList(20,4,1);
		System.out.println("Initial list: ");
		case2.step();
		case2.showList();
		case2.solveProblem();
		
		System.out.println("Try another case: ");
		JosephusList case3 = new JosephusList(30,7,7);
		System.out.println("Initial list: ");
		case3.step();
		case3.showList();
		case3.solveProblem();
		
		
	}

}
