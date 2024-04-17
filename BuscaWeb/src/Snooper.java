/**
 * Watches the search queries
 */
public class Snooper implements WebSearchModel.QueryObserver{
    private final SearchStrategy strategy;

    public Snooper(WebSearchModel model, SearchStrategy strategy) {
        this.strategy = strategy;
        model.addQueryObserver(this);
    }

    @Override
    public void onQuery(String query) {
        boolean result = strategy.search(query);
    }
}
