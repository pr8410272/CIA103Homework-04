package HW7;

import java.io.*;

public class Q4Q5CatAndDog {
	public static void main(String[] args) throws Exception{
	 File myFile = new File("C:\\data");
	 myFile.mkdir();
	 File mySer = new File("C:\\data\\Object.ser");
	 mySer.createNewFile();
	 try {
	File file2 = new File("C:\\data\\Object.ser");
	 FileOutputStream fos = new FileOutputStream(file2);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Pet[] PetArray = new Pet[4];
		PetArray[0] = new Cat("Cat's Name0");
		PetArray[1] = new Cat("Cat's Name1");
		PetArray[2] = new Dog("Dog's Name0");
		PetArray[3] = new Dog("Dog's Name1");
		for (int i = 0; i < PetArray.length; i++)
			oos.writeObject(PetArray[i]);
		oos.close();
		fos.close();}
	 	catch (IOException e) {
			System.err.println(e);
	}
	 File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		try {
			while (true) {
				((Pet)ois.readObject()).speak();
				System.out.println("--------------------");
			}
			}
			catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		ois.close();
		fis.close();
			}
	}
}
