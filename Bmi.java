public class Bmi {
    
    double weight;
    double height;
    private double weightKG;
    private double heightM;

    public Bmi() {
        //empty constructor
    }

    public Bmi(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.weightKG = weight * 0.45359237;
        this.heightM = height * 0.0254;
    }

    public void setHeight(double height) {
        this.height = height;
        this.heightM = height * 0.0254;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.weightKG = weight * 0.45359237;
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
