package collections;

public class Role {
 private String roleName;
 private String roleId;
 
public Role(String roleName, String roleId) {
	this.roleName = roleName;
	this.roleId = roleId;
}

public String getRoleName() {
	return roleName;
}

public void setRoleName(String roleName) {
	this.roleName = roleName;
}

public String getRoleId() {
	return roleId;
}

public void setRoleId(String roleId) {
	this.roleId = roleId;
}


 
}
