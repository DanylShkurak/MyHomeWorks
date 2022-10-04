package homework8;

import homework8.entity.Client;
import homework8.exception.WrongFieldException;
import homework8.exception.WrongSumException;
import homework8.service.TransactionService;
import homework8.util.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        Client client = new Client();
        boolean forLoop = true;
        checkSenderAccId(helper, client, forLoop);
        forLoop = true;
        String clientAccIdWhoReceive = "";
        clientAccIdWhoReceive =checkReceiverAccId(helper, forLoop, clientAccIdWhoReceive);
        forLoop = true;
        checkSumOfTransaction(helper,client, forLoop);
        TransactionService transactionService = new TransactionService();
        transactionService.transferOfMoney(client,clientAccIdWhoReceive );
        System.out.println("Transaction is successfully completed");

    }

    private static void checkSumOfTransaction(Helper helper,Client client, boolean forLoop) {
        while (forLoop) {
            forLoop = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter sum of transaction: ");
            float sumOfTransaction = scanner.nextFloat();
            client.setSum(sumOfTransaction);
            try {
                helper.checkSum(sumOfTransaction);
            } catch (WrongSumException e) {
                System.out.println("You entered wrong sum. It should be <1000 ");
                forLoop = true;
            }
        }
    }

    private static String checkReceiverAccId(Helper helper, boolean forLoop, String clientAccIdWhoReceive) {
        while (forLoop) {
            forLoop = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter recipient account ID: ");
            clientAccIdWhoReceive = scanner.next();
            try {
                helper.checkClientAccId(clientAccIdWhoReceive);
            } catch (WrongFieldException e) {
                System.out.println("You entered wrong ID. Try again ");
                forLoop = true;
            }
        }
        return clientAccIdWhoReceive;
    }

    private static void checkSenderAccId(Helper helper, Client client, boolean forLoop) {
        while (forLoop) {
            forLoop = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your account ID: ");
            String clientAccIdWhoSend = scanner.next();
            client.setClientAccID(clientAccIdWhoSend);
            try {
                helper.checkClientAccId(clientAccIdWhoSend);
            } catch (WrongFieldException e) {
                System.out.println("You entered wrong ID. Try again ");
                forLoop = true;
            }
        }
    }

}
