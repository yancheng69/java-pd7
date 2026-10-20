class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(creditCardType("4111111111111111"));
    print(creditCardType("340000000000000"));
    print(creditCardType("36000000000000"));
    print(creditCardType("5100000000000000"));
    print(creditCardType("6011000000000000"));
    print(pigLatin("pig"));
    print(nycLocate("10001"));
    print(nycLocate("11201"));
    print(getMonth("07/21/2023"));
    print(validatePswd("Ab12!"));
    print(validatePswd("Ab12^"));
  }

  // Prefixes and names follow Challenges.txt, including 51 OR 55.
  String creditCardType(String cardNumber) {
    if (cardNumber == null || cardNumber.length() == 0) return "Unknown";
    if (cardNumber.startsWith("4")) return "Visa";
    else if (cardNumber.startsWith("34") || cardNumber.startsWith("37")) {
      return "America Express";
    } else if (cardNumber.startsWith("36")) return "Diner Club";
    else if (cardNumber.startsWith("51") || cardNumber.startsWith("55")) {
      return "Mastercard";
    } else if (cardNumber.startsWith("6011") || cardNumber.startsWith("65")) {
      return "Discovery";
    } else return "Unknown";
  }

  String pigLatin(String word) {
    if (word == null || word.length() == 0) return "";
    return word.substring(1) + word.substring(0, 1) + "ay";
  }

  String nycLocate(String zipCode) {
    if (zipCode == null || zipCode.length() < 3) return "Unknown";
    String prefix = zipCode.substring(0, 3);
    if (prefix.equals("100") || prefix.equals("101") || prefix.equals("102")) {
      return "Manhattan";
    } else if (prefix.equals("103")) return "Staten Island";
    else if (prefix.equals("104")) return "Bronx";
    else if (prefix.equals("112")) return "Brooklyn";
    else if (prefix.equals("113") || prefix.equals("114") || prefix.equals("111")) {
      return "Queens";
    } else return "Unknown";
  }

  String getMonth(String date) {
    if (date == null || date.length() != 10
        || !date.substring(2, 3).equals("/")
        || !date.substring(5, 6).equals("/")) return "Unknown";
    String month = date.substring(0, 2);
    if (month.equals("01")) return "January";
    else if (month.equals("02")) return "February";
    else if (month.equals("03")) return "March";
    else if (month.equals("04")) return "April";
    else if (month.equals("05")) return "May";
    else if (month.equals("06")) return "June";
    else if (month.equals("07")) return "July";
    else if (month.equals("08")) return "August";
    else if (month.equals("09")) return "September";
    else if (month.equals("10")) return "October";
    else if (month.equals("11")) return "November";
    else if (month.equals("12")) return "December";
    else return "Unknown";
  }

  boolean validatePswd(String password) {
    return password != null && password.length() >= 5 && password.length() <= 8
        && password.indexOf("^") == -1 && password.indexOf("*") == -1
        && password.indexOf("(") == -1 && password.indexOf(")") == -1;
  }
}
