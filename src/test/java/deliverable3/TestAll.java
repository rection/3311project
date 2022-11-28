package deliverable3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import analysis.Analysis;

import java.util.ArrayList;


import fetchers.Data;
import fetchers.DataSet;
import fetchers.PieDataSet;
import fetchers.Point;
import login.Csv;
import login.User;
import statsVisualiser.factory.GraphFactory;
import statsVisualiser.graph.BarGraph;
import statsVisualiser.graph.Graph;
import statsVisualiser.graph.LineGraph;
import statsVisualiser.graph.PieGraph;
import statsVisualiser.graph.ReportGraph;
import statsVisualiser.graph.ScatterGraph;
import statsVisualiser.gui.Loginpage;
import statsVisualiser.gui.Main;



public class TestAll {
	@Test
	public void CsvLoad() throws Exception {
		Csv user = new Csv();
		user.load("./users.csv");
		assertTrue( user.users.toString().contains("efecan") );
	}
	
	@Test
	public void ValidCredentialUserLogin() throws Exception {
		Loginpage login = Loginpage.getInstance();
		ArrayList<String> usernameList = new ArrayList<String>();
		ArrayList<String> passswordList = new ArrayList<String>();
		usernameList.add("safa");
		passswordList.add("12345");
		String username = "safa";
		String password = "12345";
		assertTrue(login.authentication(usernameList, passswordList, username, password));
	}
	
	@Test
	public void InvalidCredentialUserLogin() throws Exception {
		Loginpage login = Loginpage.getInstance();
		ArrayList<String> usernameList = new ArrayList<String>();
		ArrayList<String> passswordList = new ArrayList<String>();
		usernameList.add("safa");
		passswordList.add("12345");
		String username = "safa";
		String password = "123456";
		assertFalse(login.authentication(usernameList, passswordList, username, password));
	}
	
	@Test
	public void TestUserCreation() throws Exception {
		User user = new User();
		user.setName("testUser");
		assertEquals(user.getName(), "testUser");
	}
	
	@Test
	public void TestUserCreationPassword() throws Exception {
		User user = new User();
		user.setPassword("testPassword");
		assertEquals(user.getPassword(), "testPassword");
	}
	
	/*
	 * Test makeURL to validate that it is creating a valid URL,
	 * later to be used to fetch data with
	 */
	@Test 
	public void validURL() throws Exception {
		String make = Data.makeURL("CAN", 2000, 2002, "SP.POP.TOTL");
		System.out.println(make);
		String URL = "http://api.worldbank.org/v2/country/CAN/indicator/SP.POP.TOTL?date=2000:2002&format=json";
		assertEquals(make, URL);
	}

	/*
	 * Test to validate that inputting years corresponds to the years 
	 * that are fetched from the WorldBank API
	 */
	@Test
	public void validXValues() throws Exception {

		DataSet set = Data.fetchData("CAN", 2000, 2002, "EN.ATM.CO2E.PC");
		DataSet set2 = new DataSet();
		
		Point p1 = new Point(2000.0, 0);
		Point p2 = new Point(2001.0, 0);
		Point p3 = new Point(2002.0, 0);

		set2.addPoint(p1);
		set2.addPoint(p2);
		set2.addPoint(p3);
		
		for (int i = 0; i < set.p.size(); i++) {
			assertEquals(set.p.get(i).x, set2.p.get(i).x, 0.0);
		}
	}
	
	/*
	 * Test to validate that Y values corresponding to the given years
	 * are correct and match the values on WorldBank API
	 */
	@Test
	public void validYValues() throws Exception {

		DataSet set = Data.fetchData("CAN", 2000, 2002, "SP.POP.TOTL");
		DataSet set2 = new DataSet();
		
		Point p1 = new Point(0, 30685730);
		Point p2 = new Point(0, 31020902);
		Point p3 = new Point(0, 31360079);

		set2.addPoint(p1);
		set2.addPoint(p2);
		set2.addPoint(p3);
		
		for (int i = 0; i < set.p.size(); i++) {
			assertEquals(set.p.get(i).y, set2.p.get(i).y, 0.0);
		}
	}
	
