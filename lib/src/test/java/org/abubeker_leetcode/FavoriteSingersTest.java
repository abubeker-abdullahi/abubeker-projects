package org.abubeker_leetcode;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FavoriteSingersTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testFavoriteSingers_BasicCase() {
        String input = "5\n1 2 2 3 3\n";
        String expectedOutput = "2\n";
        provideInput(input);
        FavoriteSingers.main(new String[]{});
        assertEquals(expectedOutput, getOutput());
    }

    @Test
    public void testFavoriteSingers_AllUniqueSingers() {
        String input = "5\n1 2 3 4 5\n";
        String expectedOutput = "5\n";
        provideInput(input);
        FavoriteSingers.main(new String[]{});
        assertEquals(expectedOutput, getOutput());
    }

    @Test
    public void testFavoriteSingers_SameSingerAllSongs() {
        String input = "5\n1 1 1 1 1\n";
        String expectedOutput = "1\n";
        provideInput(input);
        FavoriteSingers.main(new String[]{});
        assertEquals(expectedOutput, getOutput());
    }

    @Test
    public void testFavoriteSingers_EmptyPlaylist() {
        String input = "0\n";
        String expectedOutput = "0\n"; // Empty playlist
        provideInput(input);
        FavoriteSingers.main(new String[]{});
        assertEquals(expectedOutput, getOutput());
    }

    @Test
    public void testFavoriteSingers_LargePlaylist() {
        String input = "10\n1 2 3 4 5 1 2 3 4 5\n";
        String expectedOutput = "5\n"; // Five unique singers
        provideInput(input);
        FavoriteSingers.main(new String[]{});
        assertEquals(expectedOutput, getOutput());
    }

    
    private void provideInput(String data) {
        InputStream in = new ByteArrayInputStream(data.getBytes());
        System.setIn(in);
    }

    private String getOutput() {
        return outContent.toString();
    }
}
