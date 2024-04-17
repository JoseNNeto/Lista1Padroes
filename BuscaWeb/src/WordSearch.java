public class WordSearch implements SearchStrategy{
    private final WebSearchModel model;

    public WordSearch(WebSearchModel model) {
        this.model = model;

        WebSearchModel.QueryObserver friendQueryObserver = query -> {
            if (query.toLowerCase().contains("friend")) {
                System.out.println("Oh Yes! " + query);
            }
        };

        // Adiciona o observador ao modelo
        model.addQueryObserver(friendQueryObserver);
    }

    @Override
    public boolean search(String query) {
        return query.toLowerCase().contains("friend");
    }
}
