package Task2.Analyzer;

import Task2.Label;
import Task2.TextAnalyzer;

public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer {
    private final String[] KEYWORDS = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return KEYWORDS;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
