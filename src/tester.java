public class tester {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "Support";
        Champion rakan = new Champion("Rakan", arr, .50f, .02f, .01f);
        System.out.println(rakan.getRoles());
    }
}
