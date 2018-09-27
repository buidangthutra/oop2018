package week2.task3;

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
public class Task3 {
    //public static void main(String[] args) {
    //   pet dog = new pet();
    //}
    
}

class pet{
    private String animals;
    private int age;
    private String color;
     // khởi tạo set và get của animals
     void setteranimals(String an){
          animals = an;
      }
      String getteranimals(){
           return animals;
      }
     // khởi tạo set và get của age
       void setterage(int ag){
          age = ag;
      }
    int getterage(){
           return age;
      }
      // khởi tạo set và get của color
       void settercolor(String co){
          color = co;
      }
    String getter(){
           return color;
    }
    // hàm đưa ra tiếng kêu của động vật
    public String sound(){
    String s = "My boss!!";
            return s;
}
    // hàm đưa ra thức ăn phù hợp với từng con vật
    public void eat(String animals) {
        switch(animals){
            case "dog": System.out.println("eat rice");
            case "cat": System.out.println("eat fish");
            case "pig": System.out.println("eat bread");
            case "cow": System.out.println("eat grass");
        }
    }
    // hàm đưa ra số tuổi hông minh của animals
    public void ageLavel(int age) {
        if(age >3) System.out.println("Your dog is very laval.");
        else System.out.println("you need to take care it more.");
    }
}

class learLang{
    private String language;
    private String goal;
    private String slogan;
    // khởi tạo set và get của Language
    void setterLanguage(String lang){
        language= lang;
    }
    String getterLanguage(){
          return language;
      }
    // khởi tạo set và get của goal
      void settergoal(String go){
          goal = go;
      }
      String gettergoal(){
          return goal;
      }
      // khởi tạo set và get của slogan
       void setterslogan(String lo){
          slogan = lo;
      }
     String getterslogan(){
          return slogan;
      }
    // hàm nhập thời gian luyện tập theo tháng và đưa gợi ý tiến trình học
    void TestLevel(int time) {
        if(time <3) System.out.println("excercise more");
        else if(time > 3 ) System.out.println("Test level 1");
        else if(time >6) System.out.println("examation");
    }
    // in ra các kỹ năng đi kèm khi học
    void skill() {
        System.out.println("you must be have teamwork skills and leader skills");
    }
    // Hàm khich chúc mừng khi đạt đuoc điểm thi
    String encourage(int mark){
        if(mark >= 6) return "Congrulation!";
        else return "Well done";
    }
}

class Sibling{
    private String mySister;
    private int age;
    private String look;
    // khai bái set và get của mySister 
    void setterMySister(String name){
        mySister = name;
    }
    
      String getterMySister(){
          return mySister;
      }
      // khai bao set và get của tuổi
      void setterAge(int ag){
        age = ag;
    }
    
    int getterAge(){
          return age;
      }
      // khai báo set và get của look 
      void setterLook(String lo){
        look = lo;
    }
    
      String getterLook(){
          return look;
      }
    // Kỹ năng mềm yêu thích
    void favour() {
        System.out.println("She realy loves dance and singing");
    }
    //Tôi hơn em gái tôi bao nhiêu tuổi
    int moreAge(int ag) {
        return (ag-age);
    }
    //môn học yêu thích
    void subject(){
        System.out.println("her favourit subject is math");
    }
}
