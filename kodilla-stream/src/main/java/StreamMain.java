

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForum = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex()== 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getBirthdayDate().getYear() >=20)
                .filter(forumUser -> forumUser.getNumberOfPosts()>= 1)
                .collect(Collectors.toMap(ForumUser::getNumberID, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForum.size());
        theResultMapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }




}





