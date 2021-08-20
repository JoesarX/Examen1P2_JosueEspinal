
package examen1p2_josueespinal;

import java.util.ArrayList;

public class Usuarios {
    private String user;
    private String password;
    private ArrayList<Contenido> subscription = new ArrayList<Contenido>(); 

    public Usuarios() {
    }

    public Usuarios(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Contenido> getSubscription() {
        return subscription;
    }

    public void setSubscription(Contenido subscription) {
        this.subscription.add(subscription);
    }

    @Override
    public String toString() {
        return "Usuarios{" + "user=" + user + ", password=" + password + ", subscription=" + subscription + '}';
    }
   
}
