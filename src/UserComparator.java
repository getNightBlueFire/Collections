import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {

        return o1.getFirstName().compareTo(o2.getFirstName());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
