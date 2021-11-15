package intro;

public class main {

	public static void main(String[] args) {
		
		String[] cities = {"Ankara","İstanbul"};
		addCity(cities,"İzmir");
		
		for(String city:cities) {
			System.out.println(city);
		}
	

     }
	private static String[] addCity(String[] cities, String city) {
		String[] newCities =  new String[cities.length+1];
		
		for (int i = 0; i < cities.length; i++) {
			newCities[i]=cities[i];
		}
	    newCities[newCities.length-1] =city;
	    return newCities;
			
		}

		
	}
	
//collection
