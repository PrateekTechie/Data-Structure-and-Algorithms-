package opps;
public class staticnew {
    public static void main(String args[]) {

        student s1 = new student();
        s1.schoolname = "hansraj public school";

        student s2 = new student();
        System.out.println("school name is " + s2.schoolname);
        
        
    }
}
class student {
   static int returnpercentage(int maths,int phy,int chem) {
        return (maths+phy+chem) /3;
    }
  String name;
  int roll;

  static String schoolname;
  void setname(String name) {
    this.name = name;
  }
  String getname() {
    return this.name;
  }

}