public class Person2 {
    public static void main(String[] args){
        Person Tanes = new Person();
        Tanes.setName("Tanes");
        Tanes.setAge(300);
        System.out.println("Name:" + Tanes.getName() + " \nAge:" + Tanes.getAge());
        Person Javi = new Person("Javier", 19);
        System.out.println("Name:" + Javi.getName() + "\nAge:" + Javi.getAge());
        System.out.println(Tanes.toString());

        if(Tanes.getName().equals(Javi.getName()) && Tanes.getAge()== Javi.getAge()) {
            System.out.println("Their names and ages are the same");
        }else{
             System.out.println("Their names and ages are not the same");
            }
        if (Tanes.getName().equals(Javi.getName())){
            System.out.println("Their names are the same");
        }else{
            System.out.println("Their names are different");
        }
        if (Tanes.getAge() == Javi.getAge()){
            System.out.println("Their ages are the same");
        }else{
            System.out.println("They are not the same age");
        }
        if (Tanes.getAge() > Javi.getAge()){
            System.out.println("Tanes is Older than Javi");
        }else{
            System.out.println("Javi is Older than Tanes");
        }
        if (Tanes.getAge() < Javi.getAge()){
            System.out.println("Tanes is Youunger than Javi");
        }else{
            System.out.println("Javi is Younger than Tanes");
        }
    }
}
