package login;

import org.omg.CORBA.WrongTransactionHolder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String login, password, confirmPassword;
        System.out.println("type login: ");
        login = reader.readLine();
        System.out.println("type password: ");
        password = reader.readLine();
        System.out.println("repeat password: ");
        confirmPassword = reader.readLine();
        System.out.println(inputData(login, password, confirmPassword));

    }

    private static boolean inputData(String login, String password, String confirmPassword) throws IOException {



        try {
            Pattern pattern = Pattern.compile( "[A-Za-z0-9_]{1,20}",Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(login);
            Pattern pattern1 = Pattern.compile( "[A-Za-z0-9_]{1,20}",Pattern.CASE_INSENSITIVE);
            Matcher matcher1 = pattern1.matcher(password);
            if (matcher.matches() && login.length() < 20) {
                System.out.println("Login is correct");
            } else {
                throw new WrongLoginExeption();
            }
            if (matcher1.matches() && password.length() < 20) {

                if (password.equals(confirmPassword)) {
                    System.out.println("Password is correct");

                } else {
                    throw new WrongPasswordException();
                }
            }
        } catch (WrongPasswordException e) {
            System.out.println("Password incorrect");
            return false;

        } catch (WrongLoginExeption ex) {
            System.out.println("Login incorrect");
            return false;
        }
        return true;
    }


}

