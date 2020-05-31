package registration.registration.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="registration")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="user_id")
    private Integer id;
    @Column(name ="idnumber")
    private Integer idNumber;
    @Column(name ="first_name")
    private String fName;
    @Column(name="last_name")
    private String lName;

    public User(){}

    public User(Integer idNumber, String fName, String lName){
        this.idNumber = idNumber;
        this.fName = fName;
        this.lName = lName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", idNumber=" + idNumber +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
