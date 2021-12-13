package StructuralPattern.adapter.adapterexample2;

import java.time.LocalDate;
import java.util.Scanner;

public class ThirdPartyLoggerAdapter implements LoggerService{

    private ThirdPartyLogger thirdPartyLogger;

    @Override
    public void logAt(String loglanacakYer) {
        Scanner scanner = new Scanner(System.in);
        int localDate = scanner.nextInt();
        thirdPartyLogger.LoglamaYap(loglanacakYer,localDate);
    }
}
