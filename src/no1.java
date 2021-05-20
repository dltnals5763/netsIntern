public class no1 {
    public static void main(String[] args) {
        String str = "aaa:bbb:ccc";
        // 1. split을 이용하기
        System.out.println(str.split(":")[1]);
        // 2. indexOf, lastIndexOf 를 이용하기
        System.out.println(str.substring(str.indexOf("b"),str.lastIndexOf("b")+1));
    }
}
