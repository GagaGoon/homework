package module2.Ex10;

public class Main {
    public static Label checkLabels(String text, String[] keywords, int maxLength) {
        SpamAnalyzer sA = new SpamAnalyzer(keywords);
        NegativeTextAnalyzer nA = new NegativeTextAnalyzer();
        TooLongAnalyzer tLA = new TooLongAnalyzer(maxLength);
        if(tLA.processText(text)==Label.TOO_LONG){
            return Label.TOO_LONG;
        }
        if(nA.processText(text)==Label.NEGATIVE_TEXT){
            return Label.NEGATIVE_TEXT;
        }
        if(sA.processText(text)==Label.SPAM){
            return Label.SPAM;
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        System.out.println(checkLabels("akn;valsjfреклам:а", new String[]{"реклам"},100));
    }
}
