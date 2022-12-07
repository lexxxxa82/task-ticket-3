public class Main {
    public static void main(String[] args) {
        String str = "строка которую делим";

        final int middle = str.length() / 2;// найдем  середину строки
        String firstPart = str.substring(0, middle);//применим метод substring
        String secondPart = str.substring(middle);

        System.out.println(firstPart);

        System.out.println(secondPart);
    }
}