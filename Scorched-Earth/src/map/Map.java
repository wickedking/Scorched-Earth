package map;

import java.util.HashMap;

public class Map {
	
	HashMap<Integer, Integer> my_map;
	
	public Map(){
		my_map = new HashMap<Integer, Integer>();
		createMap();
	}
	
	private void createMap(){
		for(int i = 0; i < 800; i ++){
			my_map.put(i, 0);
		}
		
	}

}
