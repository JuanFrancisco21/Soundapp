package Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="conns")
@XmlAccessorType(XmlAccessType.FIELD)
public class Conection{
    
    private String server;
    private String database;
    private String userName;
    private String password;
    
    public Conection(Conection a){

        this.server=a.getServer();
        this.database=a.getDatabase();
        this.userName=a.getUserName();
        this.password=a.getPassword();
    }
   
    public Conection() {
    	this.server="";
        this.database="";
        this.userName="";
        this.password="";
	}
    public Conection(String server, String database, String userName, String password) {
		this.server = server;
		this.database = database;
		this.userName = userName;
		this.password = password;
	}
  
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Connection{" + ", server=" + server +", database=" + database + ", userName=" + userName + ", password=" + password + '}';
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((database == null) ? 0 : database.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conection other = (Conection) obj;
		if (database == null) {
			if (other.database != null)
				return false;
		} else if (!database.equals(other.database))
			return false;
		return true;
	}

}
