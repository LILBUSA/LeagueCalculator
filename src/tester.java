public class tester {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "sup adc";
        Champion rakan = new Champion("Rakan", arr, .50f, .02f, .01f);
        for (String str:rakan.getRoles()) {
            System.out.println(str);
        }
    }
}
