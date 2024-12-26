import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Club {
    private int id;
    private String name;
    private List<User> members;

    public Club(int id, String name) {
        this.id = id;
        this.name = name;
        this.members = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addMember(User user) {
        members.add(user);
        System.out.println(user.getName() + "님이 " + name + " 동아리에 가입되었습니다.");
    }

    public List<User> getMembers() {
        return members;
    }
}

class ClubManager {
    private List<Club> clubs;

    public ClubManager() {
        clubs = new ArrayList<>();
        // 샘플 동아리 추가
        clubs.add(new Club(1, "프로그래밍 동아리"));
        clubs.add(new Club(2, "음악 동아리"));
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void joinClub(int clubId, User user) {
        for (Club club : clubs) {
            if (club.getId() == clubId) {
                club.addMember(user);
                return;
            }
        }
        System.out.println("해당 동아리를 찾을 수 없습니다.");
    }
}