import java.util.*;
import java.io.*;

public class CityList{
    String depart;
    LinkedList<City> cityList;

    public CityList (String depart) {
        this.depart = depart;
        cityList = new LinkedList<>();
    }
	
	public void add(City c){
		cityList.add(c);
	}
	
	public String getName(){
		return this.depart;
	}
	
	
	
}