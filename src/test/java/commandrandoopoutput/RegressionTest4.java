package commandrandoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearEnd;
        java.lang.String str12 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (-1);
        eraseGraph1.yearEnd = ' ';
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 10;
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearEnd = 0;
        int int11 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        int int14 = eraseGraph1.yearStart;
        int int15 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 0;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 0;
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.analysis = "";
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (byte) 100;
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) -1;
        java.lang.String str8 = eraseGraph1.country;
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "";
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 1;
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        java.lang.Class<?> wildcardClass14 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        int int13 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearEnd = (short) 10;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.Class<?> wildcardClass14 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "hi!";
        java.lang.String str12 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.yearEnd = (byte) 0;
        int int8 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.country;
        int int5 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) 100;
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearStart = (short) 1;
        eraseGraph1.analysis = "hi!";
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        java.lang.String str11 = eraseGraph1.country;
        java.lang.String str12 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (byte) 10;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 97;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str12 = eraseGraph1.country;
        eraseGraph1.yearEnd = (-1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.analysis = "hi!";
        java.lang.String str4 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        java.lang.String str11 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 1;
        eraseGraph1.analysis = "hi!";
        java.lang.String str13 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass14 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.country;
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.yearEnd = (byte) 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 52;
        eraseGraph1.yearStart = (byte) 10;
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass16 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.yearEnd = (byte) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int7 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = (short) 0;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        int int15 = eraseGraph1.yearStart;
        int int16 = eraseGraph1.yearEnd;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.analysis = "hi!";
        java.lang.String str11 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        int int12 = eraseGraph1.yearEnd;
        java.lang.String str13 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.graphType;
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.yearStart = 0;
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.graphType;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearEnd = '4';
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        int int12 = eraseGraph1.yearEnd;
        java.lang.String str13 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        java.lang.String str16 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "";
        eraseGraph1.country = "";
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearStart = (-1);
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.country = "";
        java.lang.String str15 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = (short) -1;
        java.lang.String str15 = eraseGraph1.analysis;
        java.lang.String str16 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.graphType;
        eraseGraph1.yearStart = (short) 100;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        int int8 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str11 = eraseGraph1.country;
        java.lang.String str12 = eraseGraph1.country;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.yearStart = '4';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str11 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        java.lang.String str14 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = '4';
        eraseGraph1.analysis = "";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        java.lang.String str11 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "hi!";
        int int11 = eraseGraph1.yearStart;
        java.lang.String str12 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (short) 10;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = (byte) 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = 32;
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.analysis;
        java.lang.String str12 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "hi!";
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "hi!";
        int int11 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearStart = (byte) -1;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = (short) 1;
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 100;
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.country = "";
        int int11 = eraseGraph1.yearEnd;
        java.lang.String str12 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearStart = 'a';
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearEnd = 0;
        java.lang.String str11 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.graphType = "hi!";
        java.lang.Class<?> wildcardClass14 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        eraseGraph1.yearStart = 35;
        eraseGraph1.country = "";
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        java.lang.String str14 = eraseGraph1.graphType;
        int int15 = eraseGraph1.yearEnd;
        java.lang.String str16 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = 52;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        int int7 = eraseGraph1.yearStart;
        int int8 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 0;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str19 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass20 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str13 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = '#';
        eraseGraph1.graphType = "hi!";
        eraseGraph1.analysis = "hi!";
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.analysis = "";
        java.lang.String str11 = eraseGraph1.country;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearStart = 97;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str11 = eraseGraph1.country;
        java.lang.String str12 = eraseGraph1.country;
        java.lang.String str13 = eraseGraph1.graphType;
        int int14 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.analysis;
        int int10 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 0;
        eraseGraph1.analysis = "hi!";
        int int13 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        java.lang.String str7 = eraseGraph1.analysis;
        java.lang.String str8 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 1;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "hi!";
        int int12 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = '#';
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 10;
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.country = "";
        int int14 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        int int12 = eraseGraph1.yearEnd;
        java.lang.String str13 = eraseGraph1.country;
        java.lang.String str14 = eraseGraph1.country;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 100;
        java.lang.String str14 = eraseGraph1.country;
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = 10;
        java.lang.String str12 = eraseGraph1.country;
        int int13 = eraseGraph1.yearEnd;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str13 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (-1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = '#';
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        int int10 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearStart = (short) 10;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = '#';
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = 100;
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str11 = eraseGraph1.country;
        java.lang.String str12 = eraseGraph1.country;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str19 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 52;
        java.lang.String str13 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.country = "hi!";
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 1;
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearStart;
        java.lang.String str12 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.country;
        eraseGraph1.yearStart = 0;
        eraseGraph1.yearEnd = (short) 0;
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        int int8 = eraseGraph1.yearStart;
        java.lang.String str9 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        java.lang.String str8 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        java.lang.String str11 = eraseGraph1.analysis;
        int int12 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (short) 0;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.country;
        eraseGraph1.yearStart = 0;
        eraseGraph1.yearEnd = (short) 0;
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (short) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.graphType = "hi!";
        int int13 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearEnd = (byte) 1;
        java.lang.String str11 = eraseGraph1.graphType;
        java.lang.String str12 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = (short) 1;
        int int20 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = 52;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.country;
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = ' ';
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str15 = eraseGraph1.country;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "";
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 1;
        eraseGraph1.analysis = "";
        int int11 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        int int14 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 32;
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "";
        int int12 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 0;
        eraseGraph1.graphType = "";
        java.lang.String str17 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        java.lang.String str4 = eraseGraph1.graphType;
        java.lang.String str5 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        int int6 = eraseGraph1.yearEnd;
        int int7 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = 52;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        int int7 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 10;
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = ' ';
        java.lang.String str14 = eraseGraph1.analysis;
        java.lang.String str15 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        int int10 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "";
        int int13 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = '4';
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass16 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.country;
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.graphType = "hi!";
        int int15 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = '#';
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 'a';
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 32;
        eraseGraph1.yearEnd = (byte) 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        eraseGraph1.yearEnd = 35;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 52;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.yearStart = 100;
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = ' ';
        eraseGraph1.yearStart = (short) 0;
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.graphType;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = ' ';
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        java.lang.String str12 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = 0;
        int int11 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.graphType;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearEnd;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = ' ';
        java.lang.String str13 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.country = "";
        java.lang.String str12 = eraseGraph1.graphType;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.graphType = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.country;
        eraseGraph1.country = "hi!";
        java.lang.String str11 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.country;
        eraseGraph1.country = "";
        java.lang.String str14 = eraseGraph1.graphType;
        int int15 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        int int9 = eraseGraph1.yearEnd;
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 0;
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str11 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.graphType;
        java.lang.String str12 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 52;
        eraseGraph1.yearStart = (short) 10;
        eraseGraph1.yearStart = (byte) 1;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "";
        java.lang.String str8 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (-1);
        java.lang.String str9 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearStart = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        java.lang.String str5 = eraseGraph1.analysis;
        java.lang.String str6 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.country;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = '4';
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int11 = eraseGraph1.yearEnd;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 10;
        eraseGraph1.country = "";
        int int17 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.country;
        eraseGraph1.country = "";
        java.lang.String str14 = eraseGraph1.graphType;
        java.lang.String str15 = eraseGraph1.country;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.country;
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearEnd;
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.country = "";
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 10;
        java.lang.String str15 = eraseGraph1.graphType;
        eraseGraph1.graphType = "";
        java.lang.String str18 = eraseGraph1.country;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        int int12 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str13 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        java.lang.String str7 = eraseGraph1.country;
        int int8 = eraseGraph1.yearEnd;
        int int9 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 0;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str19 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 'a';
        java.lang.String str11 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = (short) 10;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        int int4 = eraseGraph1.yearEnd;
        java.lang.String str5 = eraseGraph1.analysis;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearStart = (-1);
        eraseGraph1.yearEnd = 10;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 1;
        int int15 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (short) 0;
        int int14 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "";
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearStart;
        int int12 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearEnd = 0;
        java.lang.String str11 = eraseGraph1.analysis;
        java.lang.String str12 = eraseGraph1.graphType;
        java.lang.String str13 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.analysis;
        int int12 = eraseGraph1.yearStart;
        int int13 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.country;
        eraseGraph1.country = "hi!";
        java.lang.String str11 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        int int10 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "";
        java.lang.String str13 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearEnd = 0;
        java.lang.String str11 = eraseGraph1.analysis;
        java.lang.String str12 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearStart = (-1);
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 0;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        java.lang.String str11 = eraseGraph1.graphType;
        java.lang.String str12 = eraseGraph1.analysis;
        java.lang.String str13 = eraseGraph1.country;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        int int10 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        int int12 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 52;
        eraseGraph1.yearStart = (short) 10;
        eraseGraph1.yearStart = (byte) 1;
        eraseGraph1.analysis = "hi!";
        int int19 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearStart = 0;
        eraseGraph1.yearStart = 52;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        java.lang.String str11 = eraseGraph1.graphType;
        java.lang.String str12 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.graphType = "";
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        java.lang.String str8 = eraseGraph1.country;
        java.lang.String str9 = eraseGraph1.country;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        int int14 = eraseGraph1.yearStart;
        int int15 = eraseGraph1.yearStart;
        int int16 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearStart = (short) 1;
        eraseGraph1.yearStart = (short) 1;
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        int int7 = eraseGraph1.yearStart;
        int int8 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str16 = eraseGraph1.analysis;
        java.lang.String str17 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.analysis = "hi!";
        java.lang.String str22 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 100;
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass18 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str14 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (short) 10;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearEnd = 97;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int11 = eraseGraph1.yearEnd;
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 1;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.graphType = "";
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str14 = eraseGraph1.graphType;
        java.lang.String str15 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str14 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.Class<?> wildcardClass17 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (byte) 10;
        int int9 = eraseGraph1.yearStart;
        java.lang.String str10 = eraseGraph1.country;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = '#';
        java.lang.String str12 = eraseGraph1.graphType;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "";
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.graphType;
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = 35;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = '#';
        eraseGraph1.graphType = "hi!";
        int int10 = eraseGraph1.yearEnd;
        java.lang.String str11 = eraseGraph1.country;
        int int12 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int13 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = 0;
        int int14 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) -1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        java.lang.String str5 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 100;
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.country;
        int int12 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = 100;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (short) 10;
        java.lang.String str11 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearEnd = 100;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str15 = eraseGraph1.country;
        int int16 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        int int12 = eraseGraph1.yearEnd;
        java.lang.String str13 = eraseGraph1.country;
        int int14 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "hi!";
        java.lang.String str12 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str13 = eraseGraph1.analysis;
        int int14 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        java.lang.String str12 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 52;
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str15 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = '#';
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.analysis = "";
        java.lang.String str14 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearStart = 'a';
        java.lang.String str6 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearStart;
        java.lang.String str12 = eraseGraph1.country;
        eraseGraph1.yearEnd = 32;
        java.lang.String str15 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "hi!";
        int int12 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = 10;
        eraseGraph1.graphType = "";
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        java.lang.String str16 = eraseGraph1.country;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearEnd = 0;
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = 52;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 100;
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        java.lang.String str9 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str8 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.analysis = "";
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        int int13 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.analysis;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearEnd = 0;
        java.lang.String str11 = eraseGraph1.analysis;
        int int12 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = (short) 100;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 1;
        java.lang.String str15 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str16 = eraseGraph1.analysis;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = 10;
        int int21 = eraseGraph1.yearEnd;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearStart = 52;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = (byte) 1;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.country;
        int int5 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = '#';
        java.lang.String str10 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int7 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = (short) 0;
        eraseGraph1.analysis = "";
        java.lang.String str12 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = 10;
        eraseGraph1.analysis = "hi!";
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str18 = eraseGraph1.graphType;
        eraseGraph1.yearStart = '#';
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        int int9 = eraseGraph1.yearEnd;
        int int10 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) -1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearStart;
        int int7 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 100;
        java.lang.String str12 = eraseGraph1.graphType;
        java.lang.String str13 = eraseGraph1.analysis;
        int int14 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "";
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearEnd;
        java.lang.String str12 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        java.lang.String str8 = eraseGraph1.country;
        int int9 = eraseGraph1.yearEnd;
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        int int13 = eraseGraph1.yearEnd;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.analysis = "";
        java.lang.String str12 = eraseGraph1.country;
        eraseGraph1.yearEnd = 35;
        java.lang.String str15 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.country;
        int int5 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = '#';
        eraseGraph1.yearEnd = (short) 1;
        int int12 = eraseGraph1.yearStart;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        int int11 = eraseGraph1.yearEnd;
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        int int9 = eraseGraph1.yearEnd;
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = 0;
        eraseGraph1.yearStart = (short) 0;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (byte) 1;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        int int15 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str10 = eraseGraph1.graphType;
        int int11 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.analysis;
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        int int10 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "";
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.country;
        java.lang.String str12 = eraseGraph1.country;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.country = "";
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = (-1);
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str10 = eraseGraph1.country;
        java.lang.String str11 = eraseGraph1.analysis;
        int int12 = eraseGraph1.yearEnd;
        java.lang.String str13 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 100;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        java.lang.String str12 = eraseGraph1.country;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "";
        int int12 = eraseGraph1.yearStart;
        int int13 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = '4';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        int int4 = eraseGraph1.yearEnd;
        int int5 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = 97;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str10 = eraseGraph1.country;
        java.lang.String str11 = eraseGraph1.analysis;
        int int12 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 0;
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = 10;
        eraseGraph1.yearEnd = 52;
        eraseGraph1.yearEnd = (-1);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) 1;
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str18 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 35;
        java.lang.String str11 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearStart = 10;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.country;
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = (byte) 100;
        int int12 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.graphType = "hi!";
        int int12 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.country = "";
        eraseGraph1.country = "";
        java.lang.String str14 = eraseGraph1.country;
        java.lang.String str15 = eraseGraph1.country;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.country;
        int int12 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = (short) 100;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        int int12 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.yearStart = (byte) 1;
        eraseGraph1.yearEnd = '4';
        int int14 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        java.lang.String str5 = eraseGraph1.analysis;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.analysis = "";
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 10;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.analysis = "";
        int int8 = eraseGraph1.yearStart;
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "";
        java.lang.String str14 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        eraseGraph1.country = "hi!";
        java.lang.String str14 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.country;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = (byte) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 0;
        eraseGraph1.yearStart = ' ';
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str22 = eraseGraph1.analysis;
        java.lang.String str23 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str6 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str15 = eraseGraph1.country;
        int int16 = eraseGraph1.yearStart;
        java.lang.String str17 = eraseGraph1.country;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str16 = eraseGraph1.analysis;
        java.lang.String str17 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str20 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        java.lang.String str7 = eraseGraph1.analysis;
        int int8 = eraseGraph1.yearEnd;
        java.lang.String str9 = eraseGraph1.country;
        java.lang.String str10 = eraseGraph1.graphType;
        int int11 = eraseGraph1.yearEnd;
        java.lang.String str12 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearStart = '4';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "";
        int int12 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 0;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        int int12 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = (short) 1;
        int int15 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str15 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.country;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.analysis = "";
        java.lang.String str14 = eraseGraph1.country;
        int int15 = eraseGraph1.yearEnd;
        int int16 = eraseGraph1.yearStart;
        int int17 = eraseGraph1.yearEnd;
        java.lang.String str18 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.graphType = "";
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = 97;
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        int int2 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "";
        java.lang.String str5 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
    }
}

