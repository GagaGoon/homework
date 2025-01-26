package module2.Ex10;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}