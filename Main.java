
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        int j = 0;
        for (int i = 0; i < t.length - 1; i++, j++) {
           if ((i + 1) % 4 == 0) {
                sb.append(" ").append(t[i]).append(",\n");
            } else {
                sb.append(" ").append(t[i]).append(",");
            }
            
        }
        sb.append(" ").append(t[t.length - 1]);
        sb.append("\n}");
        String word = sb.toString();
        return word;
    }
}
