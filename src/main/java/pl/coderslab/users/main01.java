package pl.coderslab.users;

public class main01 {
    public static void main(String[]args){
        UserDAO userDao = new UserDAO();
        System.out.println(userDao.findAll());
        User user = new User();
        user.setId(10);
        user.setPassword("zupa");
        user.setUserName("zmora");
        user.setEmail("kolej");
        userDao.updateUser(user);

    }
}

