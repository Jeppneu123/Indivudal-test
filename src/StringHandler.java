public class StringHandler {
    public static String stringManipulation(String str)
    {

        return str.replaceAll("(?i)c","s");
    }
    public static int stringLength(String str)
    {
        if (str == "" || str == null){
            return 0;
        } else {
            return str.length();
        }
    }

    public static int stringArrayLength(String[] arr)
    {
            int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += arr[i].length();
        }
        return counter;
    }

    public static String stringReverse(String str)
    {
        StringBuilder argumentStringBuilder = new StringBuilder(str);
        argumentStringBuilder.reverse();
        return argumentStringBuilder.toString();
    }
}
