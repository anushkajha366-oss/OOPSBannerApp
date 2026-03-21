public class UC7 {
    public class OOPSBannerApp {

    static class CP {
        char ch;
        String[] p;

        CP(char ch, String[] p) {
            this.ch = ch;
            this.p = p;
        }
    }

    static String[] get(char c, CP[] arr) {
        for (CP x : arr)
            if (x.ch == c) return x.p;
        return new String[7];
    }

    public static void main(String[] args) {

        CP[] patterns = {
            new CP('O', new String[]{
                " ***** ","*     *","*     *","*     *","*     *","*     *"," ***** "
            }),
            new CP('P', new String[]{
                "****** ","*     *","*     *","****** ","*      ","*      ","*      "
            }),
            new CP('S', new String[]{
                " ***** ","*     *","*      "," ***** ","      *","*     *"," ***** "
            })
        };

        String word = "OOPS";
        StringBuilder[] lines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) lines[i] = new StringBuilder();

        for (char c : word.toCharArray()) {
            String[] pat = get(c, patterns);
            for (int i = 0; i < 7; i++)
                lines[i].append(pat[i]).append("  ");
        }

        for (StringBuilder l : lines) System.out.println(l);
    }
}
    

}
