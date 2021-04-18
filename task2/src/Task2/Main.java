package Task2;

import Task2.Analyzer.NegativeTextAnalyzer;
import Task2.Analyzer.SpamAnalyzer;
import Task2.Analyzer.TooLongTextAnalyzer;

public class Main implements ExampleText {
    public static void main(String[] args) {
        TextAnalyzer[] textAnalyzers = {new NegativeTextAnalyzer(), new SpamAnalyzer(SPAM_TEXT),
            new TooLongTextAnalyzer(TEXT1.length() + 1)};
        System.out.println("TEXT1 = " + checkText(textAnalyzers, TEXT1));
        System.out.println("TEXT2 = " + checkText(textAnalyzers, TEXT2));
        System.out.println("TEXT3 = " + checkText(textAnalyzers, TEXT3));
        System.out.println("TEXT4 = " + checkText(textAnalyzers, TEXT4));
    }

    private static Label checkText(TextAnalyzer[] textAnalyzers, String text) {
        for (int i = 0; i < textAnalyzers.length; i++) {
            Label label = textAnalyzers[i].processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}
