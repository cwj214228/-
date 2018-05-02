package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

import database.student;
import database.teacher;

import View.Student;
import View.Teacher;

public class Client implements Protocal,Serializable{
	ObjectOutputStream oos;
	ObjectInputStream ois;
	Socket s;
	public Client() throws IOException{
		String ip="127.0.0.1";
		int port =13088;
		s=new Socket(ip,port);
		oos=new ObjectOutputStream(s.getOutputStream());
		ois=new ObjectInputStream(s.getInputStream());
	}
	public student slogin(String name,String pw) throws IOException, ClassNotFoundException{
		oos.writeInt(SLOGIN);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		student stu=(student)ois.readObject();
		return stu;
	}
	public teacher tlogin(String name,String pw) throws IOException, ClassNotFoundException{
		oos.writeInt(TLOGIN);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		teacher t=(teacher)ois.readObject();
		return t;
	}
}
