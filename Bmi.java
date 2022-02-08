public class Bmi {
    
    double weight;
    double height;
    private double weightKG;
    private double heightM;
    private static final double poundToKg = 0.45359237;
    private static final double inchToM = 0.0254;

    public Bmi() {
        this.weight = 0;
        this.height = 0;
        this.weightKG = 0;
        this.heightM = 0;
    }

    public Bmi(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.weightKG = weight * poundToKg;
        this.heightM = height * inchToM;
    }

    public void setHeight(double height) {
        this.height = height;
        this.heightM = height * inchToM;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.weightKG = weight * poundToKg;
    }

    public double getBMI() {
        return this.weightKG/Math.pow(heightM, 2);
    }

    public String getBMIClass() {

        double bmi = this.getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }

    }
}
