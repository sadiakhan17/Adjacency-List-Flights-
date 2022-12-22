import java.util.*;
import java.io.*;

public class AdjacencyList {
    LinkedList<CityList> cityLinked;

    public AdjacencyList() {
        cityLinked = new LinkedList<>();
    }

	
	//read in the data + add everything in 
	public void getData (Scanner flightData){
		int lines=flightData.nextInt();
		
		for(int i=0; i<lines; i++){
			String flight=flightData.next();
	        String[] arrOfStr = flight.split("\\|");
			
			for (int j=0; j<arrOfStr.length; j=j+4){
				String des=arrOfStr[j];
				String des2=arrOfStr[j+1];
		        int cost = Integer.parseInt(arrOfStr[j+2]);
		        int time = Integer.parseInt(arrOfStr[j+3]);
				
				//create our city objects or retreve if exists
				CityList he=create(des);
				CityList she=create(des2);
				
				//add edge or city into linkedlist connecyion
				edges(he.getName(), she.getName(), cost, time);
		
			}
	     }
		
	}
	
	//check if city exists then create it 
    public CityList create (String des){
        if (contains(des)==false){
			//this area has all the distinct cities
            CityList created = new CityList(des);
            this.add(created);
            return created;
        }
		else{
			//city already in the list so we dont need to add it
			//we return the city name so we can have the object to create an edge
			return get(des);
			
		}
    }
	
	//checking if city exists based on name
    public boolean contains(String des){
        if (cityLinked.contains(get(des))){
        		return true;
        }
		
		else{
			return false;
		}
    }

	//get name if city exists
    public CityList get(String des){
        for (CityList element : cityLinked){
            if (element.getName().equals(des)){
				return element;
            }
        }
		
        return null;
    }
	
    public void add(CityList obj) {
        cityLinked.add(obj);
    }
	
	
	public void edges(String citya, String cityb, int cost, int time){
		City city1=new City(citya, cityb, cost, time);
		City city2= new City(cityb, citya, cost, time);
		get(citya).add(city2);
		get(cityb).add(city1);
		
		
	}
	
}
	
	
