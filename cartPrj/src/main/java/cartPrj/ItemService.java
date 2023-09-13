package cartPrj;

import java.util.Random;

public class ItemService {

	public String getItem(String code) {
		
		Random r = new Random();
		String[] goodsList = {"테스트","테스트2","테스트3"};
		int index= r.nextInt(3);
		
		return goodsList[index];
	}
}
