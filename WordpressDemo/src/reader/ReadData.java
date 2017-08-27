package reader;

import java.io.IOException;

import util.DataReader;

public class ReadData {
	
	DataReader dataReader = new DataReader();
	
	public String[][] getLogInDataFromExcelFile()throws IOException{
        String path = System.getProperty("user.dir")+"\\data\\login.xlsx";
        String[][] logInData = dataReader.fileReader1(path);
        return logInData;
    }

}
