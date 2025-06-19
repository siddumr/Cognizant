public class ForecastTest {

    public static void main(String[] args) {
        double initialInvestment = 10000.0; 
        double annualGrowthRate = 0.08;     
        int years = 5;

        double futureValueRecursive = FinancialForecast.forecastRecursive(initialInvestment, annualGrowthRate, years);
        double futureValueIterative = FinancialForecast.forecastIterative(initialInvestment, annualGrowthRate, years);

        System.out.println("Financial Forecast using Recursion:");
        System.out.printf("Value after %d years: ₹%.2f%n", years, futureValueRecursive);

        System.out.println("\nFinancial Forecast using Iteration (Optimized):");
        System.out.printf("Value after %d years: ₹%.2f%n", years, futureValueIterative);

        System.out.println("\nAnalysis:");
        System.out.println("- Recursion simplifies the logic but uses more memory due to function calls.");
        System.out.println("- Time Complexity: O(n) for both recursive and iterative versions.");
        System.out.println("- Iteration is preferred for large input to prevent stack overflow and improve performance.");
    }
}
