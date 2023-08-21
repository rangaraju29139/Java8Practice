package org.example.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class User{
    private int id;
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
class UserDTO{

    private int id;
    private String username;


    public UserDTO(int id, String username) {
        this.id = id;
        this.username = username;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +

                '}';
    }

}
public class StreamMapCollectExample {
    public static void main(String[] args) {
        List<User>  users = new ArrayList<>();
        users.add(new User(1,"rangaraju1","password"));
        users.add(new User(2,"rangaraju2","password"));
        users.add(new User(3,"rangaraju3","password"));
        users.add(new User(4,"rangaraju4","password"));
        users.add(new User(5,"rangaraju5","password"));


       List<UserDTO> usersDTO = new ArrayList<>();
       UserDTO dto = null;


        for(User user : users){
            dto = new UserDTO(user.getId(), user.getUsername());
            usersDTO.add(dto);
        }
        for (UserDTO udto : usersDTO){
            System.out.println(udto);
        }


        // using stream map

        //using the functional interface
       List<UserDTO> usersMapDTO =  users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(),user.getUsername());
            }
        }).collect(Collectors.toList());

        System.out.println(usersMapDTO);

        List<UserDTO> usersMapDTOLambda =  users.stream().map((user) ->  new UserDTO(user.getId(),user.getUsername())

        ).collect(Collectors.toList());

        System.out.println(usersMapDTOLambda);


    }
}
