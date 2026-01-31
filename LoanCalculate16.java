class LoanCalculate16 {

    double calculateEMI(int principal, int time, float rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        return emi;
    }

    double calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        return emi;
    }

    double calculateEMI(int principal, int time) {
        double rate = 10.0;
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        return emi;
    }

    public static void main(String[] args) {
        LoanCalculate16 lc = new LoanCalculate16();

        double homeEMI = lc.calculateEMI(500000, 20, 7.5f);
        System.out.println("Home Loan EMI: " + homeEMI);

        double vehicleEMI = lc.calculateEMI(300000.0, 5, 9.0);
        System.out.println("Vehicle Loan EMI: " + vehicleEMI);

        double personalEMI = lc.calculateEMI(100000, 2);
        System.out.println("Personal Loan EMI: " + personalEMI);
    }
}
