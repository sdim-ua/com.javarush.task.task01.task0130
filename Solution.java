/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код
        
        
        Double fahrenheit = celsium / (5.0 / 9 ) + 32.0;

        return fahrenheit;
    }
}
