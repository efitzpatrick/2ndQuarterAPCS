/**
 * Ellie Fitzpatrick
 * AP Computer Science
 * Nov 4, 2014
 * Mrs. Zayas
 * Title
 */

/**
 * @author efitzpatrick
 *
 */

import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PlayingWithJSON {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare objects
		Scanner scan = new Scanner(System.in);
		JSONObject recordingData = new JSONObject();
		JSONObject times = new JSONObject();
		
		
		//Declare Variables
		double time1 = 4.22;
		int songNumber= 22;
		String showName;
		System.out.println("Show/Recording Name: ");
		showName = scan.nextLine();
		String songNumberString = Integer.toString(songNumber);
		String title = "We Aspire";
		times.put("1", addTimes("Lover's Carvings",3.02 ));
		times.put("2", addTimes("Don't Worry", 2.34 ));
		times.put("3", addTimes("Baroque Fantasy", 3.43 ));
		times.put("4", addTimes("You Spin Me Around", 3.23));
		times.put("5", addTimes("Zabba Du Bay", 3.53));
		times.put(songNumberString, addTimes(title, time1 ));
		
		recordingData.put("show_name", showName);
		recordingData.put("times", times);
		System.out.println(recordingData);
		
		
		
		
		
	}

	private static JSONArray addTimes(  String songName, double time) {
		// TODO Auto-generated method stub
		String time2 = Double.toString(time);
		JSONArray label = new JSONArray();
		label.add(songName);
		label.add(time2);
		return label;
		
	}

}
