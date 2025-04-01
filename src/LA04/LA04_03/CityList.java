package LA04.LA04_03;

import java.util.List;

public class CityList {
	private List<City> citylist;
	public CityList() {
		
	}
	
	public void add(String c) {
		if(this.find(c)) {
			this.citylist.add(new City(c));
		}
	}
	
	public boolean find(String c) {
		return this.citylist.stream()
						    .anyMatch(city -> city.getName()
								   				  .equals(c)
								   	);
	}

}