	/*
	 * Test to make sure the Point type has the correct values for x and y
	 */
	@Test
	public void validPoints() throws Exception {
		
		DataSet set = Data.fetchData("CAN", 2000, 2002, "SP.POP.TOTL");
		DataSet set2 = new DataSet();
		
		Point p1 = new Point(2000.0, 30685730);
		Point p2 = new Point(2001.0, 31020902);
		Point p3 = new Point(2002.0, 31360079);

		set2.addPoint(p1);
		set2.addPoint(p2);
		set2.addPoint(p3);
		
		for (int i = 0; i < set.p.size(); i++) {
			assertEquals(set.p.get(i).x, set2.p.get(i).x, 0.0);
			assertEquals(set.p.get(i).y, set2.p.get(i).y, 0.0);
		}
	}
	
	@Test
	public void Analysis1Test() throws Exception {
		java.util.List<DataSet> data = Analysis.getData("CA", 2013, 2014, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");

		DataSet setA1 = data.get(0);

		DataSet setA2 = new DataSet();
		Point p1 = new Point(2013.0, 0.66088205886719);
		setA2.addPoint(p1);
		Point p2 = new Point(2014.0, 0.07226167647251883);
		setA2.addPoint(p2);

		assertTrue(setA1.length() == setA2.length());

		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).x == setA2.p.get(i).x);
		}
		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).y == setA2.p.get(i).y);
		}

		DataSet setB1 = data.get(1);

		DataSet setB2 = new DataSet();
		Point p3 = new Point(2013.0, 0.13337046905228936);
		setB2.addPoint(p3);
		Point p4 = new Point(2014.0, 1.9903839328776405);
		setB2.addPoint(p4);

		assertTrue(setB1.length() == setB2.length());

		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).x == setB2.p.get(i).x);
		}
		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).y == setB2.p.get(i).y);
		}

		DataSet setC1 = data.get(2);

		DataSet setC2 = new DataSet();
		Point p5 = new Point(2013.0, -3.89488567794262);
		setC2.addPoint(p5);
		Point p6 = new Point(2014.0, -4.661617341617734);
		setC2.addPoint(p6);

		assertTrue(setC1.length() == setC2.length());

		for (int i = 0; i < setC1.length(); i++) {
			assertTrue(setC1.p.get(i).x == setC2.p.get(i).x);
		}
		for (int i = 0; i < setC1.length(); i++) {
			assertTrue(setC1.p.get(i).y == setC2.p.get(i).y);
		}

	}

	@Test
	public void Analysis2Test() throws Exception {

		java.util.List<DataSet> data = Analysis.getData("CA", 2016, 2017, "Annual Percentage Change of PM2.5 Air Pollution and Forest Area");
		// System.out.println(data.size());

		DataSet setA1 = data.get(0);

		DataSet setA2 = new DataSet();
		Point p1 = new Point(2016.0, -8.424812456352997);
		setA2.addPoint(p1);
		Point p2 = new Point(2017.0, -1.8428806069182628);
		setA2.addPoint(p2);

		assertTrue(setA1.length() == setA2.length());

		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).x == setA2.p.get(i).x);
		}
		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).y == setA2.p.get(i).y);
		}

		DataSet setB1 = data.get(1);

		DataSet setB2 = new DataSet();
		Point p3 = new Point(2016.0, -0.011428465741217331);
		setB2.addPoint(p3);
		Point p4 = new Point(2017.0, -0.010657606903764372);
		setB2.addPoint(p4);

		assertTrue(setB1.length() == setB2.length());

		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).x == setB2.p.get(i).x);
		}
		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).y == setB2.p.get(i).y);
		}

	}

	@Test
	public void Analysis3Test() throws Exception {

		java.util.List<DataSet> data = Analysis.getData("USA", 2010, 2016, "CO2 Emissions Per GDP");

		DataSet set = data.get(0);

		DataSet set2 = new DataSet();
		Point p1 = new Point(2010.0, 0.00035830437923793954);
		set2.addPoint(p1);
		Point p2 = new Point(2011.0, 0.00033164681184593017);
		set2.addPoint(p2);
		Point p3 = new Point(2012.0, 0.00030491377667339343);
		set2.addPoint(p3);
		Point p4 = new Point(2013.0, 0.0003023239539213515);
		set2.addPoint(p4);
		Point p5 = new Point(2014.0, 0.0002909978365683765);
		set2.addPoint(p5);
		Point p6 = new Point(2015.0, 0.00027412415002353634);
		set2.addPoint(p6);
		Point p7 = new Point(2016.0, 0.00026180641780438767);
		set2.addPoint(p7);

		assertTrue(set.length() == set2.length());

		for (int i = 0; i < set.length(); i++) {
			assertTrue(set.p.get(i).x == set2.p.get(i).x);
		}
		for (int i = 0; i < set.length(); i++) {
			assertTrue(set.p.get(i).y == set2.p.get(i).y);
		}
	}

	@Test
	public void Analysis4Test() throws Exception {
		PieDataSet data = Analysis.getPieData("FR", 2005, 2020, "Average Forest Area");

		PieDataSet set2 = new PieDataSet();
		set2.addSection(30.3158506785595);
		set2.addSection(100 - 30.3158506785595);

		for (int i = 0; i < data.length(); i++) {
			assertEquals(data.ds.get(0), set2.ds.get(0), 0.0);
		}
	}

	@Test
	public void Analysis5Test() throws Exception {

		PieDataSet data = Analysis.getPieData("CHN", 2008, 2008, "Average Government Expenditure on Education");

		PieDataSet set2 = new PieDataSet();

		set2.addSection(3.63000011444092);
		set2.addSection(100.0 - 3.63000011444092);

		for (int i = 0; i < data.length(); i++) {
			assertEquals(data.ds.get(0), set2.ds.get(0), 0.0);
		}

	}

	@Test
	public void Analysis6Test() throws Exception {

		java.util.List<DataSet> data = Analysis.getData("CA", 2000, 2003, "Health Expenditure Per Hospital Beds");

		DataSet set = data.get(0);

		DataSet set2 = new DataSet();
		Point p1 = new Point(2000.0, 0.017356419169708138);
		set2.addPoint(p1);
		Point p2 = new Point(2001.0, 0.018030744017429327);
		set2.addPoint(p2);
		Point p3 = new Point(2002.0, 0.01891636366040299);
		set2.addPoint(p3);
		Point p4 = new Point(2003.0, 0.023140584385238725);
		set2.addPoint(p4);

		assertTrue(set.length() == set2.length());

		for (int i = 0; i < set.length(); i++) {
			assertTrue(set.p.get(i).x == set2.p.get(i).x);
		}
		for (int i = 0; i < set.length(); i++) {
			assertTrue(set.p.get(i).y == set2.p.get(i).y);
		}
	}

	@Test
	public void Analysis8Test() throws Exception {

		java.util.List<DataSet> data = Analysis.getData("BRA", 2001, 2002, "Annual Percent Change of Expenditure on Education And Health Expenditure");

		DataSet setA1 = data.get(0);

		DataSet setA2 = new DataSet();
		Point p1 = new Point(2001.0, -2.639954457561476);
		setA2.addPoint(p1);
		Point p2 = new Point(2002.0, -2.4530011211256713);
		setA2.addPoint(p2);

		assertTrue(setA1.length() == setA2.length());

		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).x == setA2.p.get(i).x);
		}
		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).y == setA2.p.get(i).y);
		}

		DataSet setB1 = data.get(1);

		DataSet setB2 = new DataSet();
		Point p3 = new Point(2001.0, 2.5797720973728544);
		setB2.addPoint(p3);
		Point p4 = new Point(2002.0, 1.722314741621916);
		setB2.addPoint(p4);

		assertTrue(setB1.length() == setB2.length());

		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).x == setB2.p.get(i).x);
		}
		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).y == setB2.p.get(i).y);
		}

	}
	
	@Test
	public void TestScatter() throws Exception {
		Graph g = new ScatterGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"), gf.isEmpty);
	}

	
	@Test
	public void TestScatter2() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.wrongAnalysisType = true;
		assertEquals(null, gf.createGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution", "Pie Chart"));
	}
	
	@Test
	public void TestLine() throws Exception {
		Graph g = new LineGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"), gf.isEmpty);
	}

	
	
	@Test
	public void TestBar() throws Exception {
		Graph g = new BarGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"), gf.isEmpty);
	}

	
	
	@Test
	public void TestPie() throws Exception {
		Graph g = new PieGraph("CAN", 2017, 2019, "Average Forest Area");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2017, 2019, "Average Forest Area"), gf.isEmpty);
	}
	
	@Test
	public void Report() throws Exception {
		Graph g = new ReportGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"), gf.isEmpty);
	}
	
	@Test
	public void main1() throws Exception {
		Main m = new Main();
		String selected = "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution";
		m.analysisSelector.actionPerformed(null);
	}
	
	

}
