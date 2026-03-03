
public class OOPSBannerApp {

   
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    private static String[] createOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    private static String[] createPPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    private static String[] createSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        CharacterPatternMap[] characters = {
                new CharacterPatternMap('O', createOPattern()),
                new CharacterPatternMap('P', createPPattern()),
                new CharacterPatternMap('S', createSPattern())
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPatternMap cp : characters) {
                    if (cp.getCharacter() == ch) {
                        lineBuilder.append(cp.getPattern()[row]).append(" ");
                        break;
                    }
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}