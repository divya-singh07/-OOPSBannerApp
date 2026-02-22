public class OOPSBannerApp {

    public static void main(String[] args) {

        String o1 = "  *****  ";
        String o2 = " *     * ";
        String o3 = " *     * ";
        String o4 = " *     * ";
        String o5 = " *     * ";
        String o6 = " *     * ";
        String o7 = "  *****  ";

        String p1 = " ******* ";
        String p2 = " *     * ";
        String p3 = " ******* ";
        String p4 = " *       ";
        String p5 = " *       ";
        String p6 = " *       ";
        String p7 = " *       ";

        String s1 = " ******* ";
        String s2 = " *       ";
        String s3 = " ******* ";
        String s4 = "       * ";
        String s5 = "       * ";
        String s6 = "       * ";
        String s7 = " ******* ";

        // Create array to store all banner lines
        String[] bannerLines = new String[7];

        bannerLines[0] = String.join(" ", o1, o1, p1, s1);
        bannerLines[1] = String.join(" ", o2, o2, p2, s2);
        bannerLines[2] = String.join(" ", o3, o3, p3, s3);
        bannerLines[3] = String.join(" ", o4, o4, p4, s4);
        bannerLines[4] = String.join(" ", o5, o5, p5, s5);
        bannerLines[5] = String.join(" ", o6, o6, p6, s6);
        bannerLines[6] = String.join(" ", o7, o7, p7, s7);

        // Print using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}