/*
class Person{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名："+name+",年龄："+age);
    }
}
public class k1{
    public static void main(String[] args) {
        Person per1=null;
        Person per2=null;
        per1=new Person();
        per2=new Person();
        per1.name="张三";
        per1.age=20;
        per2.name="李四";
        per2.age=19;
        System.out.print("per1对象中的内容-->");
        per1.tell();
        System.out.print("per2对象中的内容-->");
        per2.tell();
    }
}
*/
/*
class Person {
    public Person() {
        System.out.println("一个新的person对象产生。");
    }
}
public class k1 {
    public static void main(String[] args) {
        System.out.println("声明对象：Person per=null;");
        Person per=null;
        System.out.println("实例化对象：per=new Person();");
        per=new Person();
    }
}*/
/*class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public void tell(){
        System.out.println("姓名："+getName()+"，年龄："+getAge());
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        if (a>=0&&a<150){
            age=a;
        }
    }
}
public class k1{
    public static void main(String[] args) {
            Person per=new Person("张三",30);
            per.tell();
    }
}*/
/*
class Person{
    private String name;
    private int age;
    public Person(){ }
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public void tell(){
        System.out.println("姓名："+getName()+"，年龄："+getAge());
    }
    public String getName() {
        return name;
    }

    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a) {
        if (a >= 0 && a < 150) {
            age = a;
        }
    }
}
public class k1{
    public static void main(String[] args) {
        new Person("张三",30).tell();
    }
}*/


/*
class Student {
    private String stuno;
    private String name;
    private float math;
    private float english;
    private float computer;
    public Student() {
    }
public Student(String stuno,String name,float math,float english,float computer) {
    this.setStuno(stuno);
    this.setName(name);
    this.setMath(math);
    this.setEnglish(english);
    this.setCompter(computer);
}
public void setStuno(String s){
    stuno=s;
}
public void setName(String n){
    name=n;
}
public void setMath(float m){
    math=m;
}
public void setEnglish(float e){
    english=e;
}
public void setCompter(float c){
    computer=c;
}
public String getStuno(){
    return stuno;
}
public String getName(){
    return name;
}
public float getMath(){
    return math;
}
public float getEnglish(){
    return english;
}
public float getComputer(){
    return computer;
}
public float sum(){
    return math+english+computer;
}
public float avg(){
    return this.sum()/3;
}
public float max(){
    float max=math;
    max=max>computer?max:computer;
    max=max>english?max:english;
    return max;
}
public float min(){
    float min=math;
    min=min<computer?min:computer;
    min=min<english?min:english;
    return min;
}
};
public class k1{
    public static void main(String[] args) {
        Student stu=null;
        stu=new Student("MLDN-33","李兴华",95.0f,89.0f,96.0f);
        System.out.println("学生编号："+stu.getStuno());
        System.out.println("学生姓名："+stu.getName());
        System.out.println("数学成绩："+stu.getMath());
        System.out.println("英语成绩："+stu.getEnglish());
        System.out.println("计算机成绩："+stu.getComputer());
        System.out.println("最高分："+stu.max());
        System.out.println("最低分："+stu.min());
    }
}
*/
/*
class Demo{
    int temp=30;
}
public class k1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.temp = 50;
        System.out.println("fun()方法调用之前：" + d1.temp);
        fun(d1);
        System.out.println("fun()方法调用之后：" + d1.temp);
    }

    public static void fun(Demo d2) {
        d2.temp = 1000;
    }
}*/
class Person {
    private String name;
    private int age;
    private Book1 book1;
    private Person child;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public Book1 getBook1() {
        return book1;
    }

    public void setBook1(Book1 b) {
        book1 = b;
    }

    public Person getChild() {
        return child;
    }

    public void setChild(Person child) {
        this.child = child;
    }
}
    class Book1 {
        private String title;
        private float price;
        private Person person;
        public Book1(String title,float price){
            this.setTitle(title);
            this.setPrice(price);
        }
        public String getTitle(){
            return title;
        }
        public void setTitle(String t){
            title=t;
        }
        public float getPrice(){
            return price;
        }
        public void setPrice(float p){
            price=p;
        }
        public Person getPerson(){
            return person;
        }
        public void setPerson(Person person){
            this.person=person;
        }
    }

public class k1{
    public static void main(String[] args) {
        Person per=new Person("张三",30);
        Person cld=new Person("张超",10);
        Book1 bk=new Book1("JAVA SE核心开发",90.0f);
        Book1 b=new Book1("一千零一夜",30.f);
        per.setBook1(bk);
        bk.setPerson(per);
        cld.setBook1(b);
        b.setPerson(cld);
        per.setChild(cld);
        System.out.println("从人找到书-->姓名："+per.getName()+"；年龄："+per.getAge()+"；书名："+per.getBook1().getTitle()+"；价格："+per.getBook1().getPrice());
        System.out.println("从书找到人-->书名："+per.getBook1().getTitle()+"；价格："+per.getBook1().getPrice()+"；姓名："+per.getName()+"；年龄："+per.getAge());
        System.out.println(per.getChild()+"的孩子"+per.getChild().getName()+"；年龄："+per.getChild().getAge()+"；书名："+per.getChild().getBook1().getTitle()+"；价格："+per.getChild().getBook1().getPrice());
        System.out.println(per.getName());
    }
}