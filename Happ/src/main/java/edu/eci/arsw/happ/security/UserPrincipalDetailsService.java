package edu.eci.arsw.happ.security;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.eci.arsw.happ.model.User;

@Service
public class UserPrincipalDetailsService implements UserService {

    private UserService userPersistence;
    @Autowired
    private DataSource dataSource;

    public UserPrincipalDetailsService(UserService userRepository) {
        this.userPersistence = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String query = "SELECT * FROM user where  username='"+s+"';";
        User user = new User();
        Connection connection = null;
        try {
            connection = ((Statement) dataSource).getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int userID =rs.getInt("user_id");
				boolean active= rs.getBoolean("active");
				String email =rs.getString("email");
				String gov_id =rs.getString("gov_id");
				String gov_type =rs.getString("gov_type");
				String password =rs.getString("password");
				String roles =rs.getString("roles");
				String username =rs.getString("username");
                user.setUserId(userID);
                user.setActive(active);
                user.setEmail(email);
                user.setGovId(gov_id);
                user.setGovType(gov_type);
                user.setPassword(password);
                user.setUsername(username);
                user.setRoles(roles);
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
        UserPrincipal userPrincipal = new UserPrincipal(user);

        return userPrincipal;
    }

    @Override
    public List<User> listaUser() {
        String query = "SELECT * FROM user;";
        List<User> nurses = new ArrayList<User>();
        Connection connection = null;
        try {
            connection = ((Statement) dataSource).getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int userID =rs.getInt("users_user_id");
				String name = rs.getString("name");
				boolean active= rs.getBoolean("active");
				String email =rs.getString("email");
				String gov_id =rs.getString("gov_id");
				String gov_type =rs.getString("gov_type");
				String password =rs.getString("password");
				String roles =rs.getString("roles");
				String username =rs.getString("username");
				User user = new User();
				nurses.add(user);
			}
			connection.close();
			return nurses;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
    }
}