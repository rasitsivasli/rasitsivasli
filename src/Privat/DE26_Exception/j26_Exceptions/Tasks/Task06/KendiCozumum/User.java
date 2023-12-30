package Privat.DE26_Exception.j26_Exceptions.Tasks.Task06.KendiCozumum;

public class User {
/*     1- filedları id, username, password, active (boolean), signedIn (boolean)
        olan User isimli bir pojo class create ediniz.

     4- UserMain isminde main için bir class create ediniz.
     5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
        active ve signedIn default olarak true, false atayabilirsiniz.
        id yi sistem otomatik versin.,
     6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
        6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.*/

    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}

