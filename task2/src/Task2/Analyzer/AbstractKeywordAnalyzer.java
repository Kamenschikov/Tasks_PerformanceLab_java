package Task2.Analyzer;

import Task2.Label;
import Task2.TextAnalyzer;

public abstract class AbstractKeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public final Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword: keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
