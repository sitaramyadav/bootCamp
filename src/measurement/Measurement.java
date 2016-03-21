package measurement;

import exception.IdiotTeacherException;
import exception.IllegalComparisonException;

public class Measurement {
        private  double value;
        private  Unit unit;

        public Measurement(double value , Unit unit) {
            this.value = value;
            this.unit = unit;
        }
        private double round(double value, int places) {
            long factor = (long) Math.pow(10, places);
            value = value * factor;
            long newValue = Math.round(value);
            return (double) newValue / factor;
        }
        private Measurement toBase() {
            double value = round(this.value  * unit.getBaseFactor() ,2);
            Unit unit = this.unit.getBaseUnit();
            return new Measurement(value,unit);
        }
        private Measurement convert(Unit unit) {
            Measurement self = toBase();
            double newValue = round(self.value / unit.getBaseFactor() ,2);
            return  new Measurement(newValue,unit);
        }
        public  Measurement add (Measurement measurement) throws IdiotTeacherException {
            if(!canOperate(measurement))
                throw new IdiotTeacherException();
            Measurement measurementToAdd = measurement.toBase();
            Measurement self = toBase();
            double sum = round(self.value + measurementToAdd.value ,2);
            return new Measurement(sum ,unit.getBaseUnit());
        }
        public boolean compare ( Measurement measurement) throws IllegalComparisonException {
            if(!canOperate(measurement))
                throw new IllegalComparisonException();
            return  equals(measurement);
        }
        private boolean canOperate(Measurement measurement) {
            return  (measurement == null || unit.getClass() == measurement.unit.getClass());
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Measurement that = (Measurement) o;
            Measurement measurementForCompare = that.convert(unit);

            return Double.compare(value, measurementForCompare.value) == 0 && unit == measurementForCompare.unit;
        }

     @Override
        public String toString() {
        return "Measurement{" +
                "value=" + value +
                ", unit=" + unit +
                    '}';
    }
}
