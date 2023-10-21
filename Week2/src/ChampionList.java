import java.util.ArrayList;

public class ChampionList {
	private ArrayList<Champion> cList = new ArrayList<Champion>();
	
	public void addChampion(Champion c) {
		cList.add(c);
	}
	
	public void printInfo() {
		System.out.println("List of Champions:");
		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).printInfo();
		}
	}

}
