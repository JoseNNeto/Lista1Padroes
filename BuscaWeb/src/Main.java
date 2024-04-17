import java.io.File;
/**
 * Launch the web-search example
 */
public class Main {
    public static void main(String[] args) {
        // Source file (in the project's data/ folder)
        File inputTextFile = new File("src/data/Hamlet.txt");

        // Build object graph
        WebSearchModel model = new WebSearchModel(inputTextFile);

        // Add the filters
        SearchStrategy wordSearch = new WordSearch(model);
        SearchStrategy longSearch = new LongSearch(model);

        // Create Snoopers
        Snooper snooperWord = new Snooper(model, wordSearch);
        Snooper snooperLong = new Snooper(model, longSearch);

        // Execute
        model.pretendToSearch();
    }
}