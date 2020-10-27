import java.util.Map;

public class Finance {
    public final static String BEST_LOAN_RATES = "bestLoanRates";
    public final static String SAVINGS_CALCULATOR = "savingsCalculator";
    public final static String MORTGAGE_CALCULATOR = "mortgageCalculator";
    public final static Map<String, String> commandsToUsage = Map.of(BEST_LOAN_RATES, "usage: bestLoanRates",
            SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
            MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");

}

private static boolean valideCommandArgument( String[] args){
    switch (args[0]){
        case BEST_LOAN_RATES : args.length = 1;
        case SAVINGS_CALCULATOR : args.length = 3;
        case MORTGAGE_CALCULATOR : args.length = 4;
    }
    return false;

}
