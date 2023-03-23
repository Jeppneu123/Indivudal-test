import java.util.ArrayList;

public class Team {
    private ArrayList<TeamMember> members = new ArrayList<>();

    public void addTeamMember(TeamMember m)
    {
        members.add(m);
    }

    public boolean removeTeamMember(TeamMember m)
    {
        if (members.remove(m)){
            return true;
        } else {
            return false;
        }
    }
}
