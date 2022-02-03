import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException { 
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, links);
    }
    
    /**  
    @Test
    public void testGetLinks2() throws IOException { 
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, links);
    }
    */
    
    
    public void testGetLinks3() throws IOException { 
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks4() throws IOException { 
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks5() throws IOException { 
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("page.com");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks6() throws IOException { 
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("page.com");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks7() throws IOException { 
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks8() throws IOException { 
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("");
        assertEquals(expected, links);
    }
    
}