package data;

import sun.util.resources.cldr.pl.TimeZoneNames_pl;

import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDTO implements Serializable, IUserDTO {

    private static final long serialVersionUID = 4545864587995944260L;
    private int	userId;
    private String userName;
    private String cpr;
    private String password;
    private String ini;
    private List<String> roles;

    public UserDTO(int userID, String userName, String cpr, String ini, List<String> roles, String password) {
        this.userId = userID;
        this.cpr = cpr;
        this.password = password;
        this.userName = userName;
        this.ini = ini;
        this.roles = roles;
    }

    public UserDTO() {
        roles = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getIni() {
        return ini;
    }
    public void setIni(String ini) {
        this.ini = ini;
    }

    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void addRole(String role) {
        this.roles.add(role);
    }
    /**
     *
     * @param role
     * @return true if role existed, false if not
     */
    public boolean removeRole(String role){
        return this.roles.remove(role);
    }

    @Override
    public String toString() {
        return "[userId = " + userId + ", userName = " + userName + ", ini = " + ini + ", roles = " + roles + ", Password = " + password + ", CPR = " + cpr + "]";
    }


}
