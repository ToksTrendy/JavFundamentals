package assignment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.System.out;

public class DateCalculatorWithLoop {
    public static final String INVALID_OPS = "Invalid operation";
    public static final String HOURS = "Hours";
    public static final String DAYS = "Days";
    public static final String MONTHS = "Months";
    public static final String YEARS = "Years";
    public static final String RESULT_MESSAGE = "Your result is ";
    public static final int HOURS_OPERATION = 1;
    public static final int MONTH_OPERATION = 3;
    public static final int YEARS_OPERATION = 4;
    public static final int DAYS_OPERATION = 2;
    public static final int CURRENT_DATE_OPTION = 1;
    public static final int USER_INPUT_DATE_OPTION = 2;

    public static void main(String[] args) {
        //my variables
        LocalDateTime userDate;
        int specificOperation, operation, finalOption,dateOptionInput;
        String operationString = "addition";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        //Allow the player to choose an operation nd collect it into a variable

        do {
            operation = getUserIntInput("please choose operation: \n1. Addition \n2. Subtraction");

            //collect the date the player want to work on in a specific format
            dateOptionInput = getUserIntInput("please enter your date option: \n1. current date \n2. Another date");
            userDate = getUserDate(dateOptionInput, formatter);

            //allow the player to choose the part of the date the player wish to work on nd save it in a variable (hurs, days, month,year)
            if (operation == 2) {
                operationString = "subtraction";
            }
            String specificMessage = "please select specific operation on " + operationString + " of date\n1. " + HOURS + " \n2. " + DAYS + " \n3. " + MONTHS + " \n4. " + YEARS;
            specificOperation = getUserIntInput(specificMessage);

            //ask the range the player want to calculate to
            String specificOperationString = getSpecificOperationString(specificOperation);
            int numberToCalculate = getUserIntInput("Please input number of " + specificOperationString);

            //make the program do the calculation according to the players input nd give accurate result
            String result;
            if (operation == 1) {
                result = performOperation(userDate, specificOperation, operation, formatter, dateTimeFormatter, numberToCalculate);
            } else {
                result = performOperation(userDate, specificOperation, operation, formatter, dateTimeFormatter, numberToCalculate);
            }
            out.println(RESULT_MESSAGE + result);
            finalOption = Integer.parseInt(getUserStringInput("Do you want to continue: \n1. YES \n2. NO"));

        } while (finalOption==1);
    }

  //  private static String performSubtraction(LocalDateTime userDate, int specificOperation, DateTimeFormatter formatter, DateTimeFormatter dateTimeFormatter, int numberToCalculate) {
      //  switch (specificOperation) {
      //      case HOURS_OPERATION: {
           //     LocalDateTime result = userDate.minusHours(numberToCalculate);
          //      return formatDate(result, dateTimeFormatter);
        //    }
        //    case DAYS_OPERATION: {
         //       LocalDateTime result = userDate.minusDays(numberToCalculate);
           //     return formatDate(result, formatter);
         //   }
        //    case MONTH_OPERATION: {
         //       LocalDateTime result = userDate.minusMonths(numberToCalculate);
          //      return formatDate(result, formatter);
        //    }
        //    case YEARS_OPERATION: {
          //      LocalDateTime result = userDate.minusYears(numberToCalculate);
            //    return formatDate(result, formatter);
          //  }
         //   default:
           //     out.println(INVALID_OPS);
           //     exit(0);
      //  }
      //  return INVALID_OPS;
 //   }

    private static String performOperation(LocalDateTime userDate, int specificOperation, int operation, DateTimeFormatter formatter, DateTimeFormatter dateTimeFormatter, int numberToCalculate) {
        switch (specificOperation) {
            case HOURS_OPERATION: {
                LocalDateTime result;
                if(operation==1){
                result = userDate.plusHours(numberToCalculate);
            }else{
                    result = userDate.minusHours(numberToCalculate);
                }
                return formatDate(result, dateTimeFormatter);
            }
            case DAYS_OPERATION: {
                LocalDateTime result;
                if (operation==1){
                        result = userDate.plusDays(numberToCalculate);
                } else{
                    result = userDate.minusDays(numberToCalculate);
                }
                return formatDate(result, formatter);

            }
            case MONTH_OPERATION: {
                LocalDateTime result;
                if (operation==1){
                        result = userDate.plusMonths(numberToCalculate);
            }else {
                    result = userDate.minusMonths(numberToCalculate);
                }
                return formatDate(result, formatter);
            }
            case YEARS_OPERATION: {
                LocalDateTime result;
                if (operation ==1){
                        result = userDate.plusYears(numberToCalculate);
            }else{
                    result = userDate.minusYears(numberToCalculate);
                }
                return formatDate(result, formatter);
            }
            default:
                out.println(INVALID_OPS);
                exit(0);

        }
        return INVALID_OPS;
    }

    private static String getSpecificOperationString(int specificOperation) {
        switch (specificOperation) {
            case HOURS_OPERATION:
                return HOURS.toLowerCase();
            case MONTH_OPERATION:
                return MONTHS.toLowerCase();
            case YEARS_OPERATION:
                return YEARS.toLowerCase();
            default:
                return DAYS.toLowerCase();
        }
    }

    private static LocalDateTime getUserDate(int dateOptionInput, DateTimeFormatter formatter) {
        LocalDateTime userDate = LocalDateTime.now();
        if (dateOptionInput == CURRENT_DATE_OPTION) {
            userDate = LocalDateTime.now();
        } else if (dateOptionInput == USER_INPUT_DATE_OPTION) {
            String dateString = getUserStringInput("Please enter your date in format (dd/MM/yyyy)");
            LocalDate date = LocalDate.parse(dateString, formatter);
            userDate = date.atTime(LocalTime.NOON);
        }else {
            out.println(INVALID_OPS);
            exit(0);
        }
        return userDate;
    }

    private static String formatDate(LocalDateTime date, DateTimeFormatter formatter) {
        return date.format(formatter);
    }

    private static int getUserIntInput(String message) {
        Scanner scanner = new Scanner(in);
        out.println(message);
        return scanner.nextInt();
    }

    private static String getUserStringInput(String message) {
        Scanner scanner = new Scanner(in);
        out.println(message);
        return scanner.nextLine();
    }
}


