public class Main {

    static class Sport {
        private String name;
        private String type;
        private int popularity;

        public Sport(String name, String type, int popularity) {
            this.name = name;
            this.type = type;
            this.popularity = popularity;
        }

        public Sport() {}

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public int getPopularity() {
            return popularity;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPopularity(int popularity) {
            this.popularity = popularity;
        }

        public void printInfo() {
            System.out.println("Sport: " + name + ", Type: " + type + ", Popularity: " + popularity);
        }
    }

    static class Athlete {
        private String name;
        private int age;
        private Sport sport;

        public Athlete(String name, int age, Sport sport) {
            this.name = name;
            this.age = age;
            this.sport = sport;
        }

        public Athlete() {}

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Sport getSport() {
            return sport;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSport(Sport sport) {
            this.sport = sport;
        }

        public void printInfo() {
            System.out.println("Athlete: " + name + ", Age: " + age + ", Sport: " + sport.getName());
        }
    }

    static class SportsClub {
        private String clubName;
        private String location;
        private int members;

        public SportsClub(String clubName, String location, int members) {
            this.clubName = clubName;
            this.location = location;
            this.members = members;
        }

        public SportsClub() {}

        public String getClubName() {
            return clubName;
        }

        public String getLocation() {
            return location;
        }

        public int getMembers() {
            return members;
        }

        public void setClubName(String clubName) {
            this.clubName = clubName;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setMembers(int members) {
            this.members = members;
        }

        public void printInfo() {
            System.out.println("SportsClub: " + clubName + ", Location: " + location + ", Members: " + members);
        }
    }

    public static void main(String[] args) {

        Sport football = new Sport("Football", "Team", 95);
        Sport boxing = new Sport("Boxing", "Individual", 88);

        Athlete athlete1 = new Athlete("John", 22, football);
        Athlete athlete2 = new Athlete("Mike", 28, boxing);

        SportsClub club = new SportsClub("Olympic Club", "Almaty", 150);

        football.printInfo();
        boxing.printInfo();

        athlete1.printInfo();
        athlete2.printInfo();

        club.printInfo();
    }
}
