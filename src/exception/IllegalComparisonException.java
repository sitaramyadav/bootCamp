package exception;


    public class IllegalComparisonException extends Exception {
        public IllegalComparisonException() {
            super("Can't compare unequal physical quantity");
        }
}
