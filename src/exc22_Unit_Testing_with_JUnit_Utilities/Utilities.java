package exc22_Unit_Testing_with_JUnit_Utilities;

public class Utilities {

    // returns a char array containing every nth char, when
    // sourceArray.length < n returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {
        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] res = new char[returnedLength];
        int index = 0;
        for (int i = n - 1; i < sourceArray.length; i += n) {
            res[index++] = sourceArray[i];
        }
        return res;
    }

    // remove pairs of the same character that are next
    // to each other, by removing on a occurrence of that character
    // "ABCDEEEEF" --> "ABCDEF"
    // "ABCBDEEFF" --> "ABCBDEF" (the two B's aren't next to each other, so they
    // aren't removed.
    public String removeDuplicatedCharacter(String source) {
        if (source == null || source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();
        for (int i = 0; i < string.length - 1; i++) {
            if (string[i] != string[i + 1]) {
                sb.append(string[i]);
            }
        }
        // add last letter
        sb.append(string[string.length - 1]);
        System.out.println(sb);
        return sb.toString();
    }

    public int converter(int a, int b) {
        return (a / b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }
        return null;
    }

}
