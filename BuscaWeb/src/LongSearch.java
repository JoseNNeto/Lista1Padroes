public class LongSearch implements SearchStrategy{
    private final WebSearchModel model;

    public LongSearch(WebSearchModel model) {
        this.model = model;

        WebSearchModel.QueryObserver longQueryObserver = new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                if (query.length() > 60) {
                    System.out.println("So long.... " + query);
                }
            }
        };

        model.addQueryObserver(longQueryObserver);
    }

    @Override
    public boolean search(String query) {
        return query.length() > 60;
    }
}
