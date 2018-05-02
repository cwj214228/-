package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import View.A1;
import View.Student;

import database.ModelFactory;
import database.student;
import database.teacher;

public class Server implements Protocal,Serializable{
	ObjectInputStream ois;
	ObjectOutputStream oos;
	ServerSocket ss;
	Socket s;
	public Server() throws Exception{
		int port =13088;
		ss=new ServerSocket(port);
		while(true){
			student stu=null;
			teacher t=null;
			s=ss.accept();
			ois=new ObjectInputStream(s.getInputStream());
			oos=new ObjectOutputStream(s.getOutputStream());
			int choice=ois.readInt();
			if(choice==SLOGIN){
			String name=ois.readUTF();
			String pw=ois.readUTF();
			stu=ModelFactory.slogin(name, pw);
			oos.writeObject(stu);
			oos.flush();
			}else if(choice==TLOGIN){
				String name=ois.readUTF();
				String pw=ois.readUTF();
				t=ModelFactory.tlogin(name, pw);
				oos.writeObject(t);
				oos.flush();
			}
		}
	}
	public static void main(String[] args) throws Exception {
		try {
			new Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
