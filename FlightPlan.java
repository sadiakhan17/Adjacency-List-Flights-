import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class FlightPlan{

    public static void main(String[] args) throws IOException{
		
		//create output file so that we can write output to it 
		BufferedWriter writer = new BufferedWriter(new FileWriter("outputFile"));
	 	//scanner object using the input file
	 	Scanner flightData = new Scanner(new File("flightDataFile.txt"));
		
		Scanner requestData = new Scanner(new File("requested.txt"));
		
		//create linkedlist of linkedlist: adjacency list
		 AdjacencyList list = new AdjacencyList();
		
		//read flight data into our adjacency list
		list.getData(flightData);
		
		//store requested data into an arraylist
		ArrayList<ProcessRequests> requests=ProcessRequests.getData(requestData, writer);

	 	//close file
		writer.close();
		flightData.close();
		requestData.close();
		
		
	}
	
}