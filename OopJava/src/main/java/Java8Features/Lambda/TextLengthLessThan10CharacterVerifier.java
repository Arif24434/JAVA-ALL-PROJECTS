package Java8Features.Lambda;

public class TextLengthLessThan10CharacterVerifier implements TextVerifier {

    @Override
    public boolean verifyText(String text) {
        return text.length()<10;
    }
}
