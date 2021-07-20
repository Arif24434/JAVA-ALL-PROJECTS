package Java8Features.Lambda;

import java.util.Locale;

public class LambdaMain {
    public static void main(String[] args) {
        String text = "Arif is learning java!";
        //TextVerifier textVerifier = new TextLengthLessThan10CharacterVerifier();
       // System.out.println(checkTextWithVerifier(text, textVerifier));
               /*TextVerifier LessThan10Characters = new TextVerifier() {
            @Override
            public boolean verifyText(String text) {
                return text.length()<10;
            }
        };
        System.out.println(checkTextWithVerifier(text,textVerifier));
        TextVerifier LessThan10CharactersLambda = (t) -> {
            return t.length() < 10;
        };
        System.out.println(checkTextWithVerifier(text, LessThan10CharactersLambda));
       TextVerifier lessthan10=(t)->{
           return t.length()<10;
       };
        System.out.println(checkTextWithVerifier(text, lessthan10));*/
        TextVerifier lessthanTen=(t)->t.length()<10;
        System.out.println(checkTextWithVerifier(text, lessthanTen));
        System.out.printf("is\'%s\'smaller than 10 chars:%s%n:",text,checkTextWithVerifier(text,t->t.length()<10));
        System.out.printf("is\'%s\'bigger than 10 chars:%s%n:",text,checkTextWithVerifier(text,t->t.length()>10));
        System.out.printf("is\'%s\'contains\'extra\'word:%s%n:",text,checkTextWithVerifier(text,t->t.contains("extra")));
        System.out.printf("is\'%s\'contains\'Arif\'word:%s%n:",text,checkTextWithVerifier(text,t->t.contains("Arif")));
        //System.out.printf("Output\'%s\'%s%n:")
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(20));



    }

    private static boolean checkTextWithVerifier(String text, TextVerifier verifier) {
        return verifier.verifyText(text);
    }
        private static int WordCount(String text, WordCount verifier) {
            return verifier.verifyText(text);
    }
}
