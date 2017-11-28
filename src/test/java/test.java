import org.junit.Test;

import javax.xml.xquery.XQException;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class test {

    Main test;
    public test() throws XQException {
        test = new Main();
    }

    @Test
    public void test3a() throws FileNotFoundException, XQException {
        String expected = "[Sed Incorporated, Enim Associates, Ligula Company, Felis PC, Donec LLC, Interdum Feugiat Industries, Ut Erat Sed Consulting, Malesuada Inc., Nec Tellus Nunc LLP, Posuere Cubilia Curae; Limited, Ullamcorper Velit PC, Per Conubia Nostra Limited, Duis Foundation, Egestas Ligula Associates, Nam Tempor Diam Ltd]";
        assertEquals(expected, test.execute(Main.commands.get("3a")));
    }

    @Test
    public void test3b() throws FileNotFoundException, XQException {
        String expected = "[Alisa T. Carver, Brynn X. Valencia, Camden R. Terry, Ciara J. Hull, Duis Foundation, Erin A. Cole, Fiona L. Whitney, Hall C. Shaffe, Hall C. Shaffer, Lionel W. Dickson, Lysandra G. Elliott, Mannix B. Roman]";
        assertEquals(expected, test.execute(Main.commands.get("3b")));
    }

    @Test
    public void test3c() throws FileNotFoundException, XQException {
        String expected = "[action, comedy, drama, fantasy, poem, sci-fi]";
        assertEquals(expected, test.execute(Main.commands.get("3c")));
    }

    @Test
    public void test3d2() throws FileNotFoundException, XQException {
        String expected = "[Aliquam Institute, Aliquet LLP, At Arcu Vestibulum Foundation, At Augue Corp., Commodo LLC, Elit Sed Consequat Industries, Magna A Neque Associates, Mauris Blandit Enim LLC, Non Corp., Sed Id Risus Institute, Sed Nunc Consulting, Tellus Sem Company, Ultrices Inc., Vivamus Ltd]";
        assertEquals(expected, test.execute(Main.commands.get("3d2")));
    }

    @Test
    public void test3e() throws FileNotFoundException, XQException {
        String expected = "[Nec Tellus Nunc LLP, Ullamcorper Velit PC, Nam Tempor Diam Ltd]";
        assertEquals(expected, test.execute(Main.commands.get("3e")));
    }

    @Test
    public void test3f() throws FileNotFoundException, XQException {
        String expected = "[Duis Foundation, Nam Tempor Diam Ltd]";
        assertEquals(expected, test.execute(Main.commands.get("3f")));
    }

    @Test
    public void test3g() throws FileNotFoundException, XQException {
        String expected = "[Interdum Feugiat Industries, Posuere Cubilia Curae; Limited, Nam Tempor Diam Ltd]";
        assertEquals(expected, test.execute(Main.commands.get("3g")));
    }

    @Test
    public void test3h() throws FileNotFoundException, XQException {
        String expected = "[Ullamcorper Velit PC, Malesuada Inc., Posuere Cubilia Curae; Limited, Ut Erat Sed Consulting, Felis PC, Egestas Ligula Associates, Interdum Feugiat Industries, Duis Foundation, Per Conubia Nostra Limited]";
        assertEquals(expected, test.execute(Main.commands.get("3h")));
    }

    @Test
    public void test3i() throws FileNotFoundException, XQException {
        String expected = "[Posuere Cubilia Curae; Limited, Ut Erat Sed Consulting, Ullamcorper Velit PC]";
        assertEquals(expected, test.execute(Main.commands.get("3i")));
    }

    @Test
    public void test3j1() throws FileNotFoundException, XQException {
        String expected = "[3]";
        assertEquals(expected, test.execute(Main.commands.get("3j1")));
    }

    @Test
    public void test3j2() throws FileNotFoundException, XQException {
        String expected = "[225]";
        assertEquals(expected, test.execute(Main.commands.get("3j2")));
    }

    @Test
    public void test3k1() throws FileNotFoundException, XQException {
        String expected = "[4]";
        assertEquals(expected, test.execute(Main.commands.get("3k1")));
    }

    @Test
    public void test3k2() throws FileNotFoundException, XQException {
        String expected = "[11]";
        assertEquals(expected, test.execute(Main.commands.get("3k2")));
    }
}
