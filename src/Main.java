import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Joe", "Doh", 56);
        User u2 = new User("Jurgen", "Holler", 54);


//        List<User> users = new ArrayList<>();
//        users.add(u1);
//        users.add(u2);
//        users.add(u2);

//        System.out.println(users.indexOf(u1));
//        System.out.println(users.remove(0));
//        System.out.println(users.remove(u2));
//        System.out.println(users.contains(u2));


        //users.forEach(System.out::println);

//        for (User u: users) {
//            System.out.println(u);
//        }
//
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i));
//        }


//        System.out.println();
//
//        LinkedList<User> linkedList = new LinkedList<>();
//        linkedList.add(u2);
//        linkedList.add(u1);
//        linkedList.add(u2);
//
//        linkedList.forEach(System.out::println);
//        for (User u: linkedList){
//            System.out.println(u);
//        }
//
//        Iterator<User> iterator = linkedList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
////        linkedList.add(u1);
//
//
//        Map emptyMap = Collections.EMPTY_MAP;




        //Collections.sort(users, new UserComparator());

//
//        Collections.sort(users,
//                Comparator.comparingInt(User::getAge).reversed().
//                        thenComparing(User::getFirstName).thenComparing());
//        users.forEach(System.out::println);
//        HashMap<String, User> map = new HashMap<>();
//        for (User u : users) {
//            UUID uuid = UUID.randomUUID();
//            map.put(uuid.toString(), u);
//
//
//
//        }
//        map.put("1", new User("dima", "khatsko", 29));
//
//        for (String s: map.keySet()
//             ) {
//            System.out.println(map.get(s));
//        }
//
//
//        map.forEach((s, user) -> {
//            System.out.println(s + ": " + user);
//        });
//
//
//        Set<User> set = new HashSet<>();
//
//
//        set.add(u1);
//        set.add(u2);
//
//        for (User user : set) {
//            System.out.println(user);
//        }
//
//        set.forEach(System.out::println);

//        Box box = new Box(10, 10, 10);
//        List<Object> content = box.getContent();
//        content.add(new Box(1,1,1));
//        content.add("String");
//        content.add(4);


        Box<Cat> cats = new Box<>(10,2,20);
        cats.getContent().add(new Cat("t1"));
        cats.getContent().add(new Cat("t2"));
        cats.getContent().add(new Cat("t3"));

        Box<Dog> dogs = new Box<>(10,10,10);
        dogs.getContent().add(new Dog("dsdf"));

        Box<Animal> animalBox = new Box<>(10,101,10);
        animalBox.getContent().add(new Cat("sdd"));
        animalBox.getContent().add(new Dog("wedsdf"));


        for (Animal a: animalBox.getContent()
             ) {
            System.out.println(a);
            if (a instanceof Dog) {
                System.out.println("Кличка" + ((Dog) a).getOwner());
            } else {
                System.out.println("cat's name" + ((Cat)a).getName() );
            }
            a.voice();
        }

        Box<Test> testBox = new Box<>(10,1010,10);


//        for (Cat cat: cats.getContent()
//             ) {
//            System.out.println(cat);
//        }



    }
}