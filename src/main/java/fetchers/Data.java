package fetchers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import analysis.Analysis;


public class Data {
	
	
	private static String makeURL(String country, int yearStart, int yearEnd, String analysisMode) {
		String url = "http://api.worldbank.org/v2/country/%s/indicator/" + analysisMode + "?date=%d:%d&format=json";
		String urlFormatted = String.format(url, country, yearStart, yearEnd);
		return urlFormatted;
	}
	
	
	public static DataSet fetchData(String country, int yearStart, int yearEnd, String analysisMode) {

		String urlString = makeURL(country, yearStart - 1, yearEnd, analysisMode);
		DataSet ds = new DataSet();

		

		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			if (responsecode == 200) {
				String inline = "";
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				sc.close();
				JsonArray jsonArray = new JsonParser().parse(inline).getAsJsonArray();	
				
				int x = yearStart;
				for (int i = jsonArray.get(1).getAsJsonArray().size() - 1; i >= 0; i--) {
					if (jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull()) {
						ds.addPoint(new Point(x,0));
					}else {
						double y = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
						Point p = new Point(x, y);
						ds.addPoint(p);
					}
					x++;
				}			
			}

		} catch (IOException e) {
		}
		return ds;
	}
	
	public static void main(String[] args) {
	
		String country = "CAN";
		int startYear = 2000;
		int endYear = 2021;
		
	
		String a1 = "SP.POP.TOTL";
		String a2 = "EN.ATM.CO2E.PC";
		String a3 ="EN.ATM.PM25.MC.M3";
		String a4 ="AG.LND.FRST.ZS";
		String a5 ="NY.GDP.PCAP.CD";
		String a6 ="SH.MED.BEDS.ZS";
		String a7 ="SE.XPD.TOTL.GD.ZS";
		String a8 ="SH.STA.MMRT";
		String a9 ="SH.XPD.CHEX.PC.CD";
		String a10 ="SH.XPD.CHEX.GD.ZS";
		String a11 ="SP.DYN.IMRT.IN";
		String a12 ="SH.ACS.MONY.Q1.ZS";
		
		
		DataSet ds = Data.fetchData(country, startYear, endYear, a4);
		PieDataSet pie = Analysis.average(ds);
		System.out.println(pie.getSections());
		
		//
		//DataSet ds = Data.fetchData(country, startYear, endYear, a2);
		//DataSet ds2 = Data.fetchData(country, startYear, endYear, a5);
		
		
		//DataSet ratio = Analysis.ratio(ds, ds2);
		//System.out.println(ratio.getPoints());
		
		
		//DataSet dsLine = Analysis.annualPercentChange(ds);
		//System.out.println(dsLine.getPoints());
	}	
	
}
