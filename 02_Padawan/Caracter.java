public class Caracter {
    public static void main(String[] args) {
        
        char[] name = {'C', 'a', 'r', 'l', 'o', 's'};

        for(char c : name) {
            int unicodeValue = (int) c;
            System.out.println("Carácter: " + c + ", Valor Unicode: " + unicodeValue);
        }
    }
    
}
