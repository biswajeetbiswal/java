class InvalidAgeException extends Exception {
  InvalidAgeException(String msg) {
    System.out.println(msg);
  }
}

class Test {
  public static void main(String args[]) 
   {
    try {
      Vote(12);
    } catch (Exception e) {
      System.out.println("Eligible for vote");
    }
  }

  public static void Vote(int age) throws InvalidAgeException {
    // int age;
    if (age < 18) {
       new InvalidAgeException("Not eligible for vote");
    } else {
      System.out.println("eligible for vote");
    }
  }
}