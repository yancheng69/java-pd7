class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(collegeCredit("MKUFCE1"));
    print(collegeCredit("MKUFC1"));
    print(getCounsoler("1D0"));
    print(getCounsoler("D10"));
    print(getCounsoler("1Z0"));
    print(imageType("firstQuarter.png"));
    print(imageType("StudentList.PdF"));
    print(imageType("building.photo.JPEG"));
  }

  // The sixth character is at index 5.
  boolean collegeCredit(String courseCode) {
    if (courseCode == null || courseCode.length() < 6) {
      return false;
    }
    String sixth = courseCode.substring(5, 6);
    return sixth.equals("E") || sixth.equals("M");
  }

  // Official classes have three characters, such as D10 or 1D0.
  String getCounsoler(String officialClass) {
    if (officialClass == null || officialClass.length() != 3) {
      return "Unknown";
    }
    String first = officialClass.substring(0, 1);
    String middle = officialClass.substring(1, 2);
    if (first.equals("B") || middle.equals("B")) return "Berrouet";
    else if (first.equals("C") || middle.equals("C")) return "Chu";
    else if (first.equals("D") || middle.equals("D")) return "Dinn";
    else if (first.equals("E") || middle.equals("E")) return "Eyzengart";
    else if (first.equals("F") || middle.equals("F")) return "Flores";
    else if (first.equals("G") || middle.equals("G")) return "Gibson";
    else if (first.equals("L") || middle.equals("L")) return "Shim Lee";
    else if (first.equals("M") || middle.equals("M")) return "Meltzer";
    else if (first.equals("P") || middle.equals("P")) return "Paccione";
    else if (first.equals("S") || middle.equals("S")) return "Fiore";
    else if (first.equals("T") || middle.equals("T")) return "Tsai";
    else if (first.equals("Z") || middle.equals("Z")) return "Zayes";
    else return "Unknown";
  }

  String imageType(String fileName) {
    if (fileName == null) return "Unknown file type";
    int dot = fileName.lastIndexOf(".");
    if (dot < 0 || dot == fileName.length() - 1) return "Unknown file type";
    String extension = fileName.substring(dot + 1);
    if (extension.equalsIgnoreCase("JPEG") || extension.equalsIgnoreCase("JPG")) {
      return "Joint Photographic Experts Group";
    } else if (extension.equalsIgnoreCase("PNG")) {
      return "Portable Network Graphics";
    } else if (extension.equalsIgnoreCase("GIF")) {
      return "Graphics Interchange Format";
    } else if (extension.equalsIgnoreCase("PDF")) {
      return "Portable Document Format";
    } else {
      return "Unknown file type";
    }
  }
}
