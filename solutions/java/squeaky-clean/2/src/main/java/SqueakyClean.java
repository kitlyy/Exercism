class SqueakyClean {
    static String clean(String identifier) {

        char[] charArray = identifier.toCharArray();

        for (int i = 0; i < charArray.length; i ++) {
            if (charArray[i] == '-') {
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
            }
        }

        identifier = new String(charArray)
                .replace("4", "a")
                .replace("3", "e")
                .replace("0", "o")
                .replace("1", "l")
                .replace("7", "t")
                .replace(" ", "_")
                .replace("-", "")
                .replaceAll("[^A-Za-z_ ]", "");

        return identifier;
    }
}
