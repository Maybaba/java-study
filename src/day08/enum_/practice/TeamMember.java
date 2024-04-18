package day08.enum_.practice;

    public class  TeamMember { // TeamMember class: 팀원의 이름과 역할을 관리
        private String name;
        private TeamRole role;

        public TeamMember(String name, TeamRole role) {
            this.name = name;
            this.role = role;
        }
    }
    public void assignTask() {
        System.out.printf("%s is assigned to %s\n", this.name, this.role.getDescription());
    }

