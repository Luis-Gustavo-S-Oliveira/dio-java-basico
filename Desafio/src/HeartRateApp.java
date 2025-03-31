
import java.util.Scanner;

class HeartRates {
private String firstName;
private String lastName;
private int birthMonth;
private int birthDay;
private int birthYear;

// Construtor
public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
this.firstName = firstName;
this.lastName = lastName;
this.birthMonth = birthMonth;
this.birthDay = birthDay;
this.birthYear = birthYear;
}

// Métodos set e get
public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public int getBirthMonth() {
return birthMonth;
}

public void setBirthMonth(int birthMonth) {
this.birthMonth = birthMonth;
}

public int getBirthDay() {
return birthDay;
}

public void setBirthDay(int birthDay) {
this.birthDay = birthDay;
}

public int getBirthYear() {
return birthYear;
}

public void setBirthYear(int birthYear) {
this.birthYear = birthYear;
}

// Método para calcular a idade
public int calculateAge() {
int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
return currentYear - birthYear;
}

// Método para calcular a frequência cardíaca máxima
public int calculateMaxHeartRate() {
return 220 - calculateAge();
}

// Método para calcular a frequência cardíaca alvo
public String calculateTargetHeartRate() {
int maxHeartRate = calculateMaxHeartRate();
int lowerBound = (int) (maxHeartRate * 0.50);
int upperBound = (int) (maxHeartRate * 0.85);
return lowerBound + " - " + upperBound;
}
}

public class HeartRateApp {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Solicitar informações da pessoa
System.out.print("Digite o primeiro nome: ");
String firstName = scanner.nextLine();

System.out.print("Digite o sobrenome: ");
String lastName = scanner.nextLine();

System.out.print("Digite o mês de nascimento (1-12): ");
int birthMonth = scanner.nextInt();

System.out.print("Digite o dia de nascimento: ");
int birthDay = scanner.nextInt();

System.out.print("Digite o ano de nascimento: ");
int birthYear = scanner.nextInt();

// Instanciar objeto da classe HeartRates
HeartRates person = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

// Imprimir informações
System.out.println("\nInformações da Pessoa:");
System.out.println("Nome: " + person.getFirstName() + " " + person.getLastName());
System.out.println("Data de Nascimento: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
System.out.println("Idade: " + person.calculateAge() + " anos");
System.out.println("Frequência Cardíaca Máxima: " + person.calculateMaxHeartRate() + " bpm");

}
}
