package main.code;
public class EmailServiceProvider implements MessageServiceProvider {
  public void sendMessage(String message) {
    System.out.println("Sending Email with Message = " + message);
  }
}