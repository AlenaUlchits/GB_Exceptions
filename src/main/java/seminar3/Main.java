package seminar3;

import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Checker checker = new Checker();
        System.out.printf("Enter your Surname Name and Patronymic, sex(f/m), " +
                "date of birth in format dd.mm.yyyy, phone of %d digits with space: \n", checker.getPhoneNumberLength());
        String value = sc.nextLine();
        try {
            checker.checkString(value);
        } catch (StringLengthException e) {
            System.out.println(e.getMessage());;
        }
        User user = checker.chekingUser();
        StringBuilder stringBuilder = new StringBuilder();
        if (user != null){
            stringBuilder.append("<" + user.getSurname() +">");
            stringBuilder.append("<" + user.getName() +">");
            stringBuilder.append("<" + user.getPatronymic() +">");
            stringBuilder.append("<" + user.getDateOfBirth() +">");
            stringBuilder.append("<" + user.getPhoneNumber() +">");
            stringBuilder.append("<" + user.getSex() +">");
            FileReaderAndWriter fileReaderWriter = new FileReaderAndWriter();
            fileReaderWriter.writeFile(user.getSurname(), stringBuilder);
        }

    }
}
