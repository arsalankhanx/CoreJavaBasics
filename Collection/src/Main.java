public class Main {

	public static void main(String[] args) {
		
		List lnkList = new LinkedList();
		lnkList.add("Element1");
		lnkList.add("Element2");
		lnkList.add("Element3");
		lnkList.add("Element4");
		displayAll(lnkList);
		
		List aryList = new ArrayList();
		aryList.add("x");
		aryList.add("y");
		aryList.add("z");
		aryList.add("a");
		displayAll(aryList);
		
		Set hasSet = new HashSet();
		hasSet.add("set1");
		hasSet.add("set2");
		hasSet.add("set3");
		hasSet.add("set4");
		displayAll(hasSet);
		
		Set trSet = new TreeSet();
		trSet.add("trset1");
		trSet.add("trset2");
		trSet.add("trset3");
		trSet.add("trset4");
		displayAll(trSet);
		
		
	}

}
