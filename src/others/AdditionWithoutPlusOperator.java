package others;

/******
 * Parveen Dala
 * Add two numbers without '+' operator.
 */
public class AdditionWithoutPlusOperator {
    public static void main(String[] args) {
        int num1 = 125;
        int num2 = 210;
        System.out.println(add(num1, num2));
    }

    private static int add(int num1, int num2) {
        int carry = num1 & num2;
        int result = num1 ^ num2;
        while (carry != 0) {
            carry = carry << 1;
            int tempCarry = result & carry;
            result = result ^ carry;
            carry = tempCarry;
        }
        return result;
    }
}
