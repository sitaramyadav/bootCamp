public class Numbers {


    private int number;

    public Numbers(int number) {
        this.number = number;
    }

    public int multiplyWith(Numbers secondNumber) {
        return this.number * secondNumber.number;
    }

    public int add(Numbers secondNumber) {
        return this.number+ secondNumber.number;
    }
}
    